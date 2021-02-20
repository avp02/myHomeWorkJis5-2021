package com.avp.homework2.task3_palindrom.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeServiceTest {

    private static final Logger log = LoggerFactory.getLogger(PalindromeServiceTest.class);

    private static PalindromeService test;

    @BeforeAll
    static void beforeAll() {
        test = new PalindromeService();
    }

    @Test
    void isPalindromeTrueTest() {
        log.info("Text - {} - is palindrome", "s.um sumMu,s muS");
        assertTrue(test.isPalindrome("s.um sumMu,s muS"));
    }

    @Test
    void isPalindromeFalseTest() {
        log.info("Text - {} - isn't palindrome", "Hello world");
        assertFalse(test.isPalindrome("Hello world"));
    }

    @Test
    void transformTextInArrayWithoutPunctuationMarksTest() {
        String text = "Hello world";
        String[] expected = {"hello", "world"};
        log.info("The text ({}) transform into array {}", text,
                test.transformTextInArrayWithoutPunctuationMarks(text));
        assertArrayEquals(expected, test.transformTextInArrayWithoutPunctuationMarks(text));
    }

    @Test
    void transformArrayInText() {
        String[] array = {"hello", "world"};
        String str = "helloworld";
        log.info("The array {} transform in text {}", test.transformArrayInText(array), str);
        assertEquals(str, test.transformArrayInText(array));
    }
}