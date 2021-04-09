package com.avp.homework6methodsclassesobjects.task3circle.service;

import com.avp.homework6methodsclassesobjects.task3circle.bean.Circle;

public class CircleService {

    private final Circle circle;

    public CircleService(Circle circle) {
        this.circle = circle;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }
}
