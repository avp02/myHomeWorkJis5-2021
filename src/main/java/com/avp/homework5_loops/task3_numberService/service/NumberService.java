package com.avp.homework5_loops.task3_numberService.service;

public class NumberService {
    public int rangeSum(int start, int finish) {
        int sum = 0;
        if (start < finish) {
            while (start <= finish) {
                sum += start;
                start++;
            }
        } else {
            while (start >= finish) {
                sum += start;
                start--;
            }
        }
        return sum;
    }

    public int rangeEvenCount(int start, int finish) {
        int sum = 0;
        if (start < finish) {
            while (start <= finish) {
                if (start % 2 == 0) {
                    sum += start;
                }
                start++;
            }
        } else {
            while (start >= finish) {
                if (start % 2 == 0) {
                    sum += start;
                }
                start--;
            }
        }
        return sum;
    }
}
