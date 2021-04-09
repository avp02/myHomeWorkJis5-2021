package com.avp.homework7objectsinmemory.task1counter.bean;
/*
Разработать класс "Счетчик" Counter, который реализует логику счетчика положительных чисел с определенным шагом.
В качестве полей класса выступают:
value - текущее значение счетчика;
step - шаг, с котором изменяется состояние счетчика;
Методы класса:
increment() - увеличить значение счетчика с учетом шага;
Условие: Если результат сложения текущего состояния счетчика и шага больше 100, тогда операцию не выполнять;
decrement() - уменьшить значение счетчика с учетом шага;
Условие: Если результат вычитания текущего состояния счетчика от шага меньше 0, тогда операцию не выполнять;
reset() - сбросить значение и шаг счетчика в начальное состояние;
setValue() - переопределение текущего значения;
Условие: Значение должно быть в диапазоне 0 .. 100;
getValue() - получение текущего значения;
setStep() - переопределение шага;
Условие: Значение должно быть в диапазоне 1 .. 10;
getStep() - получение текущего шага;
 */

import java.util.Objects;

public class Counter {

    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return value == counter.value && step == counter.step;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, step);
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                ", step=" + step +
                '}';
    }
}
