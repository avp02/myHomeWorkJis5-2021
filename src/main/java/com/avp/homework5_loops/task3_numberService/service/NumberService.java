package com.avp.homework5_loops.task3_numberService.service;

public class NumberService {
    public int rangeSum(int start, int finish) {
        int sum = 0;
        int i = start;
        if (start < finish) {
            while (i <= finish) {
                sum += i;
                i++;
            }
        } else {
            while (i >= finish) {
                sum += i;
                i--;
            }
        }
        return sum;
    }

    public int rangeEvenCount(int start, int finish) {
        int sum = 0;
        int i = start;
        if (start < finish) {
            while (i <= finish) {
                if (i % 2 == 0) {
                    sum += i;
                }
                i++;
            }
        } else {
            while (i >= finish) {
                if (i % 2 == 0) {
                    sum += i;
                }
                i--;
            }
        }
        return sum;
    }
}
