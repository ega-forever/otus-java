package ru.otus.jtest;

import ru.otus.jtest.annotations.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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


    public TestRunner(String className) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        this.testClass = Thread.currentThread().getContextClassLoader().loadClass(className);
        this.setMethods();
    }

    private void setMethods() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        this.constructor = this.testClass.getConstructor();
        Object testInstance = this.constructor.newInstance();

        for (Method method : this.testClass.getDeclaredMethods()) {

            if (method.getAnnotation(BeforeEach.class) != null) {
                beforeEachMethods.add(method);
                if(!method.canAccess(testInstance)){
                    method.setAccessible(true);
                }
            }

            if (method.getAnnotation(AfterEach.class) != null) {
                afterEachMethods.add(method);
                if(!method.canAccess(testInstance)){
                    method.setAccessible(true);
                }
            }

            if (method.getAnnotation(BeforeAll.class) != null) {
                beforeAllMethods.add(method);
                if(!method.canAccess(testInstance)){
                    method.setAccessible(true);
                }
            }

            if (method.getAnnotation(AfterAll.class) != null) {
                afterAllMethods.add(method);
                if(!method.canAccess(testInstance)){
                    method.setAccessible(true);
                }
            }

            if (method.getAnnotation(Test.class) != null) {
                testMethods.add(method);
                if(!method.canAccess(testInstance)){
                    method.setAccessible(true);
                }
            }

        }

    }

    public void run() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Object testInstance = this.constructor.newInstance();

        for (Method beforeAll : beforeAllMethods) {
            beforeAll.setAccessible(true);

            beforeAll.invoke(testInstance);
        }

        for (Method test : testMethods) {

            for (Method before : beforeEachMethods) {
                before.invoke(testInstance);
            }

            try {
                test.invoke(testInstance);
                System.out.println("test " + test.getName() + " has passed");
            } catch (Exception e) {
                System.out.println("test " + test.getName() + " has not passed: " + e.toString());
            }


            for (Method after : afterEachMethods) {
                after.invoke(testInstance);
            }

        }


        for (Method afterAll : afterAllMethods) {
            afterAll.invoke(testInstance);
        }


    }

}
