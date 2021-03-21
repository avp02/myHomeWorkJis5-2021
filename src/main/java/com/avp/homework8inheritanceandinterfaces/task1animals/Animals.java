package com.avp.homework8inheritanceandinterfaces.task1animals;
/*
Разработать иерархию классов, которая представляет классификацию животных в следующем виде:

Animal

Mammal                              Bird

Cat       Dog                           Parrot

Добавить каждому из классов произвольные свойства и методы с разными модификаторами доступа (public, protected, private). Произвольно переопределить методы родительского класса или дополнить их логику в классе - наследнике.
В каждом классе переопределить методы equals() и toString().
Нефункциональные требования:
Продемонстрировать работу методов с учетом логических требований.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Animals {

    private static final Logger log = LoggerFactory.getLogger(Animals.class);

    public String name;
    protected String color;
    private int age;

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    private String getName() {
        return "My name is " + name;
    }

    protected int getAge() {
        return age;
    }

    public String voice() {
        return "I have " + String.valueOf(age) + " years";
    }

    public String countAge() {
        age += 1;
        return "I'm old " + age + " years and my name is " + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name) && Objects.equals(color, animals.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
