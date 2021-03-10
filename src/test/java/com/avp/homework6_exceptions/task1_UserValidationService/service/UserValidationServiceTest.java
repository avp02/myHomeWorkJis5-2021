package com.avp.homework6_exceptions.task1_UserValidationService.service;

import com.avp.homework6_exceptions.task1_UserValidationService.bean.User;
import com.avp.homework6_exceptions.task1_UserValidationService.exceptions.UserValidationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class UserValidationServiceTest {

    private static final Logger log = LoggerFactory.getLogger(UserValidationServiceTest.class);
    private User userTest;
    private UserValidationService test;

    @BeforeEach
    void setUp() {
        userTest = new User();
        test = new UserValidationService();
    }

    @Test
    void validateWrongFirstName() {
        userTest.setFirstName("Hi");
        log.info("Method throw exception, because firstName equals {}", userTest.getFirstName().length());
        Assertions.assertThrows(UserValidationException.class, () -> test.validate(userTest));
    }

    @Test
    void validateWrongLastName() {
        userTest.setFirstName("Vova");
        userTest.setLastName("Petranovskiwkessadaafffda");
        log.info("Method throw exception, because lastName equals {}", userTest.getLastName().length());
        Assertions.assertThrows(UserValidationException.class, () -> test.validate(userTest));
    }

    @Test
    void validateWrongAge() {
        userTest.setFirstName("Vova");
        userTest.setLastName("Petranovski");
        userTest.setAge(139);
        log.info("Method throw exception, because age equals {}", userTest.getAge());
        Assertions.assertThrows(UserValidationException.class, () -> test.validate(userTest));
    }
}