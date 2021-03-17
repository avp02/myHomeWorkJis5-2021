package com.avp.homework7objectsinmemory.task4tvandtvconroller.bean;
/*
Разработать классы телевизор Tv и TvController с учетом инкапсуляции.
Класс Tv можно брать из предыдущего задания, поскольку требования идентичны.
Класс TvController должен обладать следующими характеристиками:
Свойства
Подключенный телевизор
Методы
Дублируются методы класса Tv
Подключить телевизор к пульту (выступает в роли setter метода для поля Tv tv)
Через пульт необходимо контролировать телевизор (напр. включать, менять канал или уровень громкости).
Нефункциональные требования:
Продемонстрировать подключение телевизора к пульту, а также использование методов пульта, которые делегируют вызов на телевизор, к которому подключен пульт
 */

import java.util.Objects;

public class TvController extends Tv {

    private boolean tvTurnOn;

    public boolean isTvTurnOn() {
        return tvTurnOn;
    }

    public void setTvTurnOn(boolean tvTurnOn) {
        this.tvTurnOn = tvTurnOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TvController that = (TvController) o;
        return tvTurnOn == that.tvTurnOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tvTurnOn);
    }

    @Override
    public String toString() {
        return "TvController{" +
                "tvTurnOn=" + tvTurnOn +
                '}';
    }
}
