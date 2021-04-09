package com.avp.homework6methodsclassesobjects.task4encoder.service;

import com.avp.homework6methodsclassesobjects.task4encoder.bean.Encoder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class EncoderServiceTest {

    private static final Logger log = LoggerFactory.getLogger(EncoderServiceTest.class);
    private static Encoder testEncoder;
    private static EncoderService test;

    @BeforeAll
    static void beforeAll() {
        testEncoder = new Encoder();
        test = new EncoderService(testEncoder);
    }

    @Test
    void encode() {
        short victim = 65;
        char code = 'A';
        test.encode(victim);
        String expected = victim + " => " + code;
        String actual = victim + " => " + testEncoder.getSymbol();
        log.info("{} => {}", victim, testEncoder.getSymbol());
        assertEquals(expected, actual);

    }

    @Test
    void decode() {
        short code = 88;
        char victim = 'X';
        test.decode(victim);
        String expected = victim + " => " + code;
        String actual = victim + " => " + testEncoder.getCode();
        log.info("{} => {}", victim, testEncoder.getCode());
        assertEquals(expected, actual);
    }
}