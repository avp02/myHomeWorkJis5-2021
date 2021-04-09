package com.avp.homework6_exceptions.task2_simpleDataBase.service;

import com.avp.homework6_exceptions.task2_simpleDataBase.bean.Book;
import com.avp.homework6_exceptions.task2_simpleDataBase.exceptions.ItemNotFoundException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryTest {

    private static final Logger log = LoggerFactory.getLogger(BookRepositoryTest.class);

    private static final Book bookTest1 = new Book("1", "bookOne", "PushkinOne", 100);
    private static final Book bookTest2 = new Book("2", "bookTwo", "PushkinTwo", 200);
    private static final Book bookTest3 = new Book("3", "bookThree", "PushkinThree", 300);
    private static BookRepository bookRepositoryTest;
    private static final Map<String, Book> booksTest = new HashMap<>();

    @BeforeAll
    static void beforeAll() {
        bookRepositoryTest = new BookRepository(booksTest);
        bookRepositoryTest.save(bookTest1);
        bookRepositoryTest.save(bookTest2);
        bookRepositoryTest.save(bookTest3);
    }

    @Test
    void findAll() {
        List<Book> expected = new ArrayList<>();
        expected.add(bookTest1);
        expected.add(bookTest2);
        expected.add(bookTest3);
        List<Book> actual = bookRepositoryTest.findAll();
        expected.sort(Comparator.comparing(Book::getId));
        actual.sort(Comparator.comparing(Book::getId));
        log.info("I expected that collection expected {} will be equals {}",
                expected, actual);
        assertIterableEquals(expected, actual);

    }

    @Test
    void findById() {
        Book expected = bookTest1;
        Book actual = bookRepositoryTest.findById("1");
        log.info("I expected that book expected {} will be equals book {}",
                expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void findByIdThrowItemNotFoundException() {
        String victimId = "5";
        assertThrows(ItemNotFoundException.class, () -> bookRepositoryTest.findById(victimId));
    }

    @Test
    void save() {
        int expected = 3;
        int actual = booksTest.size();
        log.info("I expected collection's size {} and I got {}", expected,  actual);
        assertEquals(expected, actual);
    }

    @Test
    void delete() {
        Map<String, Book> test = new HashMap<>();
        test.put(bookTest1.toString(), bookTest1);
        test.put(bookTest2.toString(), bookTest2);
        test.put(bookTest3.toString(), bookTest3);
        BookRepository testDelete = new BookRepository(test);
        int expected = 2;
        String victimId = String.valueOf(3);
        Book book = testDelete.findById(victimId);
        testDelete.delete(book.getId());
        int actual = test.size();
        log.info("I expected that size collection {} will be equals book {}", test,
                expected);
        assertEquals(expected, actual);
    }

    @Test
    void deleteThrowItemNotFoundException() {
        String victimId = "4";
        assertThrows(ItemNotFoundException.class, () -> bookRepositoryTest.findById(victimId));
    }
}