package com.avp.homework2.task1_arrayService;

import com.avp.homework2.task1_arrayService.service.ArrayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ArrayServiceDemo {

    private static final Logger log = LoggerFactory.getLogger(ArrayServiceDemo.class);

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = {0, 9, 10, 7, 3};

        log.info(Arrays.toString(arrayService.create(10)));

        int[] arrayRandom = new int[10];
        arrayService.fillRandomly(arrayRandom);
        log.info(Arrays.toString(arrayRandom));

        arrayService.printArray(array);

        log.info(arrayService.sum(array) + "");

        log.info(arrayService.avg(array) + "");

    }
}
