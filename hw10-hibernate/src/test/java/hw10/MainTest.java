package hw10;

import org.hibernate.SessionFactory;
import org.junit.jupiter.api.*;
import ru.otus.models.AddressInfo;
import ru.otus.models.PhoneDataSet;
import ru.otus.models.User;
import ru.otus.orm.manager.SessionManagerHibernate;
import ru.otus.orm.utils.HibernateUtils;
import ru.otus.repositories.UserRepositoryImpl;

import java.util.Collections;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {

    private UserRepositoryImpl userRepositoryImpl;

    @BeforeAll
    public void init() {
        SessionFactory userSessionFactory = HibernateUtils.buildSessionFactory("hibernate.cfg.xml", User.class, AddressInfo.class, PhoneDataSet.class);
        SessionManagerHibernate userSessionManager = new SessionManagerHibernate(userSessionFactory);
        this.userRepositoryImpl = new UserRepositoryImpl(userSessionManager);
    }

    @Test
    public void testUserModelInsert() {
        User newUser = new User("test_" + new Random().nextInt(), 12);
        newUser.address = new AddressInfo("my street");
        newUser.phones = Collections.singletonList(new PhoneDataSet("+111111"));

        this.userRepositoryImpl.insert(newUser);
        assertNotEquals(newUser.id, null);
    }

    @Test
    public void testUserModelQuery() {
        User newUser = new User("test_" + new Random().nextInt(), 12);
        this.userRepositoryImpl.insert(newUser);

        User queriedUser = this.userRepositoryImpl.load(newUser.id, User.class);
        assertEquals(queriedUser.id, newUser.id);
        assertEquals(queriedUser.name, newUser.name);
    }

    @Test
    public void testUserModelUpdate() {

        User newUser = new User("test_" + new Random().nextInt(), 12);
        this.userRepositoryImpl.insert(newUser);
        User queriedUser = this.userRepositoryImpl.load(newUser.id, User.class);

        queriedUser.age = 123;
        this.userRepositoryImpl.update(queriedUser);
        queriedUser = this.userRepositoryImpl.load(newUser.id, User.class);

        assertEquals(queriedUser.age, Integer.valueOf(123));
    }

}
