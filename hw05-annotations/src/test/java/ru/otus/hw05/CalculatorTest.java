package ru.otus.hw05;

import ru.otus.jtest.annotations.AfterAll;
import ru.otus.jtest.annotations.BeforeAll;
import ru.otus.jtest.annotations.Test;

public class CalculatorTest {


    @BeforeAll
    void beforeClass() {
        System.out.println("before class");
    }

    @AfterAll
    void afterClass() {
        System.out.println("after class");
    }


    @Test
    void add() {
        Calculator calculator = new Calculator();
        calculator.add(2);

        if(calculator.getSum() != 2){
            throw new Error("add result");
        }

        // assertEquals(x + y, result, "add result");
    }


}
