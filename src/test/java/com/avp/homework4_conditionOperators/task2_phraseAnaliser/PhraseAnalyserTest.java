package com.avp.homework4_conditionOperators.task2_phraseAnaliser;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class PhraseAnalyserTest {

    private static final Logger log = LoggerFactory.getLogger(PhraseAnalyserTest.class);
    private static final PhraseAnalyser test = new PhraseAnalyser();
    private static final String expected1 = "It stands no chance";
    private static final String expected2 = "It could be worse";
    private static final String expected3 = "It is fine, really";

    @Test
    void analyse1() {
        log.info("If text will begin with \"Make\" and finish \"great again\" method return {}",
                test.analyse("Make my bot great again"));
        assertEquals(expected1, test.analyse("Make my bot great again"));
    }

    @Test
    void analyse2() {
        log.info("If text will begin with \"Make\" or finish \"great again\" method return {}",
                test.analyse("Make my bot great again"));
        assertEquals(expected2, test.analyse("Make my bot great"));
    }

    @Test
    void analyse3() {
        log.info("If text won't begin with \"Make\" and finish \"great again\" method return {}",
                test.analyse("Make my bot great again"));
        assertEquals(expected3, test.analyse("My bot is perfect"));
    }
}