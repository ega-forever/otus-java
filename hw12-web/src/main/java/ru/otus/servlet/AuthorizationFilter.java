package ru.otus.servlet;

import ru.otus.constants.SessionAttributes;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class AuthorizationFilter implements Filter {

    private List<String> roles;
    private ServletContext context;

    public AuthorizationFilter(List<String> roles){
        this.roles = roles;
    }

    @Override
    public void init(FilterConfig filterConfig) {
        this.context = filterConfig.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String uri = request.getRequestURI();
        this.context.log("Requested Resource:" + uri);

        HttpSession session = request.getSession(false);

        if (session == null) {
            response.sendRedirect("/login?redirect=" + uri);
            return;
        }

        String currentRole = (String) session.getAttribute(SessionAttributes.ROLE.getType());

        if (!this.roles.contains(currentRole)) {
            response.sendRedirect("/login?redirect=" + uri);
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }

    }

    @Override
    public void destroy() {

    }
}
