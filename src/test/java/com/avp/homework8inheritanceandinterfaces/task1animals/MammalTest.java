package com.avp.homework8inheritanceandinterfaces.task1animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    private static final Logger log = LoggerFactory.getLogger(MammalTest.class);
    private Mammal test;
    private Mammal test1;
    private Mammal test2;

    @BeforeEach
    void beforeEach() {
        test = new Mammal("mammalName", "mammmalColor", 9,
                2, 2, "Petrovna");
        test1 = new Mammal("mammalName", "mammmalColor", 9,
                2, 2, "Petrovna");
        test2 = new Mammal("mammalName", "mammmalColor", 11,
                3, 2, "Ivanovna");
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
        String expected = "I have 10 years I have lastname Petrovna";
        String actual = test.voice();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void countAge() {
        String expected = "I'm old 11 years and my name is mammalName";
        String actual = test.countAge();
        log.info("I expected age {} and it equals {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void testToString() {  // поле super.age недоступно, потому что private
        String expected = "Mammal{name='mammalName', color='mammmalColor', amountLeg=2, amountArm=2, lastName='Petrovna'}";
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