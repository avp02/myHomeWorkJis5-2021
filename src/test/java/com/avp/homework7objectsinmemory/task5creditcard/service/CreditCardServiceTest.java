package com.avp.homework7objectsinmemory.task5creditcard.service;

import com.avp.homework7objectsinmemory.task5creditcard.bean.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardServiceTest {

    private static final Logger log = LoggerFactory.getLogger(CreditCardServiceTest.class);
    private CreditCard testCard;
    private CreditCardService test;
    private String pinCodeCorrect;
    private String pinCodeIncorrect;
    private boolean victimTrue;
    private boolean victimFalse;
    private double sumCorrect;

    @BeforeEach
    void beforeEach() {
        testCard = new CreditCard("123456789", "1234");
        test = new CreditCardService(testCard);
        testCard.setLimit(100);
        testCard.setLoanDebt(0);
        pinCodeCorrect = "1234";
        pinCodeIncorrect = "4321";
        victimFalse = false;
        victimTrue = true;
        sumCorrect = 50.0;
    }

    @Test
    void depositPinTrue() {
        boolean actual = test.deposit(pinCodeCorrect, sumCorrect);
        log.info("I expected {} and I got {}", victimTrue, test.deposit(pinCodeCorrect, sumCorrect));
        assertTrue(actual);
    }

    @Test
    void depositIfLoanDebtLessLimit() {
        boolean actual = test.deposit(pinCodeCorrect, sumCorrect);
        log.info("I expected {} and I got {}", victimTrue, test.deposit(pinCodeCorrect, sumCorrect));
        assertTrue(actual);

        double expected = 50.0;
        log.info("I expected loanDebt {} equals {}", testCard.getLoanDebt(), expected);
        assertEquals(expected, testCard.getLoanDebt(), 0.01);

        testCard.setLoanDebt(0);
        testCard.setBalance(50.0);
        double expected2 = 0;
        boolean actual2 = test.deposit(pinCodeCorrect, sumCorrect);
        log.info("I expected balance {} equals {}", testCard.getBalance(), expected2);
        assertTrue(actual2);
        assertEquals(expected2, testCard.getBalance(), 0.01);
    }

    @Test
    void depositIfLoanDebtMoreLimit() {
        testCard.setLoanDebt(150);
        boolean actual = test.deposit(pinCodeCorrect, sumCorrect);
        log.info("I expected {} and I got {}", victimFalse, test.deposit(pinCodeCorrect, sumCorrect));
        assertFalse(actual);
    }

    @Test
    void depositPinFalse() {
        boolean actual = test.deposit(pinCodeIncorrect, sumCorrect);
        log.info("I expected {} and I got {}", victimFalse, test.deposit(pinCodeIncorrect, sumCorrect));
        assertFalse(actual);
    }

    @Test
    void withdrawPinTrue() {
        boolean actual = test.withdraw(pinCodeCorrect, sumCorrect);
        log.info("I expected {} and I got {}", victimTrue, test.withdraw(pinCodeCorrect, sumCorrect));
        assertTrue(actual);
    }

    @Test
    void withdrawPinFalse() {
        boolean actual = test.withdraw(pinCodeIncorrect, sumCorrect);
        log.info("I expected {} and I got {}", victimFalse, test.withdraw(pinCodeIncorrect, sumCorrect));
        assertFalse(actual);
    }

    @Test
    void withdrawIfLoanDebtMoreOrLessSum() {
        testCard.setLoanDebt(100);
        boolean actual = test.withdraw(pinCodeCorrect, sumCorrect);
        log.info("I expected {} and I got {}", victimTrue, test.withdraw(pinCodeCorrect, sumCorrect));
        assertTrue(actual);
        double expected = 50.0;
        log.info("I expected loanDebt {} equals {}", testCard.getLoanDebt(), expected);
        assertEquals(expected, testCard.getLoanDebt(), 0.01);
    }

    @Test
    void withdrawIfLoanDebtLessSum(){
        testCard.setLoanDebt(40);
        boolean actual1 = test.withdraw(pinCodeCorrect, sumCorrect);
        log.info("I expected {} and I got {}", victimTrue, test.withdraw(pinCodeCorrect, sumCorrect));
        assertTrue(actual1);
        double expected = 10.0;
        log.info("I expected balance {} equals {}", testCard.getBalance(), expected);
        assertEquals(expected, testCard.getBalance(), 0.01);
    }

    @Test
    void withdrawIfLoanDebtEqualsZero() {
        boolean actual1 = test.withdraw(pinCodeCorrect, sumCorrect);
        log.info("I expected {} and I got {}", victimTrue, test.withdraw(pinCodeCorrect, sumCorrect));
        assertTrue(actual1);
        double expected = 50;
        log.info("I expected balance {} equals {}", testCard.getBalance(), expected);
        assertEquals(expected, testCard.getBalance(), 0.01);
    }

    @Test
    void isPinCodeTrue() {
        boolean actual = test.isPinCode(pinCodeCorrect);
        log.info("I expected {} and I got {}", victimTrue, test.isPinCode(pinCodeCorrect));
        assertTrue(actual);
    }

    @Test
    void isPinCodeFalse() {
        boolean actual = test.isPinCode(pinCodeIncorrect);
        log.info("I expected {} and I got {}", victimFalse, test.isPinCode(pinCodeIncorrect));
        assertFalse(actual);
    }

    @Test
    void isLoanDebtMoreLimitTrue() {
        testCard.setLoanDebt(150);
        boolean actual = test.isLoanDebtMoreLimit();
        log.info("I expected {} and I got {}", victimTrue, test.isLoanDebtMoreLimit());
        assertTrue(actual);
    }

    @Test
    void isLoanDebtMoreLimitFalse() {
        testCard.setLoanDebt(50);
        boolean actual = test.isLoanDebtMoreLimit();
        log.info("I expected {} and I got {}", victimFalse, test.isLoanDebtMoreLimit());
        assertFalse(actual);
    }

    @Test
    void isBalanceMoreSumTrue() {
        testCard.setBalance(200);
        double sum = 140;
        boolean actual = test.isBalanceMoreSum(sum);
        log.info("I expected {} and I got {}", victimTrue, test.isBalanceMoreSum(sum));
        assertTrue(actual);
    }

    @Test
    void isBalanceMoreSumFalse() {
        testCard.setBalance(100);
        double sum = 140;
        boolean actual = test.isBalanceMoreSum(sum);
        log.info("I expected {} and I got {}", victimFalse, test.isBalanceMoreSum(sum));
        assertFalse(actual);
    }

    @Test
    void isLoanDebtEqualsZeroTrue() {
        boolean actual = test.isLoanDebtEqualsZero();
        log.info("I expected {} and I got {}", victimTrue, test.isLoanDebtEqualsZero());
        assertTrue(actual);
    }

    @Test
    void isLoanDebtEqualsZeroFalse() {
        testCard.setLoanDebt(10);
        boolean actual = test.isLoanDebtEqualsZero();
        log.info("I expected {} and I got {}", victimFalse, test.isLoanDebtEqualsZero());
        assertFalse(actual);
    }

    @Test
    void isSumMoreLoanDebtTrue() {
        boolean actual = test.isSumMoreLoanDebt(sumCorrect);
        log.info("I expected {} and I got {}", victimTrue, test.isSumMoreLoanDebt(sumCorrect));
        assertTrue(actual);
    }

    @Test
    void isSumMoreLoanDebtFalse() {
        testCard.setLoanDebt(70);
        boolean actual = test.isSumMoreLoanDebt(sumCorrect);
        log.info("I expected {} and I got {}", victimFalse, test.isSumMoreLoanDebt(sumCorrect));
        assertFalse(actual);
    }
}