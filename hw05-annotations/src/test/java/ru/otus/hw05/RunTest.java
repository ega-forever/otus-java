package ru.otus.hw05;

import ru.otus.jtest.annotations.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class RunTest {

    public static void main(String args[]) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InstantiationException {

        if(args.length == 0){
            throw new Error("please provide class name as argument");
        }

        Class<?> clazz = Thread.currentThread().getContextClassLoader().loadClass(args[0]);

        List<Method> beforeAllMethods = new ArrayList<>();
        List<Method> afterAllMethods = new ArrayList<>();
        List<Method> testMethods = new ArrayList<>();
        Method before = null;
        Method after = null;


        for (Method method : clazz.getDeclaredMethods()) {

            if (method.getAnnotation(Before.class) != null) {
                before = method;
            }

            if (method.getAnnotation(After.class) != null) {
                after = method;
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


        Constructor<?> constructor = clazz.getConstructor();
        Object calculatorTest = constructor.newInstance();
        for (Method test : testMethods) {

            if (before != null){
                before.invoke(calculatorTest);
            }

            for (Method beforeAll : beforeAllMethods) {
                beforeAll.invoke(calculatorTest);
            }

            try {
                test.invoke(calculatorTest);
                System.out.println("test " + test.getName() + " has passed");
            } catch (Exception e) {
                System.out.println("test " + test.getName() + " has not passed: " + e.toString());
            }


            for (Method afterAll : afterAllMethods) {
                afterAll.invoke(calculatorTest);
            }

            if (after != null){
                after.invoke(calculatorTest);
            }


        }

    }

}
