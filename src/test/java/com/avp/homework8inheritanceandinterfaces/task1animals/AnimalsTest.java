package com.avp.homework8inheritanceandinterfaces.task1animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {

    private static final Logger log = LoggerFactory.getLogger(AnimalsTest.class);
    private Animals test;
    private Animals test1;
    private Animals test2;

    @BeforeEach
    void beforeEach() {
        test = new Animals("parentName", "parentColor", 3);
        test1 = new Animals("parentName", "parentColor", 3);
        test2 = new Animals("parentName2", "parentColor2", 5);
    }

    @Test
    void getAge() {
        int expected = 3;
        int actual = test.getAge();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void voice() {
        String expected = "I have 3 years";
        String actual = test.voice();
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

    @Test
    void testToString() {
        String expected = "Animals{name='parentName', color='parentColor', age=3}";
        String actual = test.toString();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void countAge() {
        String expected = "I'm old 4 years and my name is My name is parentName";
        String actual = test.countAge();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }
}