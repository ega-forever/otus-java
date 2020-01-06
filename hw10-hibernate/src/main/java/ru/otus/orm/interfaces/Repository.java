package ru.otus.orm.interfaces;

public interface Repository<T> {

    void insert(T object) throws Exception;
    void update(T object) throws Exception;
    T load(Object id, Class<T> clazz) throws Exception;
}
