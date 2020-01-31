package ru.otus.servlet.admin;

import com.google.gson.Gson;
import ru.otus.dao.UserDao;
import ru.otus.model.User;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;


public class AdminApiUsersServlet extends HttpServlet {

    private final UserDao userDao;
    private final Gson gson;

    public AdminApiUsersServlet(UserDao userDao, Gson gson) {
        this.userDao = userDao;
        this.gson = gson;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Optional<Collection<User>> users = userDao.findAll();

        if(users.isEmpty()){
            users = Optional.of(new ArrayList<>());
        }

        response.setContentType("application/json;charset=UTF-8");
        ServletOutputStream out = response.getOutputStream();
        out.print(gson.toJson(users.get()));
    }

}
