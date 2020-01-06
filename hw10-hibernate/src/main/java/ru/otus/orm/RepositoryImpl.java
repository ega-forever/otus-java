package ru.otus.orm;

import org.hibernate.Session;
import ru.otus.orm.interfaces.Repository;
import ru.otus.orm.manager.DatabaseSessionHibernate;
import ru.otus.orm.manager.SessionManagerHibernate;

public class RepositoryImpl<T> implements Repository<T> {

    private final SessionManagerHibernate sessionManager;

    public RepositoryImpl(SessionManagerHibernate sessionManager) {
        this.sessionManager = sessionManager;
    }

/*
    public void sync() throws SQLException, NoSuchFieldException {
        Connection connection = this.dataSource.getConnection();
        StringBuilder sql = new StringBuilder("CREATE TABLE " + this.tableName + " (\n");
        for (Map.Entry<String, String> field : this.fields.entrySet()) {
            sql.append(field.getKey()).append(" ").append(field.getValue());

            if (this.fieldSizes.get(field.getKey()) != null) {
                sql.append("(").append(this.fieldSizes.get(field.getKey())).append(")");


                Field f = this.clazz.getDeclaredField(field.getKey());

                if (f.equals(this.idField)) {
                    sql.append(" auto_increment,\n");

                } else {
                    sql.append(",\n");
                }


            } else {
                sql.append(",\n");
            }
        }
        sql.append(")");

        connection.setAutoCommit(false);
        this.dbExecutor.executeRawQuery(connection, sql.toString());
        connection.commit();
        connection.close();
    }
*/

    public void insert(T object) {
        this.sessionManager.beginSession();
        DatabaseSessionHibernate currentSession = sessionManager.getCurrentSession();
        Session hibernateSession = currentSession.getHibernateSession();
        hibernateSession.save(object);
        this.sessionManager.commitSession();
    }

    public void update(T object) {
        this.sessionManager.beginSession();
        DatabaseSessionHibernate currentSession = sessionManager.getCurrentSession();
        Session hibernateSession = currentSession.getHibernateSession();
        hibernateSession.update(object);
        this.sessionManager.commitSession();
    }

    public T load(Object id, Class<T> clazz) {
        this.sessionManager.beginSession();
        DatabaseSessionHibernate currentSession = sessionManager.getCurrentSession();
        Session hibernateSession = currentSession.getHibernateSession();
        return hibernateSession.find(clazz, id);
    }

}
