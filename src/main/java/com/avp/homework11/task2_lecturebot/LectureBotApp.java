package com.avp.homework11.task2_lecturebot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LectureBotApp {

    private static final Logger log = LoggerFactory.getLogger(LectureBotApp.class);

    public static void main(String[] args) {
        String[][] stringsApp = new String[][]{
                {"Товарищи!", "реализация намеченных плановых заданий", "играет важную роль в формировании", "существующих финансовых и административных условий"},
                {"С другой стороны", "рамки и место обучения кадров", "требуют от нас анализа", "дальнейших направлений развития"},
                {"Не следует, однако, забывать, что", "сложившаяся структура организации", "способствует подготовке и реализации", "позици, занимаемых участниками в отношении поставленных задач"},
                {"Таким образом", "новая модель организации деятельности", "обеспечивает широкому кругу специалистов участие в формировании", "новых предложений"},
                {"Повседневная практика показывает, что", "дальнейшее развитие различных форм деятельности", "позволяет выполнить важные задания по разработке", "направлений прогрессивного развития"}
        };
        LectureBot app = new LectureBot();
        log.info("{}", app.createAnyPhrase(stringsApp));
        log.info("{}", app.createAnyPhrase(stringsApp));
        log.info("{}", app.createAnyPhrase(stringsApp));
    }
}
