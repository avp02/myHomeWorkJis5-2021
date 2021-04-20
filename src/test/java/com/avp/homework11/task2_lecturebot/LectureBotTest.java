package com.avp.homework11.task2_lecturebot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class LectureBotTest {

    private static final Logger log = LoggerFactory.getLogger(LectureBotTest.class);
    private LectureBot test;
    private String[][] stringsTest;

    @BeforeEach
    void beforeEach() {
        test = new LectureBot();
        stringsTest = new String[][]{
                {"Товарищи!", "реализация намеченных плановых заданий", "играет важную роль в формировании", "существующих финансовых и административных условий"},
                {"С другой стороны", "рамки и место обучения кадров", "требуют от нас анализа", "дальнейших направлений развития"},
                {"Не следует, однако, забывать, что", "сложившаяся структура организации", "способствует подготовке и реализации", "позици, занимаемых участниками в отношении поставленных задач"},
                {"Таким образом", "новая модель организации деятельности", "обеспечивает широкому кругу специалистов участие в формировании", "новых предложений"},
                {"Повседневная практика показывает, что", "дальнейшее развитие различных форм деятельности", "позволяет выполнить важные задания по разработке", "направлений прогрессивного развития"}
        };
    }

    @Test
    void createAnyPhrase() {
        String expected = "Товарищи! реализация намеченных плановых заданий играет важную роль в формировании существующих финансовых и административных условий";
        String actual = test.createAnyPhrase(stringsTest);
        log.info("I expect {} and I got {}", expected, actual);
        assertNotEquals(expected, actual);
    }
}