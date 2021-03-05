package com.avp.homework4_conditionalOperators.task1_signComparator;

public class SignComparator {

    public String compare(int number) {
        if (number > 0) {
            return "Number is positive";
        } if (number < 0) {
            return "Number is negative";
        }
        return "Number is equal to zero";
    }
}
