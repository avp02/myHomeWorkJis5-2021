package com.avp.homework7objectsinmemory.task4tvandtvconroller.service;

import com.avp.homework7objectsinmemory.task4tvandtvconroller.bean.Tv;
import com.avp.homework7objectsinmemory.task4tvandtvconroller.bean.TvController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class TvControllerServiceTest {

    private static final Logger log = LoggerFactory.getLogger(TvControllerServiceTest.class);
    private Tv testTv;
    private TvController testTvController;
    private TvControllerService test;

    @BeforeEach
    void beforeEach() {
        testTv = new Tv();
        testTvController = new TvController();
        test = new TvControllerService(testTv, testTvController);
        testTv.setCurrentChannel(3);
        testTv.setCurrentSound(15);
    }

    @Test
    void IncreaseSound() {
        test.increaseSoundOne();
        int expected = 16;
        int actual = testTv.getCurrentSound();
        log.info("I expected that sound will be {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void switchChannelOneForward() {
        test.switchChannelOneForward();
        int expected = 4;
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

    @Test
    void switchChannelOneBack() {
        test.switchChannelOneBack();
        int expected = 2;
        int actual = testTv.getCurrentChannel();
        log.info("I expected that channel will be {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void reduceSoundByOne() {
        test.reduceSoundByOne();
        int expected = 14;
        int actual = testTv.getCurrentSound();
        log.info("I expected that sound will be {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void turnOnTv() {
        test.turnOnTv();
        boolean actual = testTv.isTurnOnTv();
        log.info("I expected that Tv turn off and it equals {}", actual);
        assertTrue(actual);
    }
}