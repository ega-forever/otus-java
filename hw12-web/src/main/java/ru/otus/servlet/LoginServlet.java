package ru.otus.servlet;

import ru.otus.constants.Roles;
import ru.otus.constants.SessionAttributes;
import ru.otus.services.AuthServiceResult;
import ru.otus.services.TemplateProcessor;
import ru.otus.services.AuthService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import static javax.servlet.http.HttpServletResponse.SC_UNAUTHORIZED;

public class LoginServlet extends HttpServlet {

    private static final String PARAM_LOGIN = "login";
    private static final String PARAM_PASSWORD = "password";
    private static final String PARAM_REDIRECT = "redirect";
    private static final int MAX_INACTIVE_INTERVAL = 30;
    private static final String LOGIN_PAGE_TEMPLATE = "login.html";


    private final TemplateProcessor templateProcessor;
    private final AuthService userAuthService;

    public LoginServlet(TemplateProcessor templateProcessor, AuthService userAuthService) {
        this.userAuthService = userAuthService;
        this.templateProcessor = templateProcessor;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().println(templateProcessor.getPage(LOGIN_PAGE_TEMPLATE, Collections.emptyMap()));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter(PARAM_LOGIN);
        String password = request.getParameter(PARAM_PASSWORD);
        AuthServiceResult result = userAuthService.authenticate(name, password);

        if (result != null) {
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(MAX_INACTIVE_INTERVAL);
            session.setAttribute(SessionAttributes.USER_ID.getType(), result.getId());
            session.setAttribute(SessionAttributes.ROLE.getType(), result.getRole());

            String redirectUri = request.getParameter(PARAM_REDIRECT);

            if (redirectUri != null) {
                response.sendRedirect(redirectUri);
                return;
            }

            if (Roles.ADMIN.getType().equals(result.getRole())) {
                response.sendRedirect("/admin");
                return;
            }

            response.sendRedirect("/user");
        } else {
            response.setStatus(SC_UNAUTHORIZED);
            response.sendRedirect("/login");
        }

    }

}
