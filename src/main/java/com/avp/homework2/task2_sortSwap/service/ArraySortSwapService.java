package com.avp.homework2.task2_sortSwap.service;

public class ArraySortSwapService {

    public void sort(int[] array) {
        for (int i = array.length - 1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1]= tmp;
                }
            }
        }
    }

    public void swap(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[array.length -1 - i];
             array[array.length -1 - i] = array[i];
            array[i] = tmp;
        }
    }
}
