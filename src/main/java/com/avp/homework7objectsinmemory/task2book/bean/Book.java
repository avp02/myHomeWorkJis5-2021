package com.avp.homework7objectsinmemory.task2book.bean;
/*
Разработать класс книга Book с учетом правил инкапсуляции, который обладает следующими характеристиками:
Свойства
Автор
Название
Количество страниц
Для каждого из полей необходимо создать вспомогательные методы getter и setter (напр. String getAuthor() и void setAuthor(String author)).
Необходимо переопределить методы equals() и toString().
 */

import java.util.Objects;

public class Book {

    private String author;
    private String name;
    private int amountPage;

    public Book(String author, String name, int amountPage) {
        this.author = author;
        this.name = name;
        this.amountPage = amountPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountPage() {
        return amountPage;
    }

    public void setAmountPage(int amountPage) {
        this.amountPage = amountPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return amountPage == book.amountPage && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, amountPage);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", amountPage=" + amountPage +
                '}';
    }
}
