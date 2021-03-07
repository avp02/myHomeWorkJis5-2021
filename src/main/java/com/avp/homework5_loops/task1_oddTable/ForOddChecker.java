package com.avp.homework5_loops.task1_oddTable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForOddChecker {

    private static final Logger log = LoggerFactory.getLogger(ForOddChecker.class);

    public static void main(String[] args) {
        for (int i = 0; i <= 50 ; i++) {
            log.info(String.valueOf(i));
        }
    }
}
