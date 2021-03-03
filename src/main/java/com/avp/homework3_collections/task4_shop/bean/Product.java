package com.avp.homework3_collections.task4_shop.bean;
/*
Необходимо разработать систему учета продуктов. Для этого нужно создать два класса: товар Product и магазин Shop.
Класс Product описывает наименование товара и его стоимость (BigDecimal).
Создать товар можно только с именем и стоимостью и свойства не должны изменяться после создания обьекта.
Класс Shop описывает примитивный магазин, в котором содержится список товаров. Должен выполнять следующие функции:
Добавить товар
Удалить товар
Найти товар по названию
Найти все товары, которые входят в ценовой диапазон (findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange)
 */
import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private String nameProduct;
    private BigDecimal price;

    public Product(String nameProduct, BigDecimal price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameProduct, product.nameProduct) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }
}
