package com.avp.homework3.task3_library.service;

import com.avp.homework3.task3_library.bean.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private final List<Book> books;

    public LibraryService (List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book findByName(String name) {
        for (Book book : books) {
            if (book.getBookName().equals(name)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> findByAuthor(String author) {
        List<Book> findAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthorName().equals(author)) {
                findAuthor.add(book);
            }
        }
        return findAuthor;
    }
}
