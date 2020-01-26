package ru.otus.repositories;

import ru.otus.models.User;
import org.hibernate.Session;
import ru.otus.orm.interfaces.Repository;
import ru.otus.orm.manager.DatabaseSessionHibernate;
import ru.otus.orm.manager.SessionManagerHibernate;

public class UserRepositoryImpl implements Repository<User> {

    private final SessionManagerHibernate sessionManager;

    public UserRepositoryImpl(SessionManagerHibernate sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void insert(User user) {
        this.sessionManager.beginSession();
        DatabaseSessionHibernate currentSession = sessionManager.getCurrentSession();
        Session hibernateSession = currentSession.getHibernateSession();
        hibernateSession.save(user);
        this.sessionManager.commitSession();
    }

    @Override
    public void update(User user) {
        this.sessionManager.beginSession();
        DatabaseSessionHibernate currentSession = sessionManager.getCurrentSession();
        Session hibernateSession = currentSession.getHibernateSession();
        hibernateSession.update(user);
        this.sessionManager.commitSession();
    }

    @Override
    public User load(Object id, Class<User> clazz) {
        this.sessionManager.beginSession();
        DatabaseSessionHibernate currentSession = sessionManager.getCurrentSession();
        Session hibernateSession = currentSession.getHibernateSession();
        User user = hibernateSession.find(clazz, id);
        this.sessionManager.close();
        return user;
    }

}
