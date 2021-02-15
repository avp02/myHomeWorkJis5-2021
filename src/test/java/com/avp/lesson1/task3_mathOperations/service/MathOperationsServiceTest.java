package com.avp.lesson1.task3_mathOperations.service;

import com.avp.lesson1.task3_mathOperations.bean.MathOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsServiceTest {

    private static MathOperations mathTest;
    private static MathOperationsService test;
    private static final Logger log = LoggerFactory.getLogger(MathOperationsServiceTest.class);

    @BeforeAll
    static void beforeAll() {

        mathTest = new MathOperations();
        test = new MathOperationsService(mathTest);
    }

    @Test
    void additionTest() {
        mathTest.setA(-3);
        mathTest.setB(3);
        log.info("Addition({}, {}) = {}", mathTest.getA(), mathTest.getB(), test.addition());
        assertEquals(0, test.addition());
    }

    @Test
    void subtractionTest() {
        mathTest.setA(5);
        mathTest.setB(3);
        log.info("Subtraction({}, {}) = {}", mathTest.getA(), mathTest.getB(), test.subtraction());
        assertEquals(2.0, test.subtraction());
    }

    @Test
    void multiplicationTest() {
        mathTest.setA(7);
        mathTest.setB(7);
        log.info("Multiplication({}, {}) = {}", mathTest.getA(), mathTest.getB(), test.multiplication());
        assertEquals(49.0, test.multiplication());
    }

    @Test
    void divisionOnZeroExceptionTest() {
        mathTest.setA(15);
        mathTest.setB(0);
        Assertions.assertThrows(ArithmeticException.class, () -> test.division());
    }

    @Test
    void divisionTest() {
        mathTest.setA(15);
        mathTest.setB(5);
        log.info("Division({}, {}) = {}", mathTest.getA(), mathTest.getB(), test.division());
        assertEquals(3.0, test.division());
    }
}