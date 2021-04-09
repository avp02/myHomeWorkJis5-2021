package com.avp.homework8inheritanceandinterfaces.task2shape;

public class Square extends AbstractShape {

    public Square(String name, double width) {
        super(name, width);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return Math.pow(super.width, 2);
    }
}
