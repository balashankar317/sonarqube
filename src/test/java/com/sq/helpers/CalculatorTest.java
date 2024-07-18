package com.sq.helpers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;
    int a;
    int b;
    int na;
    int nb;
    int expectedSum;
    int nExpectedSum;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        a = 10;
        b = 20;
        expectedSum = 30;
        na = -10;
        nb = -5;
        nExpectedSum = -15;
    }

    @Test
    void testAddWithPositiveNumbers() {
        int actualSum = 0;
        actualSum = calculator.add(a, b);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void testAddWithNegativeNumbers() {
        int actualSum = 0;
        actualSum = calculator.add(na, nb);
        Assertions.assertEquals(nExpectedSum, actualSum);
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
        a = 0;
        b = 0;
        na = 0;
        nb = 0;
        expectedSum = 0;
        nExpectedSum = 0;
    }
}
