package com.avp.homework2.task4_copy.service;

public class CopyService {
    public int[] copyInRange(int[] a1, int i, int i1) {

        int tmp = 0;
        for (int j : a1) {
            if (j >= i && j <= i1) {
                tmp++;
            }
        }

        int[] out = new int[tmp];
        tmp = 0;
        for (int j : a1) {
            if (j >= i && j <= i1) {
                out[tmp] = j;
                tmp++;
            }
        }
        return  out;
    }
}
