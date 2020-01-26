package ru.otus.orm.interfaces;

public interface Repository<T> {

    void insert(T object);
    void update(T object);
    T load(Object id, Class<T> clazz);
}
