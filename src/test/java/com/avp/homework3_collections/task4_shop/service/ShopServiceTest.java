package com.avp.homework3_collections.task4_shop.service;

import com.avp.homework3_collections.task4_shop.bean.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    private static final Logger log = LoggerFactory.getLogger(ShopServiceTest.class);
    private static Product productTest1;
    private static Product productTest2;
    private static List<Product> listTest;
    private static ShopService shopTest;

    @BeforeAll
    static void beforeAll() {
        productTest1 = new Product("fish", new BigDecimal(100));
        productTest2 = new Product("meat", new BigDecimal(200));

        listTest = new ArrayList<>();
        listTest.add(productTest1);
        listTest.add(productTest2);
        shopTest = new ShopService(listTest);

    }

    @Test
    void addProduct() {
        shopTest.addProduct(productTest1);
        shopTest.addProduct(productTest2);
        log.info("The size a list {} equals {}", listTest, listTest.size());
        assertEquals(3, listTest.size());
    }

    @Test
    void deleteProduct() {
        shopTest.deleteProduct(productTest2);
        log.info("The size a list {} equals {}", listTest, listTest.size());
        assertEquals(1, listTest.size());
    }

    @Test
    void findByName() {
        log.info("I found in list {} product {} by name {}", listTest, shopTest.findByName("fish"), "fish");
        assertEquals(Optional.of(productTest1), shopTest.findByName("fish"));
    }


    @Test
    void findProduct() {
        log.info("I found products in range from 100 to 200 and it is {}", shopTest.findProduct(
                new BigDecimal(100), new BigDecimal(200)));
        assertIterableEquals(listTest, shopTest.findProduct(new BigDecimal(100), new BigDecimal(200)));
    }
}