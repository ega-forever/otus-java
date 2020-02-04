package ru.otus.services;

import ru.otus.dao.UserDao;

public class AuthServiceImpl implements AuthService {

    private final UserDao userDao;

    public AuthServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public AuthServiceResult authenticate(String login, String password) {
        return userDao.findByLogin(login)
                .filter(user -> user.password.equals(password))
                .map(user-> new AuthServiceResult(user.id, user.role))
                .orElse(null);
    }

}
