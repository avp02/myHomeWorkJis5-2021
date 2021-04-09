package com.avp.homework8inheritanceandinterfaces.task3mathoperation.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class AdditionOperationTest {

    private static final Logger log = LoggerFactory.getLogger(AdditionOperation.class);
    private AdditionOperation test;
    private double a;
    private double b;

    @BeforeEach
    void beforeEach() {
        test = new AdditionOperation();
        a = -10.;
        b = 5.;
    }

    @Test
    void compute() {
        double expected = -5.;
        double actual = test.compute(a, b);
        log.info("I expected compute's result {} and it equals {}", expected, actual);
        assertEquals(expected, actual, 0.01);
    }
}