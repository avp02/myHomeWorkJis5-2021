package com.avp.homework2.description;

import com.avp.homework2.description.service.LookupArrayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LookupArrayServiceDemo {
    private static final Logger log = LoggerFactory.getLogger(LookupArrayServiceDemo.class);
    private static final LookupArrayService service = new LookupArrayService();
    private static final int[] array = new int[]{3, 1, -7, -19, 0};

    public static void main(String[] args) {
        log.info(String.valueOf(service.findMax(array)));

        log.info(String.valueOf(service.findMin(array)));

        log.info(String.valueOf(service.indexOfMax(array)));

        log.info(String.valueOf(service.indexOfMin(array)));

        log.info(String.valueOf(service.indexOf(array, -19)));

    }
}
