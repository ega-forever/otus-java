package ru.otus.server;

import com.google.gson.Gson;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import ru.otus.constants.Roles;
import ru.otus.dao.UserDao;
import ru.otus.helpers.FileSystemHelper;
import ru.otus.services.TemplateProcessor;
import ru.otus.services.AuthService;
import ru.otus.servlet.AuthorizationFilter;
import ru.otus.servlet.LoginServlet;
import ru.otus.servlet.admin.AdminApiUserServlet;
import ru.otus.servlet.admin.AdminApiUsersServlet;
import ru.otus.servlet.admin.AdminServlet;
import ru.otus.servlet.user.UsersServlet;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class AppWebServerImpl implements AppWebServer {
    private static final String START_PAGE_NAME = "index.html";
    private static final String COMMON_RESOURCES_DIR = "static";

    private final int port;
    private final AuthService userAuthServiceForFilterBasedSecurity;
    private final UserDao userDao;
    private final Gson gson;
    private final TemplateProcessor templateProcessor;
    private final Server server;

    public AppWebServerImpl(int port,
                            AuthService userAuthServiceForFilterBasedSecurity,
                            UserDao userDao,
                            Gson gson,
                            TemplateProcessor templateProcessor) {
        this.port = port;
        this.userAuthServiceForFilterBasedSecurity = userAuthServiceForFilterBasedSecurity;
        this.userDao = userDao;
        this.gson = gson;
        this.templateProcessor = templateProcessor;
        server = initContext();
    }

    @Override
    public void start() throws Exception {
        server.start();
    }

    @Override
    public void join() throws Exception {
        server.join();
    }

    @Override
    public void stop() throws Exception {
        server.stop();
    }

    private Server initContext() {
        HandlerList handlers = new HandlerList();

        ResourceHandler resourceHandler = createResourceHandler();
        handlers.addHandler(resourceHandler);

        ServletContextHandler servletContextHandler = createServletContextHandler();
        handlers.addHandler(applySecurity(servletContextHandler));

        Server srv = new Server(port);
        srv.setHandler(handlers);
        return srv;
    }

    private ResourceHandler createResourceHandler() {
        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setDirectoriesListed(false);
        resourceHandler.setWelcomeFiles(new String[]{START_PAGE_NAME});
        resourceHandler.setResourceBase(FileSystemHelper.localFileNameOrResourceNameToFullPath(COMMON_RESOURCES_DIR));
        return resourceHandler;
    }

    private ServletContextHandler createServletContextHandler() {
        ServletContextHandler servletContextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        servletContextHandler.addServlet(new ServletHolder(new UsersServlet(templateProcessor, userDao)), "/users");

        servletContextHandler.addServlet(new ServletHolder(new AdminServlet(templateProcessor, userDao)), "/admin");
        servletContextHandler.addServlet(new ServletHolder(new AdminApiUsersServlet(userDao, gson)), "/api/admin/users");
        servletContextHandler.addServlet(new ServletHolder(new AdminApiUserServlet(userDao, gson)), "/api/admin/user");
        return servletContextHandler;
    }

    private Handler applySecurity(ServletContextHandler servletContextHandler) {
        servletContextHandler.addServlet(new ServletHolder(new LoginServlet(templateProcessor, userAuthServiceForFilterBasedSecurity)), "/login");

        applyFilterBasedSecurity(servletContextHandler, new String[]{"/users"}, Collections.singletonList(Roles.USER.getType()));
        applyFilterBasedSecurity(servletContextHandler, new String[]{"/admin", "/api/admin/*"}, Collections.singletonList(Roles.ADMIN.getType()));
        return servletContextHandler;
    }

    private ServletContextHandler applyFilterBasedSecurity(ServletContextHandler servletContextHandler, String[] paths, List<String> roles) {
        AuthorizationFilter authorizationFilter = new AuthorizationFilter(roles);
        IntStream.range(0, paths.length)
                .forEachOrdered(i -> servletContextHandler.addFilter(new FilterHolder(authorizationFilter), paths[i], null));
        return servletContextHandler;
    }

}
