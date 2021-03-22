package com.avp.homework5_loops.sumOfPrimes;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    private static final Logger log = LoggerFactory.getLogger(PrimeNumbers.class);

    @Test
    void checkSimpleTrue1() {
        int victim = 2;
        boolean actual = PrimeNumbers.checkSimple(victim);
        log.info("I expected true with parameter {} and got {}", victim, actual);
        assertTrue(actual);
    }

    @Test
    void checkSimpleTrue2() {
        int victim = 17;
        boolean actual = PrimeNumbers.checkSimple(victim);
        log.info("I expected true with parameter {} and got {}", victim, actual);
        assertTrue(actual);
    }

    @Test
    void checkSimpleFalse() {
        int victim = 4;
        boolean actual = PrimeNumbers.checkSimple(victim);
        log.info("I expected false with parameter {} and got {}", victim, actual);
        assertFalse(actual);
    }

    @Test
    void checkSimpleFalse1() {
        int victim = 55;
        boolean actual = PrimeNumbers.checkSimple(victim);
        log.info("I expected false with parameter {} and got {}", victim, actual);
        assertFalse(actual);
    }

    @Test
    void checkSimpleFalse2() {
        int victim = -3;
        boolean actual = PrimeNumbers.checkSimple(victim);
        log.info("I expected false with parameter {} and got {}", victim, actual);
        assertFalse(actual);
    }
}