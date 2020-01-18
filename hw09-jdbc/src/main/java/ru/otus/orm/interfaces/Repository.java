package ru.otus.orm.interfaces;

import java.sql.SQLException;

public interface Repository<T> {

    void sync() throws SQLException, NoSuchFieldException;
    void insert(T object) throws Exception;
    void update(T object) throws Exception;
    T load(Object id, Class<T> clazz) throws Exception;


}
