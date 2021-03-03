package com.avp.homework3_collections.task4_shop.service;

import com.avp.homework3_collections.task4_shop.bean.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShopService {

    private List<Product> products;

    public ShopService(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public Optional<Product> findByName(String name) {
        for (Product product : products) {
            if (product.getNameProduct().equals(name)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public List<Product> findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        List<Product> productsRange = new ArrayList<>();
        for (Product product : products) {
            int minResult = product.getPrice().compareTo(minPriceRange);
            int maxResult = product.getPrice().compareTo(maxPriceRange);
            if (minResult >= 0 && maxResult <= 0) {
                productsRange.add(product);
            }
        }
        return productsRange;
    }
}
