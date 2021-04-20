package com.avp.homework11.task2_lecturebot;
/*
condition here https://moodle.jrr.by/practice/8763
 */

import java.util.Random;

public class LectureBot {

    public String createAnyPhrase(String[][] strings) {
        String result = "";
        Random random = new Random();
        for (int i = 0; i < strings[0].length; i++) {
            int anyIndexFromLine = random.nextInt(strings.length);
            result += strings[anyIndexFromLine][i] + " ";
        }
        return result;
    }
}
