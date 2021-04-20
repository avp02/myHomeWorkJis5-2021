package com.avp.homework11.task1_stringStrinbuilder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class StringStringBuilderTest {

    private static final Logger log = LoggerFactory.getLogger(StringStringBuilderApp.class);
    private StringStringBuilder test;
    private String testString;
    private String testText;

    @BeforeEach
    void beforeEach() {
        test = new StringStringBuilder();
        testString = "Выбирать решения - это легко.";
        testText = "Те, кто добивается выдающихся результатов, обращают внимание даже на самые незначительные " +
                "детали. Они чаще принимают мелкие, почти незаметные, но верные бытовые решения. Каждый день. Дело " +
                "не в таланте, просто однажды они решили поступать именно так. Выбирать нужное. Если бы люди поняли, " +
                "что страхи не имеют никакой связи с реальностью, всем жилось бы куда лучше. Момент принятия решения " +
                "поистине волшебен. Вы решаетесь что-то сделать, коренным образом изменить свою жизнь — и она " +
                "предстает перед вами в новом свете. Эмоции не дают нам выйти из зоны комфорта, но, если вы хотите " +
                "стать лучше, придется постоянно переступать через себя и покидать ее. Вы и представить не можете, " +
                "насколько расширится ваш диапазон позитивных эмоций, если вы только найдете силы шагнуть в " +
                "неизвестность и взять на себя больше ответственности. Любому человеку очень важно найти что-то, " +
                "к чему он будет стремиться и за что будет бороться вне зависимости от обстоятельств. После того " +
                "как вы поставите перед собой правильную цель, принимать решения будет легко и весело. То, что " +
                "раньше казалось мучительной обязанностью, превратится в приятное занятие. То, что получилось у " +
                "других, получится и у вас. Единственная вещь в этом мире, которую вы действительно можете " +
                "контролировать, — это ваши мысли. Сначала человек думает, потом говорит, потом делает как говорит, " +
                "действия формируют харрактер, а он влияет на всю жизнь. Если вы умеете управлять своими мыслями, " +
                "вы умеете управлять своей жизнью.";
    }

    @Test
    void buildPhraseFromWords() {
        String expected = "Выбирать решения - это легко.";
        String actual = test.buildPhraseFromWords("Выбирать ", "решения ", "- ", "это ", "легко.");
        log.info("I expecte {} and I got {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void insertMethod() {
        String expected = "ВыбOneирать решения - это легко.";
        String actual = test.insertMethod(new StringBuilder(testString)).toString();
        log.info("I expecte {} and I got {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void deleteMethod() {
        String expected = "решения - это легко.";
        String actual = test.deleteMethod(new StringBuilder(testString)).toString();
        log.info("I expecte {} and I got {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void replaceMethod() {
        String expected = "Выбирать replace - это легко.";
        String actual = test.replaceMethod(new StringBuilder(testString)).toString();
        log.info("I expecte {} and I got {}", expected, actual);
        assertEquals(expected, actual);
    }

    @Test
    void collectPhraseFromText() {
        String expected = "Выбирать решения - это легко.";
        String actual = test.collectPhraseFromText(testText, "Выбирать решения - это легко");
        log.info("I expecte {} and I got {}", expected, actual);
        assertEquals(expected, actual);
    }
}