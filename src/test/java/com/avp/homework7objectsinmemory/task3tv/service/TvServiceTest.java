package com.avp.homework7objectsinmemory.task3tv.service;

import com.avp.homework7objectsinmemory.task3tv.bean.Tv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class TvServiceTest {

    private static final Logger log = LoggerFactory.getLogger(TvServiceTest.class);
    private Tv testTv;
    private TvService test;

    @BeforeEach
    void beforeEach() {
        testTv = new Tv();
        test = new TvService();
        testTv.setCurrentChannel(3);
        testTv.setCurrentSound(15);
    }

    @Test
    void switchChannelOneForward() {
        test.switchChannelOneForward(testTv);
        int expected = 4;
        int actual = testTv.getCurrentChannel();
        log.info("I expected that channel will be {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void switchChannelOneBack() {
        test.switchChannelOneBack(testTv);
        int expected = 2;
        int actual = testTv.getCurrentChannel();
        log.info("I expected that channel will be {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void turnOnTv() {
        test.turnOnTv(testTv);
        boolean actual = testTv.isTurnOnTv();
        log.info("I expected that Tv turn on and it equals {}", actual);
        assertTrue(actual);
    }

    @Test
    void turnOffTv() {
        test.turnOffTv(testTv);
        boolean actual = testTv.isTurnOnTv();
        log.info("I expected that Tv turn off and it equals {}", actual);
        assertFalse(actual);
    }

    @Test
    void increaseSoundOne() {
        test.increaseSoundOne(testTv);
        int expected = 16;
        int actual = testTv.getCurrentSound();
        log.info("I expected that sound will be {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void reduceSoundByOne() {
        test.reduceSoundByOne(testTv);
        int expected = 14;
        int actual = testTv.getCurrentSound();
        log.info("I expected that sound will be {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }
}