package com.avp.homework3.task3_library;

import com.avp.homework3.task3_library.bean.Book;
import com.avp.homework3.task3_library.service.LibraryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class LibraryDemo {

    private static final Logger log = LoggerFactory.getLogger(LibraryDemo.class);
    private static final List<Book> books = new ArrayList<>();
    private static final LibraryService libraryService = new LibraryService(books);

    public static void main(String[] args) {
        Book bookOne = new Book("War and Peace", "Leo Tolstoy");
        Book bookTwo = new Book("Anna Karenina", "Leo Tolstoy");

        libraryService.addBook(bookOne);
        libraryService.addBook(bookTwo);

        log.info("I found according to name {} book {}\n", "War and Peace",libraryService.findByName("War and Peace"));
        log.info("I found according to author {} all books {}\n", "Leo Tolstoy",libraryService.findByAuthor("Leo Tolstoy"));

        libraryService.removeBook(bookTwo);
        log.info("I book {} from library and got this list {}", bookTwo, books);
    }
}
