package com.avp.homework2.task1_arrayService.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {
    private static ArrayService test;
    private static final Logger log = LoggerFactory.getLogger(ArrayServiceTest.class);
    private static int size;
    private static int[] array;

    @BeforeAll
    static void beforeAll() {
        test = new ArrayService();
        size = 10;
        array = new int[size];
    }

    @Test
    void createTest() {
        log.info("Размер масива c заданной длинной = {}, равен {};", size, test.create(size).length);
        assertEquals(10, test.create(size).length);
    }

    @Test
    void fillRandomlyTest() {
        test.fillRandomly(array);
        log.info("Размер масива c заданной длинной = {}, равен {};", size, array.length);
        assertEquals(10, array.length);
        assertTrue(array[9] <= 100 && array[9] > -1);
    }

    @Test
    void printArrayTest() {
        int[] arrayExpected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayActual = new int[10];
        for (int i = 0; i < arrayActual.length; i++) {
            arrayActual[i] = i;
        }
        test.printArray(arrayActual);
        log.info("Массив {}, полностью соответствует массиву {};", arrayExpected, arrayActual);
        assertArrayEquals(arrayExpected, arrayActual);
    }

    @Test
    void sumTest() {
        int[] arrayExample = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        log.info("Сумма всех элементов массив {} = {};", arrayExample, test.sum(arrayExample));
        assertEquals(45, test.sum(arrayExample));
    }

    @Test
    void avgTest() {
        int[] arrayExample = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        log.info("Среднее арифметическое всех элементов массив {} = {};", arrayExample, test.avg(arrayExample));
        assertEquals(4.5, test.avg(arrayExample));
    }

    @Test
    void avgIsEmptyTest() {
        int[] arrayExample = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        log.info("Среднее арифметическое всех элементов массив {} = {};", arrayExample, test.avg(arrayExample));
        assertEquals(0, test.avg(arrayExample));
    }
}