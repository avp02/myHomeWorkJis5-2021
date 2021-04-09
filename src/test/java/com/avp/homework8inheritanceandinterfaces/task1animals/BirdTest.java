package com.avp.homework8inheritanceandinterfaces.task1animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    private static final Logger log = LoggerFactory.getLogger(BirdTest.class);
    private Bird test;
    private Bird test1;
    private Bird test2;

    @BeforeEach
    void beforeEach() {
        test = new Bird("birdName", "birdColor", 9,
                2, 5, (short) 80);
        test1 = new Bird("birdName", "birdColor", 9,
                2, 5, (short) 80);
        test2 = new Bird("birdName", "birdColor", 11,
                4, 2, (short) 60);
    }

    @Test
    void getAge() {
        int expected = 9;
        int actual = test.getAge();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void voice() {
        String expected = "I have 9 years I have soundSing 80";
        String actual = test.voice();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void countAge() {
        String expected = "I'm old 10 years and my name is birdName, I have length beak is 5";
        String actual = test.countAge();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void testToString() {  // поле super.age недоступно, потому что private
        String expected = "Bird{name='birdName', color='birdColor', amountWings=2, lengthBeak=5, soundSing=80}";
        String actual = test.toString();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
        boolean actual = test.equals(test1);
        boolean actual1 = test.equals(test2);
        log.info("I expected true and it equals {}", actual);
        log.info("I expected false and it equals {}", actual1);
        assertTrue(actual);
        assertFalse(actual1);
    }
}