package com.avp.homework7methodsclassesobjects.task1dog.bean;
/*
1. Разработать класс - собака, у которого должны быть следующие характеристики:
Свойства:
Возраст (int age)
Цвет (String color)
Имя (String name)
Методы:
Голос (void voice())
Есть (void eat())
Спать (void sleep())
2. Свойства можно задавать через оператор "." либо через конструктор.
3. Методы должны выводить произвольный текст с описанием действия в консоль.
 */

import java.util.Objects;

public class Dog {

    private int age;
    private String color;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(color, dog.color) && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
