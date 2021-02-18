package com.avp.homework2.task1_arrayService.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ArrayService {

    private static final Logger logger = LoggerFactory.getLogger(ArrayService.class);
    private Random random = new Random();

    public int[] create(int size) {
        int[] array = new int[size];
        return array;
    }

    public void fillRandomly(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public void printArray(int[] array) {
        for (int i : array) {
            logger.info(String.valueOf(i));
        }

    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public double avg(int[] array) {
        double sum = 0;
        if (!(array == null) || !(array.length == 0)) {
            for (int i : array) {
                sum += i;
            }
            sum = sum / array.length;
        } else {
            sum = 0.0;
        }
        return sum;
    }

}
