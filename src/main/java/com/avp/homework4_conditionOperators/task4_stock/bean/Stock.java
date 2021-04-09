package com.avp.homework4_conditionOperators.task4_stock.bean;

import java.util.Objects;

public class Stock {

    private String name;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public Stock(String name, double currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {

        this.currentPrice = currentPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.currentPrice, currentPrice) == 0 && Double.compare(stock.minPrice, minPrice) == 0 && Double.compare(stock.maxPrice, maxPrice) == 0 && Objects.equals(name, stock.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, currentPrice, minPrice, maxPrice);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", currentPrice=" + currentPrice +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                '}';
    }
}


