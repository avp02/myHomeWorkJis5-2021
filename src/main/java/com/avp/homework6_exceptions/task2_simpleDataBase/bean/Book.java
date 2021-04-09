package com.avp.homework6_exceptions.task2_simpleDataBase.bean;
/*
Разработайте универсальный интерфейс Repository<T>, который будет представлять следующий набор методов:

List<T> findAll();
T findById(String id) throws ItemNotFoundException;
save(T item);
delete(String id) throws ItemNotFoundException;
Разработайте класс Book, который будет содержать в себе следующие поля:
String id
String name
String author
int pagesCount
Обязательные методы для переопределения: equals(), hashCode() и toString().
Getter методы для всех полей обязательны.
Инициализация полей через конструктор или setter методы на выбор.
Разработайте класс BookRepository,
который реализует интерфейс Repository для типа Book на основе коллекции Map<String, T>, где T - класс Book.
В случае, если книга с переданным идентификатором не найдена,
методы findById() и delete() должны выбросить исключение ItemNotFoundException с идентификатором объекта.
 */

import java.util.Objects;

public class Book {

    private String id;
    private String name;
    private String author;
    private int pagesCount;

    public Book(String id, String name, String author, int pagesCount) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pagesCount == book.pagesCount && Objects.equals(id, book.id) && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, pagesCount);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pagesCount=" + pagesCount +
                '}';
    }
}
