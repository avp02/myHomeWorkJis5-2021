package com.avp.homework4_conditionOperators.task4_stock.service;

import com.avp.homework4_conditionOperators.task4_stock.bean.Stock;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class StockServiceTest {

    private static final Logger log = LoggerFactory.getLogger(StockServiceTest.class);
    private static Stock stockTest;
    private static StockService test;

    @BeforeAll
    static void beforeAll() {
        stockTest = new Stock("Shell", 10);
        test = new StockService();
    }

    @Test
    void updatePrice() {
        double[] newPrice = {12, 5, 7, 99, 77};
        double[] maxPriceExpected = {12, 12, 12, 99, 99};
        double[] minPriceExpected = {10, 5, 5, 5, 5};
        for (int i = 0; i < minPriceExpected.length; i++) {
            test.updatePrice(stockTest, newPrice[i]);
            double maxPriceActual = stockTest.getMaxPrice();
            assertTrue(maxPriceExpected[i] == maxPriceActual);
            log.info("Maximum price at new price {} will be {}", newPrice[i], stockTest.getMaxPrice());

            double minPriceActual = stockTest.getMinPrice();
            assertTrue(minPriceExpected[i] == minPriceActual);
            log.info("Minimum price at new price {} will be {}", newPrice[i], stockTest.getMinPrice());

        }
    }

    @Test
    void getPriceInformation() {
        String expected = "Company = Shell, Current Price = 77.0, Min Price = 5.0, Max Price = 99.0";
        assertEquals(expected, test.getPriceInformation(stockTest));
    }
}