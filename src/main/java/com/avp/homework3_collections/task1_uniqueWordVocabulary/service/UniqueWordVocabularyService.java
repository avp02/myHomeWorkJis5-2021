package com.avp.homework3_collections.task1_uniqueWordVocabulary.service;

/*
Необходимо разработать класс UniqueWordVocabulary, который реализует следующие методы:

void addWord(String word) - добавить строку в коллекцию;

Ограничения: слова - дубликаты и пустые слова добавляться в коллекцию не должны;
int getWordsCount() - возвращает количество уникальных слов в коллекции;

void printVocabulary() - должен распечатать в консоли содержимое коллекции;

В качестве базовой коллекции нужно использовать Set.
 */

import java.util.LinkedHashSet;

public class UniqueWordVocabularyService {

    public void addWord(LinkedHashSet<String> list, String word) {
        String[] array = word.split("[\\p{Punct}\\s]+");
        for (String s : array) {
            list.add(s);
        }

    }

    public int getWordsCount(LinkedHashSet<String> list) {
        return list.size();
    }

    public String printVocabulary(LinkedHashSet<String> list) {
        String str = "";
        for (String s : list) {
            str += s + " ";
        }
        return str;
    }
}
