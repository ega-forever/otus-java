package ru.otus.servlet.admin;

import ru.otus.constants.SessionAttributes;
import ru.otus.dao.UserDao;
import ru.otus.services.TemplateProcessor;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class AdminServlet extends HttpServlet {

    private static final String USERS_PAGE_TEMPLATE = "admin/index.html";
    private static final String TEMPLATE_ATTR_USER = "user";

    private final UserDao userDao;
    private final TemplateProcessor templateProcessor;

    public AdminServlet(TemplateProcessor templateProcessor, UserDao userDao) {
        this.templateProcessor = templateProcessor;
        this.userDao = userDao;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {

        HttpSession session = req.getSession(false);
        Object userId = session.getAttribute(SessionAttributes.USER_ID.getType());
        System.out.println("userId: " + userId);


        Map<String, Object> paramsMap = new HashMap<>();
        userDao.findById((Long) userId).ifPresent(user -> paramsMap.put(TEMPLATE_ATTR_USER, user));

        response.setContentType("text/html");
        response.getWriter().println(templateProcessor.getPage(USERS_PAGE_TEMPLATE, paramsMap));
    }

}
