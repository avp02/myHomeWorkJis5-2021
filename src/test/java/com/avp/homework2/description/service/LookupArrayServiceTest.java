package com.avp.homework2.description.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class LookupArrayServiceTest {

    private static LookupArrayService test;
    private static final Logger log = LoggerFactory.getLogger(LookupArrayServiceTest.class);
    private static int[] victim;
    private static final int[] arrayEmpty = {};

    @BeforeAll
    static void beforeAll() {
        test = new LookupArrayService();
        victim = new int[]{1, -6, 9, 10, 0};
    }

    @Test
    void findMaxTest() {
        log.info("Max value in array {} = {} ", victim, test.findMax(victim));
        assertEquals(10, test.findMax(victim));
        log.info("Max value in array {} = {} ", arrayEmpty, test.findMax(arrayEmpty));
        assertEquals(0, test.findMax(arrayEmpty));
    }

    @Test
    void findMinTest() {
        log.info("Min value in array {} = {} ", victim, test.findMin(victim));
        assertEquals(-6, test.findMin(victim));
        log.info("Min value in array {} = {} ", arrayEmpty, test.findMin(arrayEmpty));
        assertEquals(0, test.findMin(arrayEmpty));
    }

    @Test
    void indexOfMaxTest() {
        log.info("Index max of value in array {} = {} ", victim, test.indexOfMax(victim));
        assertEquals(3, test.indexOfMax(victim));
        log.info("Index max of value in array {} = {} ", arrayEmpty, test.indexOfMax(arrayEmpty));
        assertEquals(-1, test.indexOfMax(arrayEmpty));
    }

    @Test
    void indexOfMinTest() {
        log.info("Index min of value in array {} = {} ", victim, test.indexOfMin(victim));
        assertEquals(1, test.indexOfMin(victim));
        log.info("Will return {} for arrayEmpty {} ", test.indexOfMin(arrayEmpty), arrayEmpty);
        assertEquals(-1, test.indexOfMin(arrayEmpty));
    }

    @Test
    void indexOfTest() {
        log.info("Index of value in array {} = {} ", victim, test.indexOf(victim, 9));
        assertEquals(2, test.indexOf(victim, 9));
        log.info("Will return {} for arrayEmpty {} ", test.indexOf(arrayEmpty, 9), arrayEmpty);
        assertEquals(-1, test.indexOf(arrayEmpty, 9));
    }
}