package com.avp.homework8inheritanceandinterfaces.task2shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private static final Logger log = LoggerFactory.getLogger(TriangleTest.class);
    private Triangle test;

    @BeforeEach
    void beforeEach() {
        test = new Triangle("Triangle", 4.0, 5);
    }

    @Test
    void getName() {
        String expected = "Triangle";
        String actual = test.getName();
        log.info("I expected that triangle {} will equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void getArea() {
        double expected = 10.;
        double actual = test.getArea();
        log.info("I expected that triangle {} will equals {}", expected, actual);
        assertEquals(expected, actual, 0.01);
    }
}