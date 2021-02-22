package com.avp.homework3_collections.task1_uniqueWordVocabulary;

import com.avp.homework3_collections.task1_uniqueWordVocabulary.service.UniqueWordVocabularyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashSet;

public class UniqueWordVocabularyDemo {

    private static final Logger log = LoggerFactory.getLogger(UniqueWordVocabularyDemo.class);

    public static void main(String[] args) {
        UniqueWordVocabularyService uniqueWordVocabularyService = new UniqueWordVocabularyService();
        LinkedHashSet<String> unique = new LinkedHashSet<>();
        String word = "I am going to go to work after I am going to go home.";
        uniqueWordVocabularyService.addWord(unique, word);
        log.info("After addWord method collection is {}", unique);
        log.info("{}", uniqueWordVocabularyService.getWordsCount(unique));
        log.info(uniqueWordVocabularyService.printVocabulary(unique));

    }
}
