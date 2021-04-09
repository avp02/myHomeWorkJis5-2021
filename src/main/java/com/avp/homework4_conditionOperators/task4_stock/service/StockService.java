package com.avp.homework4_conditionOperators.task4_stock.service;

import com.avp.homework4_conditionOperators.task4_stock.bean.Stock;

public class StockService {

    public void updatePrice(Stock stock, double newPrice) {
        stock.setCurrentPrice(newPrice);
        if (stock.getMinPrice() > newPrice) {
            stock.setMinPrice(newPrice);
        } else if (stock.getMaxPrice() < newPrice) {
            stock.setMaxPrice(newPrice);
        }

    }

    public String getPriceInformation(Stock stock) {
        String information = "Company = " + stock.getName() + ", Current Price = " + stock.getCurrentPrice() + ", Min Price = " + stock.getMinPrice() + ", Max Price = " + stock.getMaxPrice();
        return information;

    }
}
