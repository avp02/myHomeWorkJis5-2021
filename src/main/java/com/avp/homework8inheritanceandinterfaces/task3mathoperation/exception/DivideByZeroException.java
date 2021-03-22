package com.avp.homework8inheritanceandinterfaces.task3mathoperation.exception;

public class DivideByZeroException extends RuntimeException {

    public DivideByZeroException(String message) {
        super(message);
    }
}
