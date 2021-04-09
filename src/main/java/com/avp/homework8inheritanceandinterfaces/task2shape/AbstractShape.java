package com.avp.homework8inheritanceandinterfaces.task2shape;

public abstract class AbstractShape implements Shape{

    protected String name;
    protected double width;

    public AbstractShape(String name, double width) {
        this.name = name;
        this.width = width;
    }

    public AbstractShape(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
