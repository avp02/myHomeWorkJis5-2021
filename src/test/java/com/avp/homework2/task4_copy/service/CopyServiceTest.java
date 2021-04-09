package com.avp.homework2.task4_copy.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CopyServiceTest {

    private static final Logger log = LoggerFactory.getLogger(CopyServiceTest.class);

    @Test
    void copyInRange() {
        CopyService test = new CopyService();
        int[] forCopy = {100, -1, -101, 5, 394, 400, -3, 11, 10};
        int[] expected = {-1, 5, -3, 10};
        log.info("Ожидаемый массив, скопированный из массива {}, будет {}",
                forCopy, test.copyInRange(forCopy, -100, 10));
        assertArrayEquals(expected, test.copyInRange(forCopy, -100, 10));
    }
}