package com.avp.homework3.task3_library.bean;
/*
Класс Book должен состоять из автора книги и ее названия.

Оба свойства должны быть проинициализированы в момент создания книги и изменение состояния объекта после его создания запрещено.

Необходимо переопределить методы equals() и hashcode(), а также toString().

Класс Library должен выполнять роль хранилища книг в виде списка и выполнять следующие действия:

Добавить книгу в библиотеку
Удалить книгу из библиотеки
Найти одну книгу по названию
Вернуть все книги по автору
При создании объекта, список книг должен быть пустым, а не null.
 */

import java.util.Objects;

public class Book {

    private String bookName;
    private String authorName;

    public Book (String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
