package ru.otus.hw05;

import ru.otus.jtest.TestRunner;

import java.lang.reflect.InvocationTargetException;

public class RunTest {

    public static void main(String args[]) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InstantiationException {

        if(args.length == 0){
            throw new Error("please provide class name as argument");
        }

        TestRunner runner = new TestRunner(args[0]);
        runner.run();
    }

}
