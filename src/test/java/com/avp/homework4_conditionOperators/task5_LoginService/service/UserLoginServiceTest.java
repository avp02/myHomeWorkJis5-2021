package com.avp.homework4_conditionOperators.task5_LoginService.service;

import com.avp.homework4_conditionOperators.task5_LoginService.bean.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class UserLoginServiceTest {

    private static final Logger log = LoggerFactory.getLogger(UserLoginServiceTest.class);
    private static UserLoginService testUserLoginService;
    private static User testUser;

    @BeforeAll
    static void beforeAll() {
        testUserLoginService = new UserLoginService();
        testUser = new User("User", "1234");
    }

    @Test
    void loginTestShouldReturnTrue() {
        UserLoginService testUserLoginService = new UserLoginService();
        User testUser = new User("User", "1234");
        boolean actual = testUserLoginService.login(testUser, "1234");
        boolean expected = true;
        log.info("Test return {} because password correct",
                testUserLoginService.login(testUser, "1234"));
        assertEquals(expected, actual);
    }
    @Test
    public void loginTestShouldReturnFalse() {
        boolean actual = testUserLoginService.login(testUser, "12345");
        boolean expected = false;
        log.info("Test return {} because password invalid",
                testUserLoginService.login(testUser, "12345"));
        assertEquals(expected, actual);
    }

    @Test
    public void checkIfPasswordMatchUserPasswordShouldReturnTrue() {
        boolean actual = testUserLoginService.comparePasswords(testUser, "1234");
        boolean expected = true;
        log.info("Test return {} because password correct",
                testUserLoginService.comparePasswords(testUser, "1234"));
        assertEquals(expected, actual);
    }
    @Test
    public void checkIfPasswordMatchUserPasswordShouldReturnFalse() {
        boolean actual = testUserLoginService.comparePasswords(testUser, "12345");
        boolean expected = false;
        log.info("Test return {} because password invalid",
                testUserLoginService.comparePasswords(testUser, "12345"));
        assertEquals(expected, actual);
    }

    @Test
    public void dropLoginAttemptsLeft() {
        User updatedUser = testUserLoginService.resetCountOfLoginAttempts(testUser);
        int expected = 3;
        int actual = updatedUser.getCountOfLoginAttempts();
        log.info("Amount attempts left equals {}",
                updatedUser.getCountOfLoginAttempts());
        assertEquals(expected, actual);
    }

    @Test
    public void isUserBlockedShouldReturnTrue() {
        testUser.setBlocked(true);
        boolean expected = true;
        boolean actual = testUserLoginService.isUserBlocked(testUser);
        log.info("Test return {} because user is blocked",
                testUserLoginService.isUserBlocked(testUser));
        assertEquals(expected, actual);
    }
    @Test
    public void isUserBlockedShouldReturnFalse() {
        testUser.setBlocked(false);
        boolean expected = false;
        boolean actual = testUserLoginService.isUserBlocked(testUser);
        log.info("Test return {} because user isn't blocked",
                testUserLoginService.isUserBlocked(testUser));
        assertEquals(expected, actual);
    }

    @Test
    public void decrementLoginAttemptLeft() {

        testUser.setCountOfLoginAttempts(3);
        int expected = 2;
        testUserLoginService.decrementCountOfLoginAttempts(testUser);
        int actual = testUser.getCountOfLoginAttempts();
        log.info("Amount attempts left will be decremented by one and equals {}",
                testUser.getCountOfLoginAttempts());
        assertEquals(expected, actual);
    }

    @Test
    public void blockUser() {
        boolean expected = true;
        testUserLoginService.blockUser(testUser);
        boolean actual = testUser.isBlocked();
        log.info("Test return {} because user is blocked",
                testUser.isBlocked());
        assertEquals(expected, actual);
    }

    @Test
    public void ifLoginAttemptLeftIsLeft() {
        testUser.setCountOfLoginAttempts(1);
        boolean expected = true;
        boolean actual = testUserLoginService.IsLoginAttemptsLeft(testUser);
        log.info("Test return {} because attempts left > 0",
                testUserLoginService.IsLoginAttemptsLeft(testUser));
        assertEquals(expected, actual);
    }

    @Test
    public void loginShouldBlockUser() {
        testUser.setCountOfLoginAttempts(1);
        testUserLoginService.login(testUser, "12345");
        boolean actual = testUser.isBlocked();
        boolean expected = true;
        log.info("Test return {} and blocked user because attempts left = 0",
                testUser.isBlocked());
        assertEquals(expected, actual);
    }
    @Test
    public void loginShouldNotProceed() {
        testUser.setCountOfLoginAttempts(0);
        testUser.setBlocked(true);
        boolean actual = testUserLoginService.login(testUser, "1234");
        boolean expected = false;
        log.info("Test return {} and blocked user because user is blocked",
                testUserLoginService.login(testUser, "1234"));
        assertEquals(expected, actual);
    }
}