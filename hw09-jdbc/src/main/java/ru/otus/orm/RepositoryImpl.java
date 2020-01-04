package ru.otus.orm;

import ru.otus.orm.annotations.*;
import ru.otus.orm.constants.Types;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

public class RepositoryImpl<T> {

    private Map<String, String> fields = new HashMap<>();
    private Map<String, Integer> fieldSizes = new HashMap<>();
    private String tableName;
    private Class<T> clazz;
    private DbExecutor<T> dbExecutor;
    private DataSource dataSource;
    private Field idField;

    public RepositoryImpl(Class<T> clazz, DbExecutor<T> dbExecutor, DataSource dataSource) {

        this.dbExecutor = dbExecutor;
        this.dataSource = dataSource;

        this.clazz = clazz;
        this.tableName = clazz.getAnnotation(Table.class) != null ?
                clazz.getAnnotation(Table.class).name() :
                clazz.getSimpleName();


        for (Field field : clazz.getDeclaredFields()) {

            if (field.getAnnotation(BigInt.class) != null) {
                this.fields.put(field.getName(), Types.BIGINTEGER.getType());
                this.fieldSizes.put(field.getName(), field.getAnnotation(BigInt.class).size());
            }

            if (field.getAnnotation(Int.class) != null) {
                this.fields.put(field.getName(), Types.INTEGER.getType());
                this.fieldSizes.put(field.getName(), field.getAnnotation(Int.class).size());
            }

            if (field.getAnnotation(Varchar.class) != null) {
                this.fields.put(field.getName(), Types.VARCHAR.getType());
                this.fieldSizes.put(field.getName(), field.getAnnotation(Varchar.class).size());
            }

            if (field.getAnnotation(Id.class) != null) {
                this.idField = field;
            }

        }
    }


    public void sync() throws SQLException, NoSuchFieldException {
        Connection connection = this.dataSource.getConnection();
        StringBuilder sql = new StringBuilder("CREATE TABLE " + this.tableName + " (\n");
        for (Map.Entry<String, String> field : this.fields.entrySet()) {
            sql.append(field.getKey()).append(" ").append(field.getValue());

            if (this.fieldSizes.get(field.getKey()) != null) {
                sql.append("(").append(this.fieldSizes.get(field.getKey())).append(")");


                Field f = this.clazz.getDeclaredField(field.getKey());

                if (f.equals(this.idField)) {
                    sql.append(" auto_increment,\n");

                } else {
                    sql.append(",\n");
                }


            } else {
                sql.append(",\n");
            }
        }
        sql.append(")");

        connection.setAutoCommit(false);
        this.dbExecutor.executeRawQuery(connection, sql.toString());
        connection.commit();
        connection.close();
    }

    public void insert(T object) throws Exception {

        Connection connection = this.dataSource.getConnection();
        StringBuilder sql = new StringBuilder("INSERT INTO " + this.tableName + " (\n");

        Iterator<Map.Entry<String, String>> tableFieldIterator = this.fields.entrySet().iterator();

        while (tableFieldIterator.hasNext()) {

            Map.Entry<String, String> entry = tableFieldIterator.next();
            Field field = object.getClass().getDeclaredField(entry.getKey());

            if (field.equals(this.idField) && field.get(object) == null) {
                continue;
            }

            sql.append(entry.getKey());

            if (tableFieldIterator.hasNext()) {
                sql.append(",");
            }

        }

        sql.append(") VALUES (");

        tableFieldIterator = this.fields.entrySet().iterator();

        while (tableFieldIterator.hasNext()) {
            Map.Entry<String, String> entry = tableFieldIterator.next();

            Field field = object.getClass().getDeclaredField(entry.getKey());

            if (field.equals(idField) && field.get(object) == null) {
                continue;
            }

            sql.append("?");

            if (tableFieldIterator.hasNext()) {
                sql.append(",");
            }

        }

        sql.append(")");

        List<String> params = new ArrayList<>();

        for (Map.Entry<String, String> fieldEntry : this.fields.entrySet()) {

            Field field = object.getClass().getDeclaredField(fieldEntry.getKey());
            Object val = field.get(object);

            if (field.equals(idField) && field.get(object) == null) {
                continue;
            }

            params.add(val.toString());
        }

        connection.setAutoCommit(false);
        String strId = this.dbExecutor.insertRecord(connection, sql.toString(), params);
        connection.commit();


        if (idField.getType().equals(Long.class)) {
            idField.set(object, Long.parseLong(strId));
        }

        if (idField.getType().equals(Integer.class)) {
            idField.set(object, Integer.parseInt(strId));
        }

        if (idField.getType().equals(BigInteger.class)) {
            idField.set(object, new BigInteger(strId));
        }

        connection.close();
    }

    public void update(T object) throws Exception {

        Connection connection = this.dataSource.getConnection();
        StringBuilder sql = new StringBuilder("UPDATE " + this.tableName + " SET \n");

        Iterator<Map.Entry<String, String>> tableFieldIterator = this.fields.entrySet().iterator();

        while (tableFieldIterator.hasNext()) {

            Map.Entry<String, String> entry = tableFieldIterator.next();
            Field field = object.getClass().getDeclaredField(entry.getKey());

            if (field.getAnnotation(Id.class) != null) {
                continue;
            }

            sql.append(entry.getKey()).append("=").append("?");

            if (tableFieldIterator.hasNext()) {
                sql.append(",");
            }

        }

        Optional<Map.Entry<String, String>> optionalIdField = this.fields.entrySet().stream().filter(elem -> {
            try {
                Field field = object.getClass().getDeclaredField(elem.getKey());
                if (field.getAnnotation(Id.class) != null) {
                    return true;
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

            return false;
        }).findFirst();

        if (optionalIdField.isEmpty()) {
            throw new Exception("no primary field");
        }

        Field primaryIdField = object.getClass().getDeclaredField(optionalIdField.get().getKey());
        Object primaryId = primaryIdField.get(object);

        sql.append(" where ").append(optionalIdField.get().getKey()).append(" = ?");

        List<String> params = new ArrayList<>();

        for (Map.Entry<String, String> fieldEntry : this.fields.entrySet()) {

            Field field = object.getClass().getDeclaredField(fieldEntry.getKey());
            Object val = field.get(object);

            if (field.getAnnotation(Id.class) != null) {
                continue;
            }

            params.add(val.toString());
        }

        params.add(primaryId.toString());

        connection.setAutoCommit(false);
        this.dbExecutor.updateRecord(connection, sql.toString(), params);
        connection.commit();
        connection.close();
    }

    public <T> T load(Object id, Class<T> clazz) throws Exception {

        Connection connection = this.dataSource.getConnection();
        StringBuilder sql = new StringBuilder("SELECT  ");

        Iterator<Map.Entry<String, String>> tableFieldIterator = this.fields.entrySet().iterator();

        while (tableFieldIterator.hasNext()) {

            Map.Entry<String, String> entry = tableFieldIterator.next();

            sql.append(entry.getKey());

            if (tableFieldIterator.hasNext()) {
                sql.append(",");
            }

        }

        sql.append(" FROM ").append(this.tableName).append(" WHERE ");

        Optional<Map.Entry<String, String>> optionalIdField = this.fields.entrySet().stream().filter(elem -> {
            try {
                Field field = clazz.getDeclaredField(elem.getKey());
                if (field.getAnnotation(Id.class) != null) {
                    return true;
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            return false;
        }).findFirst();

        if (optionalIdField.isEmpty()) {
            throw new Exception("no primary field");
        }

        sql.append(optionalIdField.get().getKey()).append(" = ?");

        HashMap<String, String> map = this.dbExecutor.selectRecord(connection, sql.toString(), id, this.fields.keySet());

        T object = clazz.newInstance();

        for (Map.Entry<String, String> entrySet : this.fields.entrySet()) {
            Field field = clazz.getField(entrySet.getKey());

            if (field.getType().equals(Long.class)) {
                field.set(object, Long.parseLong(map.get(entrySet.getKey())));
            }

            if (field.getType().equals(String.class)) {
                field.set(object, map.get(entrySet.getKey()));
            }

            if (field.getType().equals(Integer.class)) {
                field.set(object, Integer.parseInt(map.get(entrySet.getKey())));
            }

            if (field.getType().equals(BigInteger.class)) {
                field.set(object, new BigInteger(map.get(entrySet.getKey())));
            }

        }

        return object;


    }


}
