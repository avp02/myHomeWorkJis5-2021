package com.avp.homework2.task3_palindrom;

import com.avp.homework2.task3_palindrom.service.PalindromeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PalindromeServiceDemo {

    private static final Logger log = LoggerFactory.getLogger(PalindromeServiceDemo.class);

    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();

        log.info(Boolean.toString(service.isPalindrome("Le.Vel")));
    }
}
