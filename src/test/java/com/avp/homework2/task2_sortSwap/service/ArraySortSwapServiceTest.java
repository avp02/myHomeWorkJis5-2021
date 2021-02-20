package com.avp.homework2.task2_sortSwap.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortSwapServiceTest {

    private static ArraySortSwapService test;
    private static int[] victim;
    private static final Logger log = LoggerFactory.getLogger(ArraySortSwapServiceTest.class);

    @BeforeAll
    static void beforeAll() {
        test = new ArraySortSwapService();
        victim = new int[]{5, -7, -1, 0, 9, 11};
    }

    @Test
    void sortTest() {
        int[] expected = {-7, -1, 0, 5, 9, 11};
        test.sort(victim);
        log.info("Массив victim в порядке возрастания будет {}", victim);
        assertArrayEquals(expected, victim);
    }

    @Test
    void swapTest() {
        int[] expected = {11, 9, 0, -1, -7, 5};
        test.swap(victim);
        log.info("Массив victim в обратном порядке {}", victim);
        assertArrayEquals(expected, victim);
    }
}