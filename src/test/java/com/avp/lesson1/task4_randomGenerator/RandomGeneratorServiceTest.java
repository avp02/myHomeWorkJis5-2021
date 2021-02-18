package com.avp.lesson1.task4_randomGenerator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class RandomGeneratorServiceTest {

    private static RandomGeneratorService test;
    private static final Logger logger = LoggerFactory.getLogger(RandomGeneratorServiceTest.class);

    @BeforeAll
    static void beforeAll() {
        test = new RandomGeneratorService();
    }


    @Test
     void generateNumberTest() {
        logger.info("Result {} < 100 and {} > -1", test.generateNumber(), test.generateNumber());
        assertTrue(test.generateNumber() < 100 && test.generateNumber() > -1);
    }

    @Test
    void sumFromThreeRandomNumbersTest() {
        logger.info("Result {} < 298 and {} > -1", test.sumFromThreeRandomNumbers(), test.sumFromThreeRandomNumbers());
        assertTrue(test.sumFromThreeRandomNumbers() < 298 && test.sumFromThreeRandomNumbers() > -1);
    }
}