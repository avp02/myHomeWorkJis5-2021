package com.avp.homework5_loops.task5_numberCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {

    private static final Logger log = LoggerFactory.getLogger(PowerCalculatorTest.class);
    private PowerCalculator test;

    @BeforeEach
    void setUp() {
        test = new PowerCalculator();
    }

    @Test
    void raiseToPower() {
        int expected = 4;
        int a = 2;
        int b = 2;
        log.info("Result is to number = {} and power = {} equals {}", a, b, test.raiseToPower(a, b));
        assertEquals(expected, test.raiseToPower(a, b));
    }
    @Test
    void raiseToPower2() {
        int expected = 729;
        int a = 9;
        int b = 3;
        log.info("Result is to number = {} and power = {} equals {}", a, b, test.raiseToPower(a, b));
        assertEquals(expected, test.raiseToPower(a, b));
    }

    @Test
    void raiseToPowerIfNumberEqualsZero() {
        int expected = 0;
        int a = 0;
        int b = 10;
        log.info("Result is to number = {} and power = {} equals {}", a, b, test.raiseToPower(a, b));
        assertEquals(expected, test.raiseToPower(a, b));
    }

    @Test
    void raiseToPowerIfPowerEqualsZero() {
        int expected = 1;
        int a = 100;
        int b = 0;
        log.info("Result is to number = {} and power = {} equals {}", a, b, test.raiseToPower(a, b));
        assertEquals(expected, test.raiseToPower(a, b));
    }
}