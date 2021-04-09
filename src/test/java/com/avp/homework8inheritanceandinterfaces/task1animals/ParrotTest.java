package com.avp.homework8inheritanceandinterfaces.task1animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTest {

    private static final Logger log = LoggerFactory.getLogger(ParrotTest.class);
    private Parrot test;
    private Parrot test1;
    private Parrot test2;

    @BeforeEach
    void beforeEach() {
        test = new Parrot("parrotName", "parrotColor", 9,
                2, 5, (short) 80,
                "fan-tailed", 10, true);
        test1 = new Parrot("parrotName", "parrotColor", 9,
                2, 5, (short) 80,
                "fan-tailed", 10, true);
        test2 = new Parrot("parrotName", "parrotColor", 11,
                4, 2, (short) 60,
                "lizard-tailed", 30, false);
    }

    @Test
    void getAge() {
        int expected = 10;
        int actual = test.getAge();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void voice() {
        String expected = "I have soundSing 80 and I'm belonging by fan-tailed";
        String actual = test.voice();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void countAge() {
        String expected = "I'm old 11 years and my name is parrotName, I have length beak is 5, do i sign true";
        String actual = test.countAge();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void testToString() {
        String expected = "Parrot{name='parrotName', color='parrotColor', lengthBeak=5, soundSing=80, subclass='fan-tailed', lengthTail=10, isSign=true}";
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