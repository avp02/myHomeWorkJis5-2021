package com.avp.homework6_exceptions.task2_simpleDataBase.exceptions;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(String message) {
        super(message);
    }
}
