package ru.otus.repositories;

import ru.otus.models.Account;
import org.hibernate.Session;
import ru.otus.orm.interfaces.Repository;
import ru.otus.orm.manager.DatabaseSessionHibernate;
import ru.otus.orm.manager.SessionManagerHibernate;

public class AccountRepositoryImpl implements Repository<Account> {

    private final SessionManagerHibernate sessionManager;

    public AccountRepositoryImpl(SessionManagerHibernate sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void insert(Account account) {
        this.sessionManager.beginSession();
        DatabaseSessionHibernate currentSession = sessionManager.getCurrentSession();
        Session hibernateSession = currentSession.getHibernateSession();
        hibernateSession.save(account);
        this.sessionManager.commitSession();
    }

    @Override
    public void update(Account account) {
        this.sessionManager.beginSession();
        DatabaseSessionHibernate currentSession = sessionManager.getCurrentSession();
        Session hibernateSession = currentSession.getHibernateSession();
        hibernateSession.update(account);
        this.sessionManager.commitSession();
    }

    @Override
    public Account load(Object id, Class<Account> clazz) {
        this.sessionManager.beginSession();
        DatabaseSessionHibernate currentSession = sessionManager.getCurrentSession();
        Session hibernateSession = currentSession.getHibernateSession();
        return hibernateSession.find(clazz, id);
    }

}
