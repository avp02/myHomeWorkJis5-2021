package com.avp.homework2.task4_copy;

import com.avp.homework2.task4_copy.service.CopyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopyDemo {

    private static final Logger log = LoggerFactory.getLogger(CopyDemo.class);

    public static void main(String[] args) {
        int[] a1 = {40, 75, 23, 36, 87, 95, 54, 11, 62};

        CopyService c = new CopyService();
        int[] out = c.copyInRange(a1, 30, 75);
        log.info("New array - {}", out);
    }
}
