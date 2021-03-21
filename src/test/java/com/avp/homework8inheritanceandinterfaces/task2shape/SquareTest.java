package com.avp.homework8inheritanceandinterfaces.task2shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private static final Logger log = LoggerFactory.getLogger(SquareTest.class);
    private Square test;

    @BeforeEach
    void beforeEach() {
        test = new Square("Square", 3.0);
    }

    @Test
    void getName() {
        String expected = "Square";
        String actual = test.getName();
        log.info("I expected that square {} will equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void getArea() {
        double expected = 9.;
        double actual = test.getArea();
        log.info("I expected that square {} will equals {}", expected, actual);
        assertEquals(expected, actual, 0.01);
    }
}