package com.avp.homework5_loops.sumOfPrimes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeNumbers {

    private static final Logger log = LoggerFactory.getLogger(PrimeNumbers.class);

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 2; i <= 500; i++) {
            if (checkSimple(i)) {
                if (i == 17 || i == 71) {
                    continue;
                }
                sum += i;
                count++;
                if (count == 50) {
                    break;
                }
            }
        }
        log.info("Sum = {}, count = {}", sum, count);
    }

    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }
}
