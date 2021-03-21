package com.avp.homework8inheritanceandinterfaces.task1animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    private static final Logger log = LoggerFactory.getLogger(DogTest.class);
    private Dog test;
    private Dog test1;
    private Dog test2;

    @BeforeEach
    void beforeEach() {
        test = new Dog("dogName", "dogColor", 7,
                2, 2, "Petrovich", 8, "Vasilievich", 5);
        test1 = new Dog("dogName", "dogColor", 7,
                2, 2, "Petrovich", 8, "Vasilievich", 5);
        test2 = new Dog("dogName", "dogColor", 9,
                3, 2, "Ivanovich", 10, "Gennadievich", 7);
    }

    @Test
    void getAge() {
        int expected = 5;
        int actual = test.getAge();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void voice() {
        String expected = "I have 5 years, I have lastname Vasilievich, I have 8 mustache, I have 2 legs and 2 arms";
        String actual = test.voice();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void countAge() {
        String expected = "I'm old 10 years and my name is dogName, I'm dogColor color";
        String actual = test.countAge();
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
        String expected = "Dog{name='dogName', color='dogColor', amountMustache=8, lastName1='Vasilievich', age1=5, amountLeg=2, amountArm=2}";
        String actual = test.toString();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }
}