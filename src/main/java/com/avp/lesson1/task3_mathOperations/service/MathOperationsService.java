package com.avp.lesson1.task3_mathOperations.service;

import com.avp.lesson1.task3_mathOperations.bean.MathOperations;

public class MathOperationsService {

    private final MathOperations math;

    public MathOperationsService(MathOperations math) {
        this.math = math;
    }

    public double addition() {
         return math.getA() + math.getB();
     }

    public double subtraction() {
        return math.getA() - math.getB();
    }

    public double multiplication() {
        return math.getA() * math.getB();
    }

    public double division() {
        if (math.getB() == 0) {
            throw new ArithmeticException("Warning");
        }
        return math.getA() / math.getB();
    }
}
