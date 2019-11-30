package ru.otus.hw05;

import ru.otus.jtest.annotations.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    void beforeClass() {
        System.out.println("before class");
    }

    @AfterAll
    void afterClass() {
        System.out.println("after class");
    }

    @BeforeEach
    void init() {
        System.out.println("init new calculator instance");
        this.calculator = new Calculator();
    }


    @Test
    void add() {

        calculator.add(2);

        if (calculator.getSum() != 2) {
            throw new Error("add result");
        }
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        calculator.subtract(2);

        if (calculator.getSum() != -2) {
            throw new Error("add result");
        }
    }


}
