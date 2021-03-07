package com.avp.homework5_loops.task1_oddTable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoWhileOddChecker {

    private static final Logger log = LoggerFactory.getLogger(DoWhileOddChecker.class);

    public static void main(String[] args) {
        int i = 0;
        do {
            log.info(String.valueOf(i));
            i++;
        } while (i <= 50);
    }
}
