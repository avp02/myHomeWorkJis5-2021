package com.avp.homework8inheritanceandinterfaces.task2shape;

public class Circle extends AbstractShape{

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
