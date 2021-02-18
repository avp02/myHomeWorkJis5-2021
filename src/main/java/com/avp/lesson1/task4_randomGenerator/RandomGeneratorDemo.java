package com.avp.lesson1.task4_randomGenerator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomGeneratorDemo {

    private static final Logger log = LoggerFactory.getLogger(RandomGeneratorDemo.class);

    public static void main(String[] args) {
        RandomGeneratorService service = new RandomGeneratorService();

        log.info("First random number = {}", service.generateNumber());
        log.info("Second random number = {}", service.generateNumber());
        log.info("Third random number = {}", service.generateNumber());
        log.info("Sum of three random numbers = {}", service.sumFromThreeRandomNumbers());

    }
}
