package com.avp.homework5_loops.task4_car.bean;

import java.util.Objects;

public class Car {

    private final String model;
    private final String color;
    private final int maxSpeed;
    private int currentSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && currentSpeed == car.currentSpeed && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, maxSpeed, currentSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
}
