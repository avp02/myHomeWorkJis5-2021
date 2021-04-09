package com.avp.homework6_exceptions.task2_simpleDataBase.service;

import com.avp.homework6_exceptions.task2_simpleDataBase.bean.Book;
import com.avp.homework6_exceptions.task2_simpleDataBase.exceptions.ItemNotFoundException;

import java.util.List;

public interface Repository {

    List<Book> findAll();

    Book findById(String id) throws ItemNotFoundException;

    void save(Book item);

    void delete(String id) throws ItemNotFoundException;
}
