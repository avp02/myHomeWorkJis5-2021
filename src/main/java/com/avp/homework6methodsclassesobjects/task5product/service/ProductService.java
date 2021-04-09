package com.avp.homework6methodsclassesobjects.task5product.service;

import com.avp.homework6methodsclassesobjects.task5product.bean.Product;

public class ProductService {

    private final Product product;

    public ProductService(Product product) {
        this.product = product;
    }

    public double actualPrice() {
        return product.getRegularPrice() - product.getRegularPrice() * product.getDiscount() / 100;
    }

    public String printInformation() {
        return "Product : name = \"" + product.getName() + "\", regular price = " + product.getRegularPrice() +
                " EUR, discount = " + product.getDiscount() + "%, actual price = " + actualPrice() + " EUR";
    }
}
