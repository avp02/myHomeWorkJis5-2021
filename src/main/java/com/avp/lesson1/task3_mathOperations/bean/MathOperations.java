package com.avp.lesson1.task3_mathOperations.bean;

import java.util.Objects;

public class MathOperations {
    private double a;
    private double b;

    public MathOperations() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathOperations that = (MathOperations) o;
        return Double.compare(that.a, a) == 0 && Double.compare(that.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "MathOperations{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
