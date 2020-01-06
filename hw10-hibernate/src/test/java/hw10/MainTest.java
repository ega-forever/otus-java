package hw10;

import ru.otus.models.Account;
import ru.otus.models.AddressDataSet;
import ru.otus.models.PhoneDataSet;
import ru.otus.models.User;
import ru.otus.repositories.AccountRepositoryImpl;
import ru.otus.repositories.UserRepositoryImpl;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.*;
import ru.otus.orm.manager.SessionManagerHibernate;
import ru.otus.orm.utils.HibernateUtils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {

    private UserRepositoryImpl userRepositoryImpl;
    private AccountRepositoryImpl accountRepositoryImpl;

    @BeforeAll
    public void init() {


        SessionFactory userSessionFactory = HibernateUtils.buildSessionFactory("hibernate.cfg.xml", User.class, AddressDataSet.class, PhoneDataSet.class);
        SessionManagerHibernate userSessionManager = new SessionManagerHibernate(userSessionFactory);
        this.userRepositoryImpl = new UserRepositoryImpl(userSessionManager);

        SessionFactory accountSessionFactory = HibernateUtils.buildSessionFactory("hibernate.cfg.xml", Account.class);
        SessionManagerHibernate accountSessionManager = new SessionManagerHibernate(accountSessionFactory);
        this.accountRepositoryImpl = new AccountRepositoryImpl(accountSessionManager);
    }

    @Test
    @Order(1)
    public void testUserModelInsert() {
        User newUser = new User("test", 12);
        newUser.address = new AddressDataSet("my street");
        newUser.phones = Collections.singletonList(new PhoneDataSet("+111111"));

        this.userRepositoryImpl.insert(newUser);
        assertEquals(newUser.id, Integer.valueOf(1));
    }

    @Test
    @Order(2)
    public void testUserModelQuery() {
        User queriedUser = this.userRepositoryImpl.load(1, User.class);
        assertEquals(queriedUser.id, Integer.valueOf(1));
    }

    @Test
    @Order(3)
    public void testUserModelUpdate() {
        User queriedUser = this.userRepositoryImpl.load(1, User.class);
        queriedUser.age = 123;
        this.userRepositoryImpl.update(queriedUser);
        queriedUser = this.userRepositoryImpl.load(1, User.class);

        assertEquals(queriedUser.age, Integer.valueOf(123));
    }

    @Test
    @Order(4)
    public void testAccountModelInsert() {
        Account newAccount = new Account();
        newAccount.type = "type1";
        newAccount.rest = 11;
        accountRepositoryImpl.insert(newAccount);
        assertEquals(newAccount.id, new BigInteger("1"));
    }

    @Test
    @Order(5)
    public void testAccountModelQuery() {
        Account queriedAccount = accountRepositoryImpl.load(new BigInteger("1"), Account.class);
        assertEquals(queriedAccount.id, new BigInteger("1"));
    }

    @Test
    @Order(6)
    public void testAccountModelUpdate() {
        Account queriedAccount = accountRepositoryImpl.load(new BigInteger("1"), Account.class);
        queriedAccount.rest = 123;
        this.accountRepositoryImpl.update(queriedAccount);
        queriedAccount = this.accountRepositoryImpl.load(new BigInteger("1"), Account.class);

        assertEquals(queriedAccount.rest, Integer.valueOf(123));
    }


}
