package ru.otus.orm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @author sergey
 * created on 03.02.19.
 */
public class DbExecutor<T> {
    private static Logger logger = LoggerFactory.getLogger(DbExecutor.class);

    public Object insertRecord(Connection connection, String sql, List<String> params) throws SQLException {
        Savepoint savePoint = connection.setSavepoint("savePointName");
        try (PreparedStatement pst = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            for (int idx = 0; idx < params.size(); idx++) {
                pst.setString(idx + 1, params.get(idx));
            }
            pst.executeUpdate();
            try (ResultSet rs = pst.getGeneratedKeys()) {
                rs.next();
                return rs.getObject(1);
            }
        } catch (SQLException ex) {
            connection.rollback(savePoint);
            logger.error(ex.getMessage(), ex);
            throw ex;
        }
    }

    public void updateRecord(Connection connection, String sql, List<String> params) throws SQLException {
        Savepoint savePoint = connection.setSavepoint("savePointName");
        try (PreparedStatement pst = connection.prepareStatement(sql, Statement.NO_GENERATED_KEYS)) {
            for (int idx = 0; idx < params.size(); idx++) {
                pst.setString(idx + 1, params.get(idx));
            }
            pst.executeUpdate();
        } catch (SQLException ex) {
            connection.rollback(savePoint);
            logger.error(ex.getMessage(), ex);
            throw ex;
        }
    }

    public void executeRawQuery(Connection connection, String sql) throws SQLException {
        Savepoint savePoint = connection.setSavepoint("savePointName");
        try (PreparedStatement pst = connection.prepareStatement(sql, Statement.NO_GENERATED_KEYS)) {
            pst.executeUpdate();
        } catch (SQLException ex) {
            connection.rollback(savePoint);
            logger.error(ex.getMessage(), ex);
            throw ex;
        }
    }


    public HashMap<String, Object> selectRecord(Connection connection, String sql, Object id, Set<String> fields) throws SQLException {
        try (PreparedStatement pst = connection.prepareStatement(sql)) {
            pst.setString(1, id.toString());
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {

                    HashMap<String, Object> map = new HashMap<>();

                    for (String fieldName : fields) {
                        map.put(fieldName, rs.getObject(fieldName));
                    }
                    return map;
                }
                return null;
            }
        }
    }
}
