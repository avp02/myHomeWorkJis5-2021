package com.avp.homework4_conditionOperators.task3_colorDetector;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class LightColorDetectorTest {

    private static final Logger log = LoggerFactory.getLogger(LightColorDetectorTest.class);
    private static final LightColorDetector test = new LightColorDetector();

    @Test
    public void detectTheColorOfTheSpectrumViolet() {
        String expected = "Violet";
        String actual = test.detect(449);
        log.info("Color for wavelength {} will be {}", 449, test.detect(449));
        assertEquals(expected, actual);
    }
    @Test
    public void detectTheColorOfTheSpectrumBlue() {
        String expected = "Blue";
        String actual = test.detect(494);
        log.info("Color for wavelength {} will be {}", 494, test.detect(494));
        assertEquals(expected, actual);
    }

    @Test
    public void detectTheColorOfTheSpectrumGreen() {
        String expected = "Green";
        String actual = test.detect(569);
        log.info("Color for wavelength {} will be {}", 569, test.detect(569));
        assertEquals(expected, actual);
    }

    @Test
    public void detectTheColorOfTheSpectrumYellow() {
        String expected = "Yellow";
        String actual = test.detect(575);
        log.info("Color for wavelength {} will be {}", 575, test.detect(575));
        assertEquals(expected, actual);
    }

    @Test
    public void detectTheColorOfTheSpectrumOrange() {
        String expected = "Orange";
        String actual = test.detect(595);
        log.info("Color for wavelength {} will be {}", 595, test.detect(595));
        assertEquals(expected, actual);
    }

    @Test
    public void detectTheColorOfTheSpectrumRed() {
        String expected = "Red";
        String actual = test.detect(745);
        log.info("Color for wavelength {} will be {}", 745, test.detect(745));
        assertEquals(expected, actual);
    }
    @Test
    public void detectTheColorOfTheSpectrumInvisibleLight() {
        String expected = "Invisible Light";
        String actual = test.detect(760);
        log.info("Color for wavelength {} will be {}", 760, test.detect(760));
        assertEquals(expected, actual);
    }
}