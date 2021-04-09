package com.avp.homework7objectsinmemory.task4tvandtvconroller.service;

import com.avp.homework7objectsinmemory.task4tvandtvconroller.bean.TvController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class TvControllerServiceTest {

    private static final Logger log = LoggerFactory.getLogger(TvControllerServiceTest.class);
    private TvController testTvController;
    private TvControllerService test;

    @BeforeEach
    void beforeEach() {
        testTvController = new TvController();
        test = new TvControllerService(testTvController);
        testTvController.setCurrentChannel(3);
        testTvController.setCurrentSound(15);
    }

    @Test
    void increaseSound() {
        test.increaseSoundOne();
        int expected = 16;
        int actual = testTvController.getCurrentSound();
        log.info("I expected that sound will be {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void switchChannelOneForward() {
        test.switchChannelOneForward();
        int expected = 4;
        int actual = testTvController.getCurrentChannel();
        log.info("I expected that channel will be {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void turnOffTv() {
        test.turnOffTv();
        boolean actual = testTvController.isTurnOnTv();
        log.info("I expected that Tv turn off and it equals {}", actual);
        assertFalse(actual);
    }

    @Test
    void switchChannelOneBack() {
        test.switchChannelOneBack();
        int expected = 2;
        int actual = testTvController.getCurrentChannel();
        log.info("I expected that channel will be {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void reduceSoundByOne() {
        test.reduceSoundByOne();
        int expected = 14;
        int actual = testTvController.getCurrentSound();
        log.info("I expected that sound will be {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void turnOnTv() {
        test.turnOnTv();
        boolean actual = testTvController.isTurnOnTv();
        log.info("I expected that Tv turn off and it equals {}", actual);
        assertTrue(actual);
    }
}
