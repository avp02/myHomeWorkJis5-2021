package com.avp.homework6methodsclassesobjects.task5product.service;

import com.avp.homework6methodsclassesobjects.task5product.bean.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    private static final Logger log = LoggerFactory.getLogger(ProductServiceTest.class);

    private static Product productTest;
    private static ProductService test;

    @BeforeAll
    static void beforeAll() {
        productTest = new Product("Milk");
        test = new ProductService(productTest);
        productTest.setRegularPrice(0.8);
        productTest.setDiscount(20);

    }

    @Test
    void actualPrice() {
        double expected = 0.64;
        double actual = test.actualPrice();
        log.info("The actual price with regular price {} and discount {}% will be {}",
                 productTest.getRegularPrice(), productTest.getDiscount(), test.actualPrice());
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void printInformation() {
        String expected = "Product : name = \"Milk\", regular price = 0.8 EUR, discount = 20.0%, actual price = 0.64 EUR";
        String actual = test.printInformation();
        assertEquals(expected, actual);
    }
}