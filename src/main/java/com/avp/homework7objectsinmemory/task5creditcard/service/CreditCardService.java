package com.avp.homework7objectsinmemory.task5creditcard.service;

import com.avp.homework7objectsinmemory.task5creditcard.bean.CreditCard;

public class CreditCardService {

    private final CreditCard creditCard;

    public CreditCardService(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    boolean deposit(String pinCode, double sum) {
        if (isPinCode(pinCode)) {
            if (!isLoanDebtMoreLimit()) {
                if (isBalanceMoreSum(sum)) {
                    creditCard.setBalance(creditCard.getBalance() - sum);
                }
                creditCard.setLoanDebt(Math.abs(creditCard.getBalance() - sum));
            } else {
                return false;
            }
            return true;
        }
        return false;
    }

    boolean withdraw(String pinCode, double sum) {
        if (isPinCode(pinCode)) {
            if (isLoanDebtEqualsZero()) {
                creditCard.setBalance(creditCard.getBalance() + sum);
            }
            if (isSumMoreLoanDebt(sum)) {
                creditCard.setBalance(sum - creditCard.getLoanDebt());
            } else {
                creditCard.setLoanDebt(creditCard.getLoanDebt() - sum);
            }
            return true;
        }
        return false;
    }

    public boolean isPinCode(String pinCode) {
        return creditCard.getPinCode().equals(pinCode);
    }

    public boolean isLoanDebtMoreLimit() {
        return creditCard.getLoanDebt() > creditCard.getLimit();
    }

    public boolean isBalanceMoreSum(double sum) {
        return creditCard.getBalance() >= sum;
    }

    public boolean isLoanDebtEqualsZero() {
        return creditCard.getLoanDebt() == 0;
    }

    public boolean isSumMoreLoanDebt(double sum) {
        return sum >= creditCard.getLoanDebt();
    }
}
