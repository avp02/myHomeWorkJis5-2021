package com.avp.homework7objectsinmemory.task4tvandtvconroller.service;

import com.avp.homework7objectsinmemory.task4tvandtvconroller.bean.Tv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TvControllerServiceTest {

    private static final Logger log = LoggerFactory.getLogger(TvControllerServiceTest.class);
    private Tv testTv;
    private TvService testTvService;
    private TvControllerService test;

    @BeforeEach
    void beforeEach() {
        testTv = new Tv();
        testTvService = new TvService(testTv);
        test = new TvControllerService(testTv, testTvService);
        testTv.setCurrentChannel(3);
        testTv.setCurrentSound(15);
    }

    @Test
    void IncreaseSound() {
        test.increaseSoundOne(testTv, testTvService);
        int expected = 16;
        int actual = testTv.getCurrentSound();
        log.info("I expected that sound will be {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void switchChannelOneForward() {
        testTv.setCurrentChannel(5);
        test.switchChannelOneForward();
        int expected = 6;
        int actual = testTv.getCurrentChannel();
        log.info("I expected that channel will be {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void turnOffTv() {
        test.turnOffTv();
        boolean actual = testTv.isTurnOnTv();
        log.info("I expected that Tv turn off and it equals {}", actual);
        assertFalse(actual);
    }
}