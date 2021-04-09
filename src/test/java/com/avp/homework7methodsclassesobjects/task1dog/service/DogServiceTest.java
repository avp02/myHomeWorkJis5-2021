package com.avp.homework7methodsclassesobjects.task1dog.service;

import com.avp.homework7methodsclassesobjects.task1dog.bean.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class DogServiceTest {

    private static final Logger log = LoggerFactory.getLogger(DogServiceTest.class);

    private static final Dog testDog = new Dog();
    private static final DogService test = new DogService();

    @Test
    void voice() {
        testDog.setAge(2);
        testDog.setColor("Black");
        testDog.setName("Nick");
        log.info("Dog age {}, color {}, name {} said {}",
                testDog.getAge(), testDog.getColor(), testDog.getName(), test.voice());
        String expected = "gav-gav";
        String actual = test.voice();
        assertEquals(expected, actual);
    }

    @Test
    void eat() {
        testDog.setAge(1);
        testDog.setColor("White");
        testDog.setName("Sharick");
        log.info("Dog age {}, color {}, name {} eat {}",
                testDog.getAge(), testDog.getColor(), testDog.getName(), test.eat());
        String expected = "Ням-ням";
        String actual = test.eat();
        assertEquals(expected, actual);
    }

    @Test
    void sleep() {
        testDog.setAge(5);
        testDog.setColor("Green");
        testDog.setName("Masha");
        log.info("Dog age {}, color {}, name {} sleep {}",
                testDog.getAge(), testDog.getColor(), testDog.getName(),test.sleep());
        String expected = "Thrrrr";
        String actual = test.sleep();
        assertEquals(expected, actual);
    }
}