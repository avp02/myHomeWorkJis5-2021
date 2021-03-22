package com.avp.homework8inheritanceandinterfaces.task3mathoperation.service;

import com.avp.homework8inheritanceandinterfaces.task3mathoperation.exception.DivideByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class DivisionOperationTest {

    private static final Logger log = LoggerFactory.getLogger(DivisionOperation.class);
    private DivisionOperation test;
    private double a;
    private double b;

    @BeforeEach
    void beforeEach() {
        test = new DivisionOperation();
        a = -10.;
        b = 5.;
    }

    @Test
    void computeBNotEqualsZero() {
        double expected = -2.;
        double actual = test.compute(a, b);
        log.info("I expected compute's result {} and it equals {}", expected, actual);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void computeBEqualsZero() {
        b = 0;
        assertThrows(DivideByZeroException.class, () ->
            test.compute(a, b)
        );
    }
}