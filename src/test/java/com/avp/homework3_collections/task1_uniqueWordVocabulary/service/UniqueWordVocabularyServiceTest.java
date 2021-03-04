package com.avp.homework3_collections.task1_uniqueWordVocabulary.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordVocabularyServiceTest {

    private static final Logger log = LoggerFactory.getLogger(UniqueWordVocabularyServiceTest.class);

    private static UniqueWordVocabularyService test;
    private static LinkedHashSet<String> testSet;
    private static final String word = "I am going to go to work after I am going to go home.";

    @BeforeAll
    static void beforeAll() {
        test = new UniqueWordVocabularyService();
        testSet = new LinkedHashSet<>();
    }

    @Test
    void addWord() {

        Set<String> expected = new LinkedHashSet<>();
        expected.add("I");
        expected.add("am");
        expected.add("going");
        expected.add("to");
        expected.add("go");
        expected.add("work");
        expected.add("after");
        expected.add("home");
        test.addWord(testSet, word);
        log.info("Collection expected {} equals testSet {}", expected, testSet);
        assertIterableEquals(expected, testSet);

    }

    @Test
    void getWordsCount() {
        for (String s : word.split("[\\p{Punct}\\s]+")) {
            testSet.add(s);
        }
        log.info("Amount elements in collection {} equals {}", testSet, testSet.size());
        assertEquals(8, test.getWordsCount(testSet));
    }

    @Test
    void printVocabulary() {
        for (String s : word.split("[\\p{Punct}\\s]+")) {
            testSet.add(s);
        }
        String expected = "I am going to go work after home ";
        log.info("This method must throw on console collection {} and it is \"{}\"", testSet, test.printVocabulary(testSet));
        assertEquals(expected, test.printVocabulary(testSet));
    }
}