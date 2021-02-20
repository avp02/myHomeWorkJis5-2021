package com.avp.homework2.description.service;

public class LookupArrayService {
    public int findMax(int[] array) {
        int max = 0;
        if (array != null) {
            if (array.length != 0) {
                for (int i : array) {
                    if (i > max) {
                        max = i;
                    }
                }
                return max;
            }
        }
        return 0;
    }

    public int findMin(int[] array) {
        int min = 0;
        if (array != null) {
            if (array.length != 0) {
                for (int i : array) {
                    if (i < min) {
                        min = i;
                    }
                }
                return min;
            }
        }
        return 0;
    }

    public int indexOfMax(int[] array) {
        int indexMaxValue = 0;
        if (array != null) {
            if (array.length != 0) {
                for (int i = 0; i < array.length; i++) {
                    if (array[indexMaxValue] < array[i]) {
                        indexMaxValue = i;
                    }
                }
                return indexMaxValue;
            }
        }
        return -1;
    }

    public int indexOfMin(int[] array) {
        int indexMinValue = 0;
        if (array != null) {
            if (array.length != 0) {
                for (int i = 0; i < array.length; i++) {
                    if (array[indexMinValue] > array[i]) {
                        indexMinValue = i;
                    }
                }
                return indexMinValue;
            }
        }
        return -1;
    }

    public int indexOf(int[] array, int value) {
        if (array != null) {
            if (array.length != 0) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == value) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
