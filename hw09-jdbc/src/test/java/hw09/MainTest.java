package hw09;

import hw09.models.Account;
import hw09.models.User;
import org.junit.jupiter.api.*;
import ru.otus.datasources.DataSourceH2;
import ru.otus.orm.DbExecutor;
import ru.otus.orm.RepositoryImpl;

import javax.sql.DataSource;
import java.math.BigInteger;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {

    private RepositoryImpl<User> userRepositoryImpl;
    private RepositoryImpl<Account> accountRepositoryImpl;

    @BeforeAll
    public void init() throws NoSuchFieldException, SQLException {

        DataSource dataSource = new DataSourceH2();
        DbExecutor<User> userDbExecutor = new DbExecutor<>();

        this.userRepositoryImpl = new RepositoryImpl<>(User.class, userDbExecutor, dataSource);
        this.userRepositoryImpl.sync();

        DbExecutor<Account> accountDbExecutor = new DbExecutor<>();
        this.accountRepositoryImpl = new RepositoryImpl<>(Account.class, accountDbExecutor, dataSource);
        this.accountRepositoryImpl.sync();

    }

    @Test
    @Order(1)
    public void testUserModelInsert() throws Exception {
        User newUser = new User();
        newUser.name = "test";
        newUser.age = 12;
        this.userRepositoryImpl.insert(newUser);

        assertEquals(newUser.id, Integer.valueOf(1));
    }

    @Test
    @Order(2)
    public void testUserModelQuery() throws Exception {
        User queriedUser = this.userRepositoryImpl.load(1, User.class);
        assertEquals(queriedUser.id, Integer.valueOf(1));
    }

    @Test
    @Order(3)
    public void testUserModelUpdate() throws Exception {
        User queriedUser = this.userRepositoryImpl.load(1, User.class);
        queriedUser.age = 123;
        this.userRepositoryImpl.update(queriedUser);
        queriedUser = this.userRepositoryImpl.load(1, User.class);

        assertEquals(queriedUser.age, Integer.valueOf(123));
    }

    @Test
    @Order(4)
    public void testAccountModelInsert() throws Exception {
        Account newAccount = new Account();
        newAccount.type = "type1";
        newAccount.rest = 11;
        accountRepositoryImpl.insert(newAccount);
        assertEquals(newAccount.id, new BigInteger("1"));
    }

    @Test
    @Order(5)
    public void testAccountModelQuery() throws Exception {
        Account queriedAccount = accountRepositoryImpl.load("1", Account.class);
        assertEquals(queriedAccount.id, new BigInteger("1"));
    }

    @Test
    @Order(6)
    public void testAccountModelUpdate() throws Exception {
        Account queriedAccount = accountRepositoryImpl.load("1", Account.class);
        queriedAccount.rest = 123;
        this.accountRepositoryImpl.update(queriedAccount);
        queriedAccount = this.accountRepositoryImpl.load(1, Account.class);

        assertEquals(queriedAccount.rest, Integer.valueOf(123));
    }


}
