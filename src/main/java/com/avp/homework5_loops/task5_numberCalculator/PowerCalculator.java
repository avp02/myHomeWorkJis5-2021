package com.avp.homework5_loops.task5_numberCalculator;

public class PowerCalculator {

    public int raiseToPower(int a, int b) {
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
