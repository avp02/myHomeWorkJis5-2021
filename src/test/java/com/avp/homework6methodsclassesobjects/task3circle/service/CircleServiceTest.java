package com.avp.homework6methodsclassesobjects.task3circle.service;

import com.avp.homework6methodsclassesobjects.task3circle.bean.Circle;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CircleServiceTest {

    private static final Logger log = LoggerFactory.getLogger(CircleServiceTest.class);
    private final Circle testCircle = new Circle();
    private final CircleService test = new CircleService(testCircle);

    @Test
    void calculateArea() {
        testCircle.setRadius(5);
        double expected = 78.53981633974483;
        double actual = test.calculateArea();
        log.info("The circle's area with radius {} will be {}",
                testCircle.getRadius(), test.calculateArea());
        assertEquals(expected, actual, 0.1);
    }
}