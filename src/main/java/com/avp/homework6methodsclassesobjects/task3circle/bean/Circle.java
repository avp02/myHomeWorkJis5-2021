package com.avp.homework6methodsclassesobjects.task3circle.bean;
/*
1. Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства:
    Радиус (double radius)
Методы:
    Расчет площади (double calculateArea())
2. Свойства можно задавать через оператор ".", либо через конструктор.
 */

import java.util.Objects;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
