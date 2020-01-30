package ru.otus.repositories;

import ru.otus.cachehw.HwCache;
import ru.otus.models.User;
import org.hibernate.Session;
import ru.otus.orm.interfaces.Repository;
import ru.otus.orm.manager.DatabaseSessionHibernate;
import ru.otus.orm.manager.SessionManagerHibernate;

public class UserRepositoryImpl implements Repository<User> {

    private final SessionManagerHibernate sessionManager;
    private final HwCache<String, User> cache;

    public UserRepositoryImpl(SessionManagerHibernate sessionManager, HwCache<String, User> cache) {
        this.sessionManager = sessionManager;
        this.cache = cache;
    }

    @Override
    public void insert(User user) {
        this.sessionManager.beginSession();
        DatabaseSessionHibernate currentSession = sessionManager.getCurrentSession();
        Session hibernateSession = currentSession.getHibernateSession();
        hibernateSession.save(user);
        this.cache.put(user.id.toString(), user);
        this.sessionManager.commitSession();
    }

    @Override
    public void update(User user) {
        this.sessionManager.beginSession();
        DatabaseSessionHibernate currentSession = sessionManager.getCurrentSession();
        Session hibernateSession = currentSession.getHibernateSession();
        hibernateSession.update(user);
        this.cache.put(user.id.toString(), user);
        this.sessionManager.commitSession();
    }

    @Override
    public User load(Object id, Class<User> clazz) {

        User cachedUser = this.cache.get(id.toString());

        if (cachedUser != null) {
            return cachedUser;
        }

        this.sessionManager.beginSession();
        DatabaseSessionHibernate currentSession = sessionManager.getCurrentSession();
        Session hibernateSession = currentSession.getHibernateSession();
        User user = hibernateSession.find(clazz, id);

        if (user != null) {
            this.cache.put(user.id.toString(), user);
        }

        this.sessionManager.close();
        return user;
    }

}
