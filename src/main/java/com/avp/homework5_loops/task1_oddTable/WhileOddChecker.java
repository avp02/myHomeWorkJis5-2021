package com.avp.homework5_loops.task1_oddTable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhileOddChecker {

    private static final Logger log = LoggerFactory.getLogger(WhileOddChecker.class);

    public static void main(String[] args) {
        int i = 0;
        while (i <= 50) {
            log.info(String.valueOf(i));
            i++;
        }
    }
}
