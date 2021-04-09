package com.avp.homework7methodsclassesobjects.task2human.bean;
/*
1. Разработать класс - человек, у которого должны быть следующие характеристики:
Свойства:
  Имя (String name)
  Возраст (int age)
Методы:
   Приветствие (void greet()) - должен выводить на экран имя и возраст человека.1P
2. Свойства нужно задавать через конструктор.
 */

import java.util.Objects;

public class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
