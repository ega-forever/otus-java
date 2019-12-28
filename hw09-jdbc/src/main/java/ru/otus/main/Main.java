package ru.otus.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.otus.main.models.User;
import ru.otus.orm.DbExecutor;
import ru.otus.orm.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Optional;

/**
 * @author sergey
 * created on 03.02.19.
 */
public class Main {
    private static final String URL = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        Main demo = new Main();

        Repository<User> userRepository = new Repository<>(User.class, URL);
        userRepository.sync();

        User newUser = new User();
        newUser.name = "test";
        newUser.age = 12;
        userRepository.insert(newUser);
        logger.info("created user:{}", newUser);


        newUser.name = "test22";
       userRepository.update(newUser);

       User queriedUser = userRepository.load(newUser.id, User.class);
       logger.info("queried user:{}", queriedUser);

/*
        Optional<User> user = executor.selectRecord(connection, "select id, name from user where id  = ?", userId, resultSet -> {
            try {
                if (resultSet.next()) {
                    User foundUser = new User();
                    foundUser.name = resultSet.getString("name");
                    return foundUser;
                }
            } catch (SQLException e) {
                logger.error(e.getMessage(), e);
            }
            return null;
        });
*/
       // System.out.println(user);
    }


    private void createTable(Connection connection) throws SQLException {
        try (PreparedStatement pst = connection.prepareStatement("create table user(id long auto_increment, name varchar(50))")) {
            pst.executeUpdate();
        }
    }


}
