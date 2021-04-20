package com.avp.homework11.task1_stringStrinbuilder;
/*
Из слов приведенного текста составить фразу:
"Выбирать решения - это легко." Освойте все методы StringBuilder:
- append;
- insert;
- delete
- replace.
Приведите тип полученного объекта к классу String.
 */

public class StringStringBuilder {

    public String collectPhraseFromText(String text, String phrase) {
        StringBuilder sb = new StringBuilder();

        String[] arrayPhrase = phrase.split(" ");
        for (String  s : arrayPhrase) {
            if(text.contains(s)) {
                sb.append(s).append(" ");
            }
        }
        sb.insert(sb.length() - 1, ".");
        return sb.toString().trim();
    }
    public String buildPhraseFromWords(String...arg){
        if(arg == null) {
            throw new NullPointerException();
        }
        StringBuilder sb = new StringBuilder();
        for (String s : arg) {
            sb.append(s);
        }
        return sb.toString();
    }

    public StringBuilder insertMethod(StringBuilder sb) {
        sb.insert(3, "One");
        return sb;
    }

    public StringBuilder deleteMethod(StringBuilder sb) {
        sb.delete(0, 9);
        return sb;
    }

    public StringBuilder replaceMethod(StringBuilder sb) {
        sb.replace(9, 16, "replace");
        return sb;
    }

}
