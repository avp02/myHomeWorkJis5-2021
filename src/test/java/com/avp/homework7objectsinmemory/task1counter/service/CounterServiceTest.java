package com.avp.homework7objectsinmemory.task1counter.service;

import com.avp.homework7objectsinmemory.task1counter.bean.Counter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CounterServiceTest {

    private static final Logger log = LoggerFactory.getLogger(CounterServiceTest.class);
    private Counter counterTest;
    private CounterService test;

    @BeforeEach
    void beforeEach() {
        counterTest = new Counter();
        test = new CounterService(counterTest);
    }

    @Test
    void incrementTrue() {
        int expected = 1;
        test.increment();
        int actual = counterTest.getValue();
        log.info("Value after increment's method expected {} and it will be {}",
                expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void incrementIfSumValueAndStepMoreHundred() {
        counterTest.setStep(101);
        int expected = 0;
        test.increment();
        int actual = counterTest.getValue();
        log.info("Value after increment's method expected {} and it will be {}",
                expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void decrementDone() {
        counterTest.setValue(3);
        int expected = 2;
        test.decrement();
        int actual = counterTest.getValue();
        log.info("Value after decrement's method expected {} and it will be {}",
                expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void decrementIfValueMinusStepLessZero() {
        int expected = 0;
        test.decrement();
        int actual = counterTest.getValue();
        log.info("Value after decrement's method expected {} and it will be {}",
                expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void reset() {
        counterTest.setValue(100);
        counterTest.setStep(3);
        test.reset();
        int expected1 = 0;
        int expected2 = 1;
        int actual1 = counterTest.getValue();
        int actual2 = counterTest.getStep();
        log.info("Value after reset's method expected {} and it will be {}",
                expected1, actual1);
        log.info("Step after reset's method expected {} and it will be {}",
                expected1, actual1);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    void setValueTrue() {
        test.setValue();
        int expected = counterTest.getValue();
        log.info("Value after setValue's method expected {}",
                expected);
        assertTrue(expected >= 0 && expected <= 100);
    }

    @Test
    void setValueFalse() {
        test.setValue();
        int expected = counterTest.getValue();
        log.info("Value after setValue's method expected {}",
                expected);
        assertFalse(expected < 0 && expected > 100);
    }

    @Test
    void getValue() {
        test.getValue();
        counterTest.getValue();
        int expected = 0;
        int actual = counterTest.getValue();
        log.info("Value after getValue's method expected {} and it will be {}",
                expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void setStepTrue() {
        test.setStep();
        int expected = counterTest.getStep();
        log.info("Step after setStep's method expected {}",
                expected);
        assertTrue(expected > 0 && expected <= 10);
    }

    @Test
    void setStepFalse() {
        test.setStep();
        int expected = counterTest.getStep();
        log.info("Step after setStep's method expected {}",
                expected);
        assertFalse(expected <= 0 && expected > 10);
    }

    @Test
    void getStep() {
        test.getStep();
        int expected = 1;
        int actual = counterTest.getStep();
        log.info("Step after getStep's method expected {} and it will be {}",
                expected, actual);
        assertEquals(expected, actual);
    }
}