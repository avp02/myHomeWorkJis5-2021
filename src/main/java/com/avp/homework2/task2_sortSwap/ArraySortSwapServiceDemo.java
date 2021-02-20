package com.avp.homework2.task2_sortSwap;

import com.avp.homework2.task2_sortSwap.service.ArraySortSwapService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ArraySortSwapServiceDemo {

    private static final Logger log = LoggerFactory.getLogger(ArraySortSwapServiceDemo.class);

    public static void main(String[] args) {
        int[] a1 = {4, 7, 2, 3, 8, 9, 5, 1, 6};
        int[] a2 = {1, 3, 8, 5, 4, 7, 9, 6, 2};

        log.info(Arrays.toString(a1));
        log.info(Arrays.toString(a2));

        ArraySortSwapService svc = new ArraySortSwapService();
        svc.sort(a1);
        log.info( Arrays.toString(a1));
        svc.swap(a2);
        log.info(Arrays.toString(a2));
    }
}
