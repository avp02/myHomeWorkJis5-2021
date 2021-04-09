package com.avp.homework7objectsinmemory.task2book.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private static final Logger log = LoggerFactory.getLogger(BookTest.class);
    private Book test1;
    private Book test2;
    private Book test3;

    @BeforeEach
    void beforeEach() {
        test1 = new Book("Lermontov", "Angel", 321);
        test2 = new Book("Lermontov", "Angel", 321);
        test3 = new Book("Pushkin", "Onegin", 123);
    }

    @Test
    void getAuthor() {
        String expected = "Lermontov";
        String actual = test1.getAuthor();
        log.info("I expected {} and got {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void setAuthor() {
        String expected = "Block";
        test1.setAuthor(expected);
        String actual = test1.getAuthor();
        log.info("I expected {} and got {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void getName() {
        String expected = "Angel";
        String actual = test1.getName();
        log.info("I expected {} and got {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void setName() {
        String expected = "Vasia";
        test1.setName(expected);
        String actual = test1.getName();
        log.info("I expected {} and got {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void getAmountPage() {
        int expected = 321;
        int actual = test1.getAmountPage();
        log.info("I expected {} and got {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void setAmountPage() {
        int expected = 456;
        test1.setAmountPage(expected);
        int actual = test1.getAmountPage();
        log.info("I expected {} and got {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void testEqualsTrue() {
        log.info("Value object's test1 equals value object's test2 = {}",
                test1.equals(test2));
        assertTrue(test1.equals(test2));
    }

    @Test
    void testEqualsFalse() {
        log.info("Value object's test1 isn't equals value object's test2 = {}",
                test1.equals(test3));
        assertFalse(test1.equals(test3));
    }

    @Test
    void testHashCodeEquals() {
        Integer expected = test1.hashCode();
        Integer actual = expected;
        log.info("Value object's expected {} equals value object's actual {}",
                expected.hashCode(), actual.hashCode());
        assertEquals(expected, actual);

    }

    @Test
    void testHashCodeIsntEquals() {
        Integer expected = test1.hashCode();
        Integer actual = test3.hashCode();
        log.info("Value object's test1 {} equals value object's test3 {}",
                test1.hashCode(), test3.hashCode());
        assertNotEquals(expected, actual);

    }

    @Test
    void testToStringTrue() {
        String expected = "Book{author='Lermontov', name='Angel', amountPage=321}";
        String actual = test1.toString();
        log.info("I expected that {} equals {}", expected, actual);
        assertEquals(expected, actual);

    }

    @Test
    void testToStringFalse() {
        String expected = "Book{author='Lermontov124254', name='Angel', amountPage=321}";
        String actual = test1.toString();
        log.info("I expected that {} doesn't equals {}", expected, actual);
        assertNotEquals(expected, actual);

    }
}