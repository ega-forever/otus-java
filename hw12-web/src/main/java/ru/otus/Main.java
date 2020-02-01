package ru.otus;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.hibernate.SessionFactory;
import ru.otus.dao.HibernateUserDao;
import ru.otus.dao.InMemoryUserDao;
import ru.otus.dao.UserDao;
import ru.otus.model.User;
import ru.otus.server.AppWebServer;
import ru.otus.server.AppWebServerImpl;
import ru.otus.services.TemplateProcessor;
import ru.otus.services.TemplateProcessorImpl;
import ru.otus.services.AuthService;
import ru.otus.services.AuthServiceImpl;
import ru.otus.utils.CheckAdmin;
import ru.otus.utils.HibernateUtils;

import javax.persistence.EntityManager;

public class Main {
    private static final int WEB_SERVER_PORT = 8080;
    private static final String TEMPLATES_DIR = "/templates/";

    public static void main(String[] args) throws Exception {

       // UserDao userDao = new InMemoryUserDao(); // todo replace with hibernate
        SessionFactory sessionFactory = HibernateUtils.buildSessionFactory("hibernate.cfg.xml", User.class);
        EntityManager entityManager = sessionFactory.createEntityManager();
        UserDao userDao = new HibernateUserDao(sessionFactory, entityManager); // todo replace with hibernate

        CheckAdmin.checkAdmin(userDao);

        AuthService userAuthServiceForFilterBasedSecurity = new AuthServiceImpl(userDao);

        Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
        TemplateProcessor templateProcessor = new TemplateProcessorImpl(TEMPLATES_DIR);

        AppWebServer usersWebServer = new AppWebServerImpl(WEB_SERVER_PORT,
                userAuthServiceForFilterBasedSecurity,
                userDao,
                gson,
                templateProcessor);

        usersWebServer.start();
        usersWebServer.join();
    }
}
