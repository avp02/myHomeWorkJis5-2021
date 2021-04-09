package com.avp.homework8inheritanceandinterfaces.task1animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    private static final Logger log = LoggerFactory.getLogger(CatTest.class);
    private Cat test;
    private Cat test1;
    private Cat test2;

    @BeforeEach
    void beforeEach() {
        test = new Cat("catName", "catColor", 7,
                2, 2, "Petrovna", 6, "Vasilievna", 3);
        test1 = new Cat("catName", "catColor", 7,
                2, 2, "Petrovna", 6, "Vasilievna", 3);
        test2 = new Cat("catName", "catColor", 9,
                3, 2, "Ivanovna", 8, "Gennadievna", 5);
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
        String expected = "I have 3 years, I have lastname Vasilievna, I have 6 mustache, I have 2 legs and 2 arms";
        String actual = test.voice();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void countAge() {
        String expected = "I'm old 6 years and my name is catName, I'm catColor color";
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
        String expected = "Cat{name='catName', color='catColor', amountMustache='6', lastName='Vasilievna', age1=3, amountLeg=2, amountArm=2}";
        String actual = test.toString();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }
}