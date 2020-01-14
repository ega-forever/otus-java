package ru.otus.orm;

import ru.otus.orm.annotations.Id;
import ru.otus.orm.annotations.Table;
import ru.otus.orm.interfaces.Repository;
import ru.otus.orm.utils.Utils;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

public class RepositoryImpl<T> implements Repository<T> {

    private Map<Field, Map<String, String>> fields;
    private String tableName;
    private DbExecutor<T> dbExecutor;
    private DataSource dataSource;
    private Field idField;

    public RepositoryImpl(Class<T> clazz, DbExecutor<T> dbExecutor, DataSource dataSource) {
        this.dbExecutor = dbExecutor;
        this.dataSource = dataSource;

        this.tableName = clazz.getAnnotation(Table.class) != null ?
                clazz.getAnnotation(Table.class).name() :
                clazz.getSimpleName();

        this.fields = Utils.objectToMapType(clazz);
        this.idField = this.fields.keySet().stream().filter(f -> f.getAnnotation(Id.class) != null).findFirst().get();
    }


    public void sync() throws SQLException {
        Connection connection = this.dataSource.getConnection();

        List<String> fieldsString = this.fields.keySet().stream().map(field -> {
            StringBuilder builder = new StringBuilder(field.getName())
                    .append(" ").append(this.fields.get(field).get("type"))
                    .append(" (").append(this.fields.get(field).get("size"))
                    .append(" )");

            if (field.equals(this.idField)) {
                builder.append(" auto_increment");
            }
            return builder.toString();
        }).collect(Collectors.toList());
        String fields = String.join(", ", fieldsString);
        String sqlCreateTable = String.format("CREATE TABLE %s (%s)", tableName, fields);

        connection.setAutoCommit(false);
        this.dbExecutor.executeRawQuery(connection, sqlCreateTable);
        connection.commit();
        connection.close();
    }

    public void insert(T object) throws Exception {

        Connection connection = this.dataSource.getConnection();

        List<String> fieldsNamesWithoutId = fields.keySet().stream().filter(f -> !f.equals(idField)).map(Field::getName).collect(Collectors.toList());
        String fieldsNames = String.join(", ", fieldsNamesWithoutId);
        String fieldsValues = fieldsNamesWithoutId.stream().map(k -> "?").collect(Collectors.joining(", "));
        String sqlInsert = String.format("INSERT INTO %s (%s) VALUES(%s)", tableName, fieldsNames, fieldsValues);

        List<String> params = new ArrayList<>();

        for (Field field : this.fields.keySet()) {

            Object val = field.get(object);

            if (field.equals(idField) && field.get(object) == null) {
                continue;
            }

            params.add(val.toString());
        }

        connection.setAutoCommit(false);
        Object id = this.dbExecutor.insertRecord(connection, sqlInsert, params);
        connection.commit();


        if (idField.getType().equals(Long.class)) {
            idField.set(object, id);
        }

        if (idField.getType().equals(Integer.class)) {
            idField.set(object, id);
        }

        if (idField.getType().equals(BigInteger.class)) {
            idField.set(object, BigInteger.valueOf((Long) id));
        }

        connection.close();
    }

    public void update(T object) throws Exception {

        Connection connection = this.dataSource.getConnection();
        List<String> fieldsWithoutId = fields.keySet().stream().filter(f -> !f.equals(idField)).map(f -> f.getName() + " = ?").collect(Collectors.toList());
        String fields = String.join(", ", fieldsWithoutId);
        String sqlUpdate = String.format("UPDATE %s SET %s WHERE %s = ?", tableName, fields, this.idField.getName());

        Object primaryId = this.idField.get(object);

        List<String> params = new ArrayList<>();

        for (Field field : this.fields.keySet()) {
            Object val = field.get(object);

            if (field.equals(this.idField)) {
                continue;
            }

            params.add(val.toString());
        }

        params.add(primaryId.toString());

        connection.setAutoCommit(false);
        this.dbExecutor.updateRecord(connection, sqlUpdate, params);
        connection.commit();
        connection.close();
    }

    public T load(Object id, Class<T> clazz) throws Exception {

        Connection connection = this.dataSource.getConnection();

        Set<String> fieldsWithoutId = fields.keySet().stream().map(Field::getName).collect(Collectors.toSet());
        String fields = String.join(", ", fieldsWithoutId);
        String sqlUpdate = String.format("SELECT %s FROM %s WHERE %s = ?", fields, tableName, this.idField.getName());

        HashMap<String, Object> map = this.dbExecutor.selectRecord(connection, sqlUpdate, id, fieldsWithoutId);
        return (T) this.buildObject(map, clazz);
    }

    private T buildObject(Map<String, Object> map, Class<?> clazz) throws IllegalAccessException, InstantiationException {

        T object = (T) clazz.newInstance();

        for (Field field : this.fields.keySet()) {

            if (field.getType().equals(Long.class)) {
                field.set(object, map.get(field.getName()));
            }

            if (field.getType().equals(String.class)) {
                field.set(object, map.get(field.getName()));
            }

            if (field.getType().equals(Integer.class)) {
                field.set(object, map.get(field.getName()));
            }

            if (field.getType().equals(BigInteger.class)) {
                field.set(object, BigInteger.valueOf((Long) map.get(field.getName())));
            }

        }

        return object;
    }


}
