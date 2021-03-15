package com.avp.homework6methodsclassesobjects.task5product.bean;
/*
1. Разработать класс - продукт, у которого должны быть следующие характеристики:
Свойства:
    Наименование (String name)
    Стандартная цена (double regularPrice)
    Скидка в процентах (double discount)
Методы:
Расчет актуальной стоимости с учетом скидки (double actualPrice())
Вывод информации о продукте в консоль (void printInformation())1P
2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".

Нефункциональные требования:

1. Класс с объявлением продукта должен называться "Product".
2. Класс с демонстрацией работы должен называться "ProductDemo".

Результат:

Загрузить файлы Product.java иProductDemo.java

1P. Вывод информации в консоль может быть в следующем виде, при значениях (name = Milk, regularPrice = 0.8, discount = 20):

Product : name = "Milk", regular price = 0.8 EUR, discount = 20%, actual price = 0.64 EUR
 */

import java.util.Objects;

public class Product {

    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.regularPrice, regularPrice) == 0 && Double.compare(product.discount, discount) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regularPrice, discount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", regularPrice=" + regularPrice +
                ", discount=" + discount +
                '}';
    }
}
