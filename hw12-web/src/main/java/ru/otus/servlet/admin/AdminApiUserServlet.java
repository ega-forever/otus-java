package ru.otus.servlet.admin;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import ru.otus.dao.UserDao;
import ru.otus.model.User;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;


public class AdminApiUserServlet extends HttpServlet {

    private final UserDao userDao;
    private final Gson gson;

    public AdminApiUserServlet(UserDao userDao, Gson gson) {
        this.userDao = userDao;
        this.gson = gson;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        StringBuffer jb = new StringBuffer();
        String line;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null)
                jb.append(line);
        } catch (Exception e) { /*report an error*/ }

        JsonParser parser = new JsonParser();
        JsonObject o = parser.parse(jb.toString()).getAsJsonObject();

        User user = new User(null, o.get("name").getAsString(), o.get("login").getAsString(), o.get("password").getAsString(), o.get("role").getAsString());
        userDao.save(user);

        response.setContentType("application/json;charset=UTF-8");
        ServletOutputStream out = response.getOutputStream();
        out.print(gson.toJson(user));
    }

}
