package ru.otus.utils;

import ru.otus.constants.Roles;
import ru.otus.dao.UserDao;
import ru.otus.model.User;

import java.util.Collection;

public class CheckAdmin {

    public static void checkAdmin(UserDao userDao){

        Collection<User> users = userDao.findAll().get();
        if(users.size() != 0)
            return;

        User user = new User(null, "admin", "admin", "admin", Roles.ADMIN.getType());
        userDao.save(user);
    }

}
