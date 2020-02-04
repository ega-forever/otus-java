package ru.otus.dao;

import ru.otus.model.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public interface UserDao {

    Optional<User> findById(long id);
    Optional<User> findByLogin(String login);
    Optional<Collection<User>> findAll();
    Optional<User> save(User user);
}