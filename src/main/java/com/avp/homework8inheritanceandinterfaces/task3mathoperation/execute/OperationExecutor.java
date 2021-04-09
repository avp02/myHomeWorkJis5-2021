package com.avp.homework8inheritanceandinterfaces.task3mathoperation.execute;

import com.avp.homework8inheritanceandinterfaces.task3mathoperation.service.MathOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperationExecutor {

    private static final Logger log = LoggerFactory.getLogger(OperationExecutor.class);

    public void execute(MathOperation[] operations, double a, double b) {
        for (MathOperation mathOperation : operations) {
            log.info("{}", mathOperation.compute(a, b));
        }
    }
}
