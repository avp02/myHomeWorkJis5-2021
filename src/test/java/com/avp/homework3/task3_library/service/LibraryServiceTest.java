package com.avp.homework3.task3_library.service;

import com.avp.homework3.task3_library.bean.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceTest {

    private static final Logger log = LoggerFactory.getLogger(LibraryServiceTest.class);
    private static LibraryService testLibrary;
    private static Book testBook1;
    private static Book testBook2;
    private static List<Book> testList;

    @BeforeAll
    static void beforeAll() {
        testBook1 = new Book("War and Peace", "Leo Tolstoy");
        testBook2 = new Book("Anna Karenina", "Leo Tolstoy");
        testList = new ArrayList<>();
        testLibrary = new LibraryService(testList);
        testLibrary.addBook(testBook1);
        testLibrary.addBook(testBook2);
    }

    @Test
    void addBook() {
        log.info("Size of list {} equals {}", testList, testList.size());
        assertEquals(2, testList.size());
    }

    @Test
    void findByName() {
        log.info("I found according to name {} book {}", "War and Peace", testLibrary.findByName("War and Peace"));
        assertEquals(testBook1, testLibrary.findByName("War and Peace"));
    }

    @Test
    void findByAuthor() {
        List<Book> expected = new ArrayList<>();
        expected.add(testBook1);
        expected.add(testBook2);
        log.info("I found according to author {} all books {}", "Leo Tolstoy", testLibrary.findByAuthor("Leo Tolstoy"));
        assertIterableEquals(expected, testLibrary.findByAuthor("Leo Tolstoy"));
    }

    @Test
    void removeBook() {
        testLibrary.removeBook(testBook1);
        testLibrary.removeBook(testBook2);
        log.info("Size of list {} equals {}", testList, testList.size());
        assertEquals(0, testList.size());
    }
}