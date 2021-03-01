package com.avp.homework3_collections.task2.service;
/*
Необходимо разработать класс UniqueWordCounter, который в качестве коллекции использует Map. Данный класс должен выполнять следующие задачи:

void addWord(String word) - добавляет строку и считает количество раз, которое она была добавлена;
int getMostFrequentWord() - возвращает строку, которая была добавлена чаще всего;
void printWordsFrequency() - печатает на экран содержимое коллекции, а также количество раз, которое слово было добавлено;
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class UniqueWordCounterService {

    private static final Logger log = LoggerFactory.getLogger(UniqueWordCounterService.class);

    private Map<String, Integer> map;

    public UniqueWordCounterService (Map<String, Integer> map) {
        this.map = map;
    }

    public void addWord(String word) {
        Integer count = map.getOrDefault(word, 0);
        map.put(word, count + 1);
    }

    public String getMostFrequentWord() {
        String word = "";
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                word = entry.getKey();
            }
        }
        return word;
    }

    public void printWordsFrequency() {
        log.info(map.toString());
    }


}
