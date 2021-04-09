package com.avp.homework3_collections.task4_shop;

import com.avp.homework3_collections.task4_shop.bean.Product;
import com.avp.homework3_collections.task4_shop.service.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopDemo {

    private static final Logger log = LoggerFactory.getLogger(ShopDemo.class);

    public static void main(String[] args) {
        Product product1 = new Product("fish", new BigDecimal(100));
        Product product2 = new Product("meat", new BigDecimal(200));

        List<Product> demo = new ArrayList<>();
        ShopService shop = new ShopService(demo);

        shop.addProduct(product1);
        shop.addProduct(product2);
        log.info("The list is {}", demo);
        log.info("I found products in range from 100 to 200 and it is {}", shop.findProduct(
                new BigDecimal(100), new BigDecimal(200)));

        shop.deleteProduct(product1);
        log.info("The list is {}", demo);

        log.info("I found in list {} product {} by name {}", demo, shop.findByName("fish"), "fish");
    }
}
