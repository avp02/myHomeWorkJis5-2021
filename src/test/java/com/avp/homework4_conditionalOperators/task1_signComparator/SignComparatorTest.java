package com.avp.homework4_conditionalOperators.task1_signComparator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class SignComparatorTest {

    private static final Logger log = LoggerFactory.getLogger(SignComparatorTest.class);
    private static SignComparator signComparator;
    private static String expected1;
    private static String expected2;
    private static String expected3;

    @BeforeAll
    static void beforeAll() {
        signComparator = new SignComparator();
        expected1 = "Number is positive";
        expected2 = "Number is negative";
        expected3 = "Number is equal to zero";
    }

    @Test
    void compare1() {
        log.info("If number positive {} compare return {}", 3, signComparator.compare(3));
        assertEquals(expected1, signComparator.compare(3));
    }

    @Test
    void compare2() {
        log.info("If number negative {} compare return {}", -9, signComparator.compare(-9));
        assertEquals(expected2, signComparator.compare(-9));
    }

    @Test
    void compare3() {
        log.info("If number equals zero {} compare return {}", 0, signComparator.compare(0));
        assertEquals(expected3, signComparator.compare(0));
    }
}