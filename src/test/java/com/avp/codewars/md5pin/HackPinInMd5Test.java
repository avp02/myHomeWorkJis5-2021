package com.avp.codewars.md5pin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HackPinInMd5Test {

    private final HackPinInMd5 test = new HackPinInMd5();

    @Test
    void hackPin() {
        String expected = "827ccb0eea8a706c4c34a16891f84e7b";
        String actual = test.transformPinIntoMd5("12345");
        assertEquals(expected, actual);
    }

    @Test
    void transformHashCodeMd5IntoPassword() {
        String expected = "12345";
        String actual = test.transformHashCodeMd5IntoPassword("827ccb0eea8a706c4c34a16891f84e7b");
        assertEquals(expected, actual);
    }
}