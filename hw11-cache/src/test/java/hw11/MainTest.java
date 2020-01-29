package hw11;

import org.hibernate.SessionFactory;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.otus.cachehw.HwCache;
import ru.otus.cachehw.HwListener;
import ru.otus.cachehw.ListenerActions;
import ru.otus.cachehw.MyCache;
import ru.otus.models.AddressInfo;
import ru.otus.models.PhoneDataSet;
import ru.otus.models.User;
import ru.otus.orm.interfaces.Repository;
import ru.otus.orm.manager.SessionManagerHibernate;
import ru.otus.orm.utils.HibernateUtils;
import ru.otus.repositories.UserRepositoryImpl;

import java.util.Collections;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {

    private SessionManagerHibernate userSessionManager;
    private Logger logger;

    @BeforeAll
    public void init() {
        SessionFactory userSessionFactory = HibernateUtils.buildSessionFactory("hibernate.cfg.xml", User.class, AddressInfo.class, PhoneDataSet.class);
        this.userSessionManager = new SessionManagerHibernate(userSessionFactory);
        this.logger = LoggerFactory.getLogger(MainTest.class);
    }

    @Test
    public void testUserModelInsert() {
        HwCache<String, User> cache = new MyCache<>(logger);
        Repository<User> userRepositoryImpl = new UserRepositoryImpl(this.userSessionManager, cache);

        User newUser = new User("test_" + new Random().nextInt(), 12);
        newUser.address = new AddressInfo("my street");
        newUser.phones = Collections.singletonList(new PhoneDataSet("+111111"));

        userRepositoryImpl.insert(newUser);
        assertNotEquals(newUser.id, null);
    }

    @Test
    public void testUserModelQuery() {
        HwCache<String, User> cache = new MyCache<>(logger);
        Repository<User> userRepositoryImpl = new UserRepositoryImpl(this.userSessionManager, cache);

        User newUser = new User("test_" + new Random().nextInt(), 12);
        userRepositoryImpl.insert(newUser);

        User queriedUser = userRepositoryImpl.load(newUser.id, User.class);
        assertEquals(queriedUser.id, newUser.id);
        assertEquals(queriedUser.name, newUser.name);
    }

    @Test
    public void testUserModelUpdate() {
        HwCache<String, User> cache = new MyCache<>(logger);
        Repository<User> userRepositoryImpl = new UserRepositoryImpl(this.userSessionManager, cache);

        User newUser = new User("test_" + new Random().nextInt(), 12);
        userRepositoryImpl.insert(newUser);
        User queriedUser = userRepositoryImpl.load(newUser.id, User.class);

        queriedUser.age = 123;
        userRepositoryImpl.update(queriedUser);
        queriedUser = userRepositoryImpl.load(newUser.id, User.class);

        assertEquals(queriedUser.age, Integer.valueOf(123));
    }

    @Test
    public void testCacheCreate() {
        HwCache<String, User> cache = new MyCache<>(logger);
        Repository<User> userRepositoryImpl = new UserRepositoryImpl(this.userSessionManager, cache);

        AtomicReference<String> createActionId = new AtomicReference<>();

        HwListener<String, User> listener = (key, value, action) -> {
            assertEquals(action, ListenerActions.INSERT.getAction());
            createActionId.set(key);
        };

        cache.addListener(listener);

        User newUser = new User("test_" + new Random().nextInt(), 12);
        userRepositoryImpl.insert(newUser);
        assertEquals(createActionId.get(), newUser.id.toString());
    }

    @Test
    public void testCacheUpdate() {
        HwCache<String, User> cache = new MyCache<>(logger);
        Repository<User> userRepositoryImpl = new UserRepositoryImpl(this.userSessionManager, cache);

        User newUser = new User("test_" + new Random().nextInt(), 12);
        userRepositoryImpl.insert(newUser);
        User queriedUser = userRepositoryImpl.load(newUser.id, User.class);

        AtomicReference<String> updateActionId = new AtomicReference<>();

        HwListener<String, User> listener = (key, value, action) -> {
            assertEquals(action, ListenerActions.INSERT.getAction());
            updateActionId.set(key);
        };

        cache.addListener(listener);

        queriedUser.age = 123;
        userRepositoryImpl.update(queriedUser);
        assertEquals(updateActionId.get(), queriedUser.id.toString());
    }

    @Test
    public void testCacheSelect() {
        HwCache<String, User> cache = new MyCache<>(logger);
        Repository<User> userRepositoryImpl = new UserRepositoryImpl(this.userSessionManager, cache);

        User newUser = new User("test_" + new Random().nextInt(), 12);
        userRepositoryImpl.insert(newUser);

        AtomicReference<String> selectActionId = new AtomicReference<>();

        HwListener<String, User> listener = (key, value, action) -> {
            assertEquals(action, ListenerActions.SELECT.getAction());
            selectActionId.set(key);
        };

        cache.addListener(listener);

        User queriedUser = userRepositoryImpl.load(newUser.id, User.class);
        assertEquals(selectActionId.get(), queriedUser.id.toString());
    }

}
