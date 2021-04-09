package com.avp.homework8inheritanceandinterfaces.task2shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDemo {

    private static final Logger log = LoggerFactory.getLogger(Shape.class);

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Circle", 2.0),
                new Square("Square", 3.0),
                new Triangle("Triangle", 4.0, 5)
        };
        for (Shape shape : shapes) {
            log.info( "{} : {}", shape.getName(), shape.getArea());
        }
    }

}
