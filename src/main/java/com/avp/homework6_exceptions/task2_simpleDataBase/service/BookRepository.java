package com.avp.homework6_exceptions.task2_simpleDataBase.service;

import com.avp.homework6_exceptions.task2_simpleDataBase.bean.Book;
import com.avp.homework6_exceptions.task2_simpleDataBase.exceptions.ItemNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository{

    private Map<String, Book> books;

    public BookRepository(Map<String, Book> books) {
        this.books = books;
    }
    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        for (Map.Entry<String, Book> entryBook : books.entrySet()) {
            if (entryBook.getValue().getId().equals(id)) {
                return entryBook.getValue();
            }
        }
        throw new ItemNotFoundException("The book didn't find with id " + id);
    }

    @Override
    public void save(Book item) {
        books.put(item.toString(), item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        for (Map.Entry<String, Book> bookEntry : books.entrySet()) {
            if (bookEntry.getValue().getId().equals(id)) {
                books.remove(bookEntry.getKey(), bookEntry.getValue());
                return;
            }
        }
        throw new ItemNotFoundException("The book isn't be with id " + id);
    }

}
