package com.avp.homework8inheritanceandinterfaces.task2shape;

public class Triangle extends AbstractShape{

    private double height;

    public Triangle(String name, double width, double height) {
        super(name, width);
        this.height = height;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return width * height / 2;
    }
}
