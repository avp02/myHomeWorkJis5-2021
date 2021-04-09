package com.avp.homework5_loops.task3_numberService.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

    private static final Logger log = LoggerFactory.getLogger(NumberServiceTest.class);
    private static NumberService test;
    private static int sumExpected1;
    private static int sumExpected2;

    @BeforeAll
    static void beforeAll() {
        test = new NumberService();
        sumExpected1 = 28;
        sumExpected2 = 12;
    }

    @Test
    void rangeSum1() {
        int start = 0;
        int finish = 7;
        log.info("Sum numbers in range from {} to {} equals {}",
                start, finish, test.rangeSum(start, finish));
        assertEquals(sumExpected1, test.rangeSum(start, finish));
    }

    @Test
    void rangeSum2() {
        int start = 7;
        int finish = 0;
        log.info("Sum numbers in range from {} to {} equals {}",
                start, finish, test.rangeSum(start, finish));
        assertEquals(sumExpected1, test.rangeSum(start, finish));
    }

    @Test
    void rangeEvenCount1() {
        int start = 0;
        int finish = 7;
        log.info("Sum even numbers in range from {} to {} equals {}",
                start, finish, test.rangeEvenCount(start, finish));
        assertEquals(sumExpected2, test.rangeEvenCount(start, finish));
    }

    @Test
    void rangeEvenCount2() {
        int start = 7;
        int finish = 0;
        log.info("Sum even numbers in range from {} to {} equals {}",
                start, finish, test.rangeEvenCount(start, finish));
        assertEquals(sumExpected2, test.rangeEvenCount(start, finish));
    }
}