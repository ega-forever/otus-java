package ru.otus.orm;

import ru.otus.orm.annotations.Id;
import ru.otus.orm.annotations.Int;
import ru.otus.orm.annotations.Table;
import ru.otus.orm.annotations.Varchar;
import ru.otus.orm.constants.Types;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;

public class Repository<T> {

    private Map<String, String> fields = new HashMap<>();
    private Map<String, Integer> fieldSizes = new HashMap<>();
    private String tableName;
    private Class<T> clazz;
    private DbExecutor<T> dbExecutor;
    private String URL;

    public Repository(Class<T> clazz, String URL) {

        this.dbExecutor = new DbExecutor<T>();
        this.URL = URL;

        this.clazz = clazz;
        this.tableName = clazz.getAnnotation(Table.class) != null ?
                clazz.getAnnotation(Table.class).name() :
                clazz.getSimpleName();


        for (Field field : clazz.getDeclaredFields()) {

            if (field.getAnnotation(Id.class) != null) {
                this.fields.put(field.getName(), Types.LONG.getType());
                this.fieldSizes.put(field.getName(), 10);
            }

            if (field.getAnnotation(Int.class) != null) {
                this.fields.put(field.getName(), Types.INTEGER.getType());
                this.fieldSizes.put(field.getName(), field.getAnnotation(Int.class).size());
            }

            if (field.getAnnotation(Varchar.class) != null) {
                this.fields.put(field.getName(), Types.VARCHAR.getType());
                this.fieldSizes.put(field.getName(), field.getAnnotation(Varchar.class).size());
            }

        }
    }


    public void sync() throws SQLException, NoSuchFieldException {
        Connection connection = DriverManager.getConnection(this.URL);
        StringBuilder sql = new StringBuilder("CREATE TABLE " + this.tableName + " (\n");
        for (Map.Entry<String, String> field : this.fields.entrySet()) {
            sql.append(field.getKey()).append(" ").append(field.getValue());

            if (this.fieldSizes.get(field.getKey()) != null) {
                sql.append("(").append(this.fieldSizes.get(field.getKey())).append(")");


                Field f = this.clazz.getDeclaredField(field.getKey());

                if (f.getAnnotation(Id.class) != null) {
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

        Connection connection = DriverManager.getConnection(this.URL);
        StringBuilder sql = new StringBuilder("INSERT INTO " + this.tableName + " (\n");

        Iterator<Map.Entry<String, String>> tableFieldIterator = this.fields.entrySet().iterator();

        while (tableFieldIterator.hasNext()) {

            Map.Entry<String, String> entry = tableFieldIterator.next();
            Field field = object.getClass().getDeclaredField(entry.getKey());

            if (field.getAnnotation(Id.class) != null && field.get(object) == null) {
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

            if (field.getAnnotation(Id.class) != null && field.get(object) == null) {
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

            if (field.getAnnotation(Id.class) != null && field.get(object) == null) {
                continue;
            }

            params.add(val.toString());

          /*      if (fieldEntry.getValue().equals(Types.INTEGER.getType())) {
                   // pst.setInt(paramIndex, (Integer) val);
                }

                if (fieldEntry.getValue().equals(Types.VARCHAR.getType())) {
                    pst.setString(paramIndex, (String) val);
                }*/

            //  paramIndex++;

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

        connection.setAutoCommit(false);
        String strId = this.dbExecutor.insertRecord(connection, sql.toString(), params);
        connection.commit();

        Field field = object.getClass().getDeclaredField(optionalIdField.get().getKey());

        if(field.getType().equals(Long.class)){
            field.set(object, Long.parseLong(strId));
        }

        if(field.getType().equals(Integer.class)){
            field.set(object, Integer.parseInt(strId));
        }

        connection.close();
    }

    public void update(T object) throws Exception {

        Connection connection = DriverManager.getConnection(this.URL);
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

        System.out.println(optionalIdField.get().getKey());
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

           /* if (fieldEntry.getValue().equals(Types.INTEGER.getType())) {
                pst.setInt(paramIndex, (Integer) val);
            }

            if (fieldEntry.getValue().equals(Types.VARCHAR.getType())) {
                pst.setString(paramIndex, (String) val);
            }*/

            //   paramIndex++;

        }

        params.add(primaryId.toString());

        connection.setAutoCommit(false);
        this.dbExecutor.updateRecord(connection, sql.toString(), params);
        connection.commit();
        connection.close();
    }

  /*  public void load(Connection connection, long id, Class<T> clazz) throws Exception {

        StringBuilder sql = new StringBuilder("SELECT  ");

        Iterator<Map.Entry<String, String>> tableFieldIterator = this.fields.entrySet().iterator();


        while (tableFieldIterator.hasNext()) {

            Map.Entry<String, String> entry = tableFieldIterator.next();

            sql.append(entry.getKey());

            if (tableFieldIterator.hasNext()) {
                sql.append(",");
            }

        }

        sql.append(" FROM ").append(this.tableName).append("WHERE ");

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

        if(optionalIdField.isEmpty()){
            throw new Exception("no primary field");
        }


        System.out.println(optionalIdField.get().getKey());
        sql.append(optionalIdField.get().getKey()).append(" = ?");

        System.out.println(sql.toString());

        Savepoint savePoint = connection.setSavepoint("savePointName");

        try (PreparedStatement pst = connection.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS)) {

            pst.setLong(1, id);

            try (ResultSet rs = pst.executeQuery()) {
                return Optional.ofNullable(rsHandler.apply(rs));
            }

        } catch (SQLException ex) {
            if (ex.getClass().equals(SQLException.class))
                connection.rollback(savePoint);

            logger.error(ex.getMessage(), ex);
            throw ex;
        }
    }
*/


}
