package com.avp.homework3_collections.task2;

import com.avp.homework3_collections.task2.service.UniqueWordCounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounterDemo {

    private static final Logger log = LoggerFactory.getLogger(UniqueWordCounterDemo.class);

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        UniqueWordCounterService wordCounter = new UniqueWordCounterService(map);

        wordCounter.addWord("apple");
        wordCounter.addWord("mango");
        wordCounter.addWord("mango");
        wordCounter.addWord("mango");
        wordCounter.addWord("apple");

        log.info("Amount time adding word apple {}", map.get("apple"));
        log.info("Amount time adding word mango {} ", map.get("mango"));

        log.info(wordCounter.getMostFrequentWord());

        log.info("Mapa will look like this - {}", map.toString());
    }
}
