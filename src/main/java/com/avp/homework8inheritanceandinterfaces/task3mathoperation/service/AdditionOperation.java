package com.avp.homework8inheritanceandinterfaces.task3mathoperation.service;

public class AdditionOperation implements MathOperation{
    @Override
    public double compute(double a, double b) {
        return a + b;
    }
}
