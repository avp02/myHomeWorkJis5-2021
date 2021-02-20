package com.avp.homework2.task3_palindrom.service;

public class PalindromeService {

    public boolean isPalindrome(String text) {

        String words = transformArrayInText(transformTextInArrayWithoutPunctuationMarks(text));

        for (int i = 0; i < words.length() / 2; i++) {
            if (words.charAt(i) == words.charAt(words.length() - 1 - i)) {
                return true;
            }
        }
        return false;
    }

    public String[] transformTextInArrayWithoutPunctuationMarks(String text) {

        String[] arrayText = text.toLowerCase().split("[\\p{Punct}\\s]+");
        return arrayText;
    }

    public String transformArrayInText(String[] array) {

        String str = "";
        for (String s : array) {
            str += s;
        }
        return str;
    }
}
