package hw09;

import hw09.models.Account;
import hw09.models.User;
import org.junit.jupiter.api.*;
import ru.otus.orm.Repository;

import java.math.BigInteger;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {

    private static final String URL = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private Repository<User> userRepository;
    private Repository<Account> accountRepository;

    @BeforeAll
    public void init() throws NoSuchFieldException, SQLException {
        this.userRepository = new Repository<>(User.class, URL);
        this.userRepository.sync();

        this.accountRepository = new Repository<>(Account.class, URL);
        this.accountRepository.sync();

    }
    
    @Test
    @Order(1)
    public void testUserModelInsert() throws Exception {
        User newUser = new User();
        newUser.name = "test";
        newUser.age = 12;
        this.userRepository.insert(newUser);

        assertEquals(newUser.id, Integer.valueOf(1));
    }

    @Test
    @Order(2)
    public void testUserModelQuery() throws Exception {
        User queriedUser = this.userRepository.load(1, User.class);
        assertEquals(queriedUser.id, Integer.valueOf(1));
    }

    @Test
    @Order(3)
    public void testUserModelUpdate() throws Exception {
        User queriedUser = this.userRepository.load(1, User.class);
        queriedUser.age = 123;
        this.userRepository.update(queriedUser);
        queriedUser = this.userRepository.load(1, User.class);

        assertEquals(queriedUser.age, Integer.valueOf(123));
    }

    @Test
    @Order(4)
    public void testAccountModelInsert() throws Exception {
        Account newAccount = new Account();
        newAccount.type = "type1";
        newAccount.rest = 11;
        accountRepository.insert(newAccount);
        assertEquals(newAccount.id, new BigInteger("1"));
    }

    @Test
    @Order(5)
    public void testAccountModelQuery() throws Exception {
        Account queriedAccount = accountRepository.load("1", Account.class);
        assertEquals(queriedAccount.id, new BigInteger("1"));
    }

    @Test
    @Order(6)
    public void testAccountModelUpdate() throws Exception {
        Account queriedAccount = accountRepository.load("1", Account.class);
        queriedAccount.rest = 123;
        this.accountRepository.update(queriedAccount);
        queriedAccount = this.accountRepository.load(1, Account.class);

        assertEquals(queriedAccount.rest, Integer.valueOf(123));
    }


}
