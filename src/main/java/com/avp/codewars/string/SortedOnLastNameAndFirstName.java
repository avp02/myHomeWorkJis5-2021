package com.avp.codewars.string;
/*
Джон пригласил несколько друзей. Его список:
s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
Не могли бы вы сделать программу, которая
делает эту строку в верхнем регистре
дает отсортированные в алфавитном порядке по фамилии.
Если фамилии совпадают, отсортируйте их по имени.
Фамилия и имя гостя указываются в результате в круглых скобках, разделенных запятой.
Итак, результат функции meeting(s)будет:
"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
Может случиться так, что в двух разных семьях с одинаковой фамилией два человека тоже будут иметь одно и то же имя.
 */

import java.util.Arrays;

public class SortedOnLastNameAndFirstName {

    public static String meeting(String s) {
        String result = "";
        String[] array1 = getArrayWithoutSemicolon(s);
        String[] array2 = getArrayChangePlaceElement(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array2.length; i++) {
            result += array2[i];
        }
        return result;
    }

    private static String[] getArrayWithoutSemicolon(String s) {
        return s.toUpperCase()
                .replace(";", " ")
                .split(" ");
    }

    private static String[] getArrayChangePlaceElement(String[] array) {
        String[] array1 = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            String[] in = array[i].split(":");
            changePlaceElement(in);
            String str = Arrays.toString(in).replace("[", "(").replace("]", ")");
            array1[i] = str;
        }
        return array1;
    }

    private static void changePlaceElement(String[] array) {
        String temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        System.out.println(meeting(s));
    }
}
