package com.avp.homework7methodsclassesobjects.task2human.service;

import com.avp.homework7methodsclassesobjects.task2human.bean.Human;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class HumanServiceTest {

    private static final Logger log = LoggerFactory.getLogger(HumanServiceTest.class);

    private static final Human testHuman = new Human("John", 20);
    private static final HumanService test = new HumanService(testHuman);

    @Test
    void greed() {
        String expected = "Hi! My name is John, I'm 20 years old";
        String actual= test.greed();
        log.info("Human with name {} and age {} greed {}", testHuman.getName(),
                testHuman.getAge(), test.greed());
        assertEquals(expected, actual);
    }
}