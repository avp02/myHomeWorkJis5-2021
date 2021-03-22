package com.avp.homework8inheritanceandinterfaces.task3mathoperation;

import com.avp.homework8inheritanceandinterfaces.task3mathoperation.execute.OperationExecutor;
import com.avp.homework8inheritanceandinterfaces.task3mathoperation.service.*;

public class MathOperationDemo {

    public static void main(String[] args) {
        OperationExecutor demo = new OperationExecutor();
        MathOperation[] operations = {
                new AdditionOperation(),
                new SubtractionOperation(),
                new MultiplicationOperation(),
                new DivisionOperation()
        };
        demo.execute(operations, -10, 0);
    }
}
