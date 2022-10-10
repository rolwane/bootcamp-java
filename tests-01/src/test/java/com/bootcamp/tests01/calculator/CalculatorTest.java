package com.bootcamp.tests01.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void sum_two_numbers_and_return_double() {
        // setup
        Calculator calculator = new Calculator();

        double n1 = 10;
        double n2 = 20;
        double expected = 30;

        // run
        double result = calculator.sum(n1, n2);

        // validate
        assertEquals(expected, result);
    }
}
