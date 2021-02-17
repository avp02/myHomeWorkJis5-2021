package com.avp.lesson1.task4_randomGenerator;

import java.util.Random;

public class RandomGeneratorService {

    private final Random random = new Random();

    public int generateNumber() {
        return random.nextInt(100);
    }

    public int sumFromThreeRandomNumbers() {
        return random.nextInt(100) + random.nextInt(100) + random.nextInt(100);
    }
}
