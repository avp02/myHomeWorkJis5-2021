package com.avp.homework3_collections.task2.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounterServiceTest {

    private static final Logger log = LoggerFactory.getLogger(UniqueWordCounterServiceTest.class);
    private static UniqueWordCounterService test;
    private static Map<String, Integer> testMap;

    @BeforeAll
    static void beforeAll() {
        testMap = new HashMap<>();
        test = new UniqueWordCounterService(testMap);
        test.addWord("apple");
        test.addWord("mango");
        test.addWord("mango");
        test.addWord("apple");
        test.addWord("apple");
    }

    @Test
    void addWord() {
        assertEquals(2, testMap.get("mango"));
        log.info("Mapa will look like - {}", testMap.toString());
    }

    @Test
    void getMostFrequentWord() {
        log.info("Will return word - {}", test.getMostFrequentWord());
        assertEquals("apple", test.getMostFrequentWord());
    }

    @Test
    void printWordsFrequency() {
        assertEquals("{apple=3, mango=2}", testMap.toString());
        log.info("Mapa will look like - {}", testMap.toString());
    }
}