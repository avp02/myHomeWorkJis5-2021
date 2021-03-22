package com.avp.homework8inheritanceandinterfaces.task3mathoperation.service;

import com.avp.homework8inheritanceandinterfaces.task3mathoperation.exception.DivideByZeroException;

public class DivisionOperation implements MathOperation{
    @Override
    public double compute(double a, double b) {
        if(b == 0) {
            throw new DivideByZeroException("The value b will be not equals zero");
        }
        return a / b;
    }
}
