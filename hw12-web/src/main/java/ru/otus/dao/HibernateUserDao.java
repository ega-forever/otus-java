package ru.otus.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.otus.constants.Roles;
import ru.otus.model.User;
import ru.otus.utils.HibernateUtils;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HibernateUserDao implements UserDao {

    private final SessionFactory sessionFactory;
    private final EntityManager entityManager;

    public HibernateUserDao(SessionFactory sessionFactory, EntityManager entityManager) {
        this.sessionFactory = sessionFactory;
        this.entityManager = entityManager;
    }

    @Override
    public Optional<User> findById(long id) {
        Session session = this.sessionFactory.openSession();
        User user = session.find(User.class, id);
        return Optional.ofNullable(user);
    }

    @Override
    public Optional<User> findByLogin(String login) {
        CriteriaBuilder cb = this.sessionFactory.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> rootEntry = cq.from(User.class);
        CriteriaQuery<User> all = cq.select(rootEntry)
                .where(cb.equal(rootEntry.get("login"), login));

        TypedQuery<User> allQuery = this.entityManager.createQuery(all);
        return allQuery.getResultList().stream().findFirst();
    }

    @Override
    public Optional<Collection<User>> findAll() {
        CriteriaBuilder cb = this.sessionFactory.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> rootEntry = cq.from(User.class);
        CriteriaQuery<User> all = cq.select(rootEntry);

        TypedQuery<User> allQuery = this.entityManager.createQuery(all);
        return Optional.of(allQuery.getResultList());
    }

    @Override
    public Optional<User> save(User user) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        return Optional.ofNullable(user);
    }
}
