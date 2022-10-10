package com.bootcamp.tests01.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Testa a soma de 2 números")
    public void sum_two_numbers_and_return_double() {
        // setup
        double n1 = 10;
        double n2 = 20;
        double expected = 30;

        // run
        double result = calculator.sum(n1, n2);

        // validate
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testa a divisão de 2 números positivos")
    public void divide_two_numbers_and_return_double() {
        // setup
        double n1 = 30;
        double n2 = 2;
        double expect = 15;

        // run
        double result = calculator.divide(n1, n2);

        // validate
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Testa a divisão de um número por 0")
    public void divide_per_zero_return_zero() {
        // setup
        double n1 = 30;
        double n2 = 0;
        double expect = 0;

        // run
        double result = calculator.divide(n1, n2);

        // validate
        assertEquals(expect, result);
    }
}
