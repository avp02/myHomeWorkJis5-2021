package com.avp.homework7objectsinmemory.task5creditcard.bean;
/*
Необходимо разработать класс "кредитная карта" CreditCard с учетом инкапсуляции, которая обладает следующими характеристиками:
Свойства
Номер карты
Пин-код карты
Баланс
Кредитный лимит
Задолженность по кредиту
Методы
Зачисление средств на карту ("deposit")
Снятие средств с карты ("withdraw")
При создании карты нужно указывать ее номер и пинкод. Начальный баланс и задолженность по кредиту равны 0. Кредитный лимит можно менять после создания карты.
Требования к снятию средств:
При снятии средств с карты необходимо указывать пин-код и желаемую сумму;
Если пин-коды не совпадают, операция по снятию денег должна быть отклонена;
Деньги снимаются с карточного баланса. В случае, если их не хватает, остаток суммы нужно брать за счет задолженности по кредиту;
Если сумма задолженности превышает кредитный лимит, операция по снятию денег должна быть отклонена;
Требования к зачислению средств:
При зачислении средств на карту необходимо указывать пин-код и желаемую сумму;
Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена;
В первую очередь зачисление покрывает задолженность по кредиту;
Если задолженность по кредиту равна 0, то остаток средств зачисляется в счет баланса;
Нефункциональные требования:
Продемонстрировать работу всех методов с учетом логический требований.
Опционально: Написать тестовые сценарии для класса CreditCard в классе CreditCardTest. Все тестовые сценарии должны отрабатывать без ошибок.
 */

import java.util.Objects;

public class CreditCard {

    private final String numberCard;
    private final String pinCode;
    private double balance;
    private double limit;
    private double loanDebt;

    public CreditCard(String numberCard, String pinCode) {
        this.numberCard = numberCard;
        this.pinCode = pinCode;
        this.balance = 0.;
        this.loanDebt = 0.;
    }

    public String getPinCode() {
        return pinCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getLoanDebt() {
        return loanDebt;
    }

    public void setLoanDebt(double loanDebt) {
        this.loanDebt = loanDebt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Double.compare(that.balance, balance) == 0 && Double.compare(that.limit, limit) == 0 && Double.compare(that.loanDebt, loanDebt) == 0 && Objects.equals(numberCard, that.numberCard) && Objects.equals(pinCode, that.pinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberCard, pinCode, balance, limit, loanDebt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "numberCard='" + numberCard + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", balance=" + balance +
                ", limit=" + limit +
                ", loanDebt=" + loanDebt +
                '}';
    }
}
