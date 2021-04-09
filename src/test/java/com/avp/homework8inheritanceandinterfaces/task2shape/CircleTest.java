package com.avp.homework8inheritanceandinterfaces.task2shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private static final Logger log = LoggerFactory.getLogger(CircleTest.class);
    private Circle test;

    @BeforeEach
    void beforeEach() {
        test = new Circle("Circle", 2.0);
    }

    @Test
    void getName() {
        String expected = "Circle";
        String actual = test.getName();
        log.info("I expected that name {} will equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void getArea() {
        double expected = 12.56;
        double actual = test.getArea();
        log.info("I expected that area {} will equals {}", expected, actual);
        assertEquals(expected, actual, 0.01);
    }
}