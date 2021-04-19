package com.avp.homework11.task1_stringStrinbuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class StringStringBuilderTest {

    private static final Logger log = LoggerFactory.getLogger(StringStringBuilderApp.class);
    private StringStringBuilder test;
    private String testString;


    @BeforeEach
    void beforeEach() {
        test = new StringStringBuilder();
        testString = "Выбирать решения - это легко.";
    }

    @Test
    void buildPhraseFromWords() {
        String expected = "Выбирать решения - это легко.";
        String actual = test.buildPhraseFromWords("Выбирать ", "решения ", "- ", "это ", "легко.");
        log.info("I expecte {} and I got {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void insertMethod() {
        String expected = "ВыбOneирать решения - это легко.";
        String actual = test.insertMethod(new StringBuilder(testString)).toString();
        log.info("I expecte {} and I got {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void deleteMethod() {
        String expected = "решения - это легко.";
        String actual = test.deleteMethod(new StringBuilder(testString)).toString();
        log.info("I expecte {} and I got {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void replaceMethod() {
        String expected = "Выбирать replace - это легко.";
        String actual = test.replaceMethod(new StringBuilder(testString)).toString();
        log.info("I expecte {} and I got {}", expected, actual);
        assertEquals(expected, actual);
    }
}