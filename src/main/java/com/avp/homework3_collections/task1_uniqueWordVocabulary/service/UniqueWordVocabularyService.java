package com.avp.homework3_collections.task1_uniqueWordVocabulary.service;

/*
Необходимо разработать класс UniqueWordVocabulary, который реализует следующие методы:

void addWord(String word) - добавить строку в коллекцию;

Ограничения: слова - дубликаты и пустые слова добавляться в коллекцию не должны;
int getWordsCount() - возвращает количество уникальных слов в коллекции;

void printVocabulary() - должен распечатать в консоли содержимое коллекции;

В качестве базовой коллекции нужно использовать Set.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabularyService {
    public void addWord(String word) {
        Set<String> words = new HashSet<>();
        words.addAll(Arrays.asList(word));
    }

    public int getWordsCount() {
        Set<String> words = new HashSet<>();
        return 0;
    }

    public void printVocabulary() {

    }
}
