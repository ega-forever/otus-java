package ru.otus.dao;

import ru.otus.constants.Roles;
import ru.otus.model.User;

import java.util.*;

public class InMemoryUserDao implements UserDao {

    private final Map<Long, User> users;

    public InMemoryUserDao() {
        users = new HashMap<>();
        users.put(1L, new User(1L, "Крис Гир", "user1", "11111", Roles.USER.getType()));
        users.put(2L, new User(2L, "Ая Кэш", "user2", "11111", Roles.USER.getType()));
        users.put(3L, new User(3L, "Десмин Боргес", "user3", "11111", Roles.USER.getType()));
        users.put(4L, new User(4L, "Кетер Донохью", "user4", "11111", Roles.USER.getType()));
        users.put(5L, new User(5L, "Стивен Шнайдер", "user5", "11111", Roles.USER.getType()));
        users.put(6L, new User(6L, "Джанет Вэрни", "user6", "11111", Roles.USER.getType()));
        users.put(7L, new User(7L, "Брэндон Смит", "user7", "11111", Roles.ADMIN.getType()));
    }

    @Override
    public Optional<User> findById(long id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public Optional<User> findByLogin(String login) {
        return users.values().stream().filter(v -> v.login.equals(login)).findFirst();
    }

    @Override
    public Optional<Collection<User>> findAll() {
        return Optional.of(users.values());
    }

    @Override
    public Optional<User> save(User user) {
        user.id = (long) this.users.keySet().size() + 1;
        this.users.put(user.id, user);
        return Optional.of(user);
    }
}
