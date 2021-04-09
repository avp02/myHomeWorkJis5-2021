package com.avp.homework6methodsclassesobjects.task4encoder.bean;
/*
1. Разработать класс - кодировщик, у которого должны быть следующие характеристики:
Методы:
    Преобразование кода в символ и вывод на экран (void encode(short code))1P
    Преобразование символ в код и вывод на экран (void decode(char symbol))2P

 */

import java.util.Objects;

public class Encoder {

    private char symbol;
    private short code;

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encoder encoder = (Encoder) o;
        return symbol == encoder.symbol && code == encoder.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, code);
    }

    @Override
    public String toString() {
        return "Encoder{" +
                "symbol=" + symbol +
                ", code=" + code +
                '}';
    }
}
