package ru.otus.jtest;

import ru.otus.jtest.annotations.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    private Class<?> testClass;
    private final List<Method> beforeAllMethods = new ArrayList<>();
    private final List<Method> afterAllMethods = new ArrayList<>();
    private final List<Method> beforeEachMethods = new ArrayList<>();
    private final List<Method> afterEachMethods = new ArrayList<>();
    private final List<Method> testMethods = new ArrayList<>();
    private Constructor<?> constructor;


    public TestRunner(String className) throws ClassNotFoundException, NoSuchMethodException {
        this.testClass = Thread.currentThread().getContextClassLoader().loadClass(className);
        this.setMethods();
    }

    private void setMethods() throws NoSuchMethodException {

        this.constructor = this.testClass.getConstructor();

        for (Method method : this.testClass.getDeclaredMethods()) {

            method.setAccessible(true);

            if (method.getAnnotation(BeforeEach.class) != null) {
                beforeEachMethods.add(method);
            }

            if (method.getAnnotation(AfterEach.class) != null) {
                afterEachMethods.add(method);
            }

            if (method.getAnnotation(BeforeAll.class) != null) {
                beforeAllMethods.add(method);
            }

            if (method.getAnnotation(AfterAll.class) != null) {
                afterAllMethods.add(method);
            }

            if (method.getAnnotation(Test.class) != null) {
                testMethods.add(method);
            }

        }

    }

    public void run() {


        try {
            for (Method beforeAll : beforeAllMethods) {
                beforeAll.invoke(null);
            }

            for (Method test : testMethods) {

                Object testInstance = this.constructor.newInstance();

                try {
                    for (Method before : beforeEachMethods) {
                        before.invoke(testInstance);
                    }

                    test.invoke(testInstance);
                    System.out.println("test " + test.getName() + " has passed");

                } catch (Exception e) {
                    System.out.println("test " + test.getName() + " has failed: " + e.toString());
                }


                for (Method after : afterEachMethods) {
                    try {
                        after.invoke(testInstance);
                    } catch (Exception e) {
                        System.out.println("(after) test " + test.getName() + " failed with error: " + e.toString());
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("failed with error: " + e.toString());
        }


        for (Method afterAll : afterAllMethods) {
            try {
                afterAll.invoke(null);
            } catch (Exception e) {
                System.out.println("(beforeAll) failed with error: " + e.toString());
            }
        }


    }

}
