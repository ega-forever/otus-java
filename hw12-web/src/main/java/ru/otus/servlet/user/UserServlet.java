package ru.otus.servlet.user;

import ru.otus.constants.SessionAttributes;
import ru.otus.dao.UserDao;
import ru.otus.model.User;
import ru.otus.services.TemplateProcessor;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class UserServlet extends HttpServlet {

    private static final String USERS_PAGE_TEMPLATE = "user/index.html";
    private static final String TEMPLATE_ATTR_USER_NAME = "user_name";

    private final UserDao userDao;
    private final TemplateProcessor templateProcessor;

    public UserServlet(TemplateProcessor templateProcessor, UserDao userDao) {
        this.templateProcessor = templateProcessor;
        this.userDao = userDao;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {

        HttpSession session = req.getSession(false);
        Object userId = session.getAttribute(SessionAttributes.USER_ID.getType());

        Map<String, Object> paramsMap = new HashMap<>();
        User user = userDao.findById((Long) userId).get();
        paramsMap.put(TEMPLATE_ATTR_USER_NAME, user.name);

        System.out.println(paramsMap);

        response.setContentType("text/html");
        response.getWriter().println(templateProcessor.getPage(USERS_PAGE_TEMPLATE, paramsMap));
    }

}