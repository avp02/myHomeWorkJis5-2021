package com.avp.homework5_loops.task4_car.service;

import com.avp.homework5_loops.task4_car.bean.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    private static final Logger log = LoggerFactory.getLogger(CarServiceTest.class);
    private static Car testCar1;
    private static CarService test;

    @BeforeAll
    static void beforeAll() {
        testCar1 = new Car("Audi", "black", 200);
        test = new CarService(testCar1);
    }
    @Test
    void accelerateMove() {
        int targetSpeed = 180;
        int expected = 180;
        test.accelerate(targetSpeed);
        log.info("The speed of the car will be equal {} at a given speed {}",
                testCar1.getCurrentSpeed(), targetSpeed);
        assertEquals(expected, testCar1.getCurrentSpeed());
    }

    @Test
    void accelerateIfTargetSpeedLessZero() {
        int targetSpeed = -12;
        Assertions.assertThrows(IllegalArgumentException.class, () -> test.accelerate(targetSpeed));
    }

    @Test
    void accelerateStay() {
        testCar1.setCurrentSpeed(190);
        int targetSpeed = 180;
        int expected = 190;
        test.accelerate(targetSpeed);
        log.info("The speed of the car will be equal {} at a given speed {}",
                testCar1.getCurrentSpeed(), targetSpeed);
        assertEquals(expected, testCar1.getCurrentSpeed());
    }

    @Test
    void accelerateIfTargetSpeedMoreMaxSpeed() {
        testCar1.setCurrentSpeed(190);
        int targetSpeed = 220;
        int expected = 200;
        test.accelerate(targetSpeed);
        log.info("The speed of the car will be equal {} at a given speed {}",
                testCar1.getCurrentSpeed(), targetSpeed);
        assertEquals(expected, testCar1.getCurrentSpeed());
    }

    @Test
    void decelerate() {
        testCar1.setCurrentSpeed(110);
        int targetSpeed = 60;
        int expected = 60;
        test.decelerate(targetSpeed);
        log.info("The speed of the car will be equal {} at a given speed {}",
                testCar1.getCurrentSpeed(), targetSpeed);
        assertEquals(expected, testCar1.getCurrentSpeed());
    }

    @Test
    void decelerateIfTargetSpeedLessZero() {
        int targetSpeed = -39;
        Assertions.assertThrows(IllegalArgumentException.class, () -> test.decelerate(targetSpeed));
    }

    @Test
    void decelerateIfTargetSpeedMoreCurrentSpeed() {
        testCar1.setCurrentSpeed(60);
        int targetSpeed = 70;
        int expected = 60;
        test.decelerate(targetSpeed);
        log.info("The speed of the car will be equal {} at a given speed {}",
                testCar1.getCurrentSpeed(), targetSpeed);
        assertEquals(expected, testCar1.getCurrentSpeed());
    }

    @Test
    void isDriving() {
        testCar1.setCurrentSpeed(110);
        log.info("The speed of the car will be equal {} method given us {}",
                testCar1.getCurrentSpeed(), test.isDriving());
        assertTrue(test.isDriving());
    }

    @Test
    void isStopped() {
        testCar1.setCurrentSpeed(0);
        log.info("The speed of the car will be equal {} method given us {}",
                testCar1.getCurrentSpeed(), test.isStopped());
        assertTrue(test.isStopped());
    }

    @Test
    void canAccelerate() {
        testCar1.setCurrentSpeed(110);
        log.info("The speed of the car will be equal {} method given us {}",
                testCar1.getCurrentSpeed(), test.canAccelerate());
        assertTrue(test.canAccelerate());
    }


}