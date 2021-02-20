package com.avp.lesson1.task2_algorithms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Algorithms {

    private static final Logger logger = LoggerFactory.getLogger(Algorithms.class);

    public static void main(String[] args) {
        wakeUp();
        turnOnTheKettle();
        warmFood();
        takeAShower();
        getDressed();
        getToWork();
        haveLunch();
        getHome();
        turnOnTheTv();
        takeAWalk();
    }
    public static void wakeUp() {
        logger.info("1. Проснуться:\n {}\n {}\n {}\n {}\n",
                "-открыть глаза",
                "-подумать о хорошем",
                "-накидать план на день",
                "-встать с кровати");
    }
    public static void turnOnTheKettle() {
        logger.info("2. Включить чайник:\n {}\n {}\n {}\n {}\n",
                "-зайти на кухню",
                "-налить в чайник воду",
                "-установить на плиту",
                "-включить газ");
    }
    public static void warmFood() {
        logger.info("3. Подогреть еду:\n {}\n {}\n {}\n {}\n",
                "-открыть холодильник",
                "-взять кантейнер с едой",
                "-закрыть холодильник",
                "-поставить в микроволновку и вкл. ее");
    }
    public static void takeAShower() {
        logger.info("4. Принять душ:\n {}\n {}\n {}\n {}\n",
                "-зайти в ванную",
                "-включить кран",
                "-намылиться",
                "-смыть с себя и вытереть тело полотенцем");
    }
    public static void getDressed() {
        logger.info("5. Одеться:\n {}\n {}\n {}\n {}\n",
                "-взять носки и одеть",
                "-взять джинсы и одеть",
                "-взять футболку и одеть",
                "-взять кроссовки и одеть");
    }
    public static void getToWork() {
        logger.info("6. Добраться до работы:\n {}\n {}\n {}\n {}\n",
                "-выйти из квартиры",
                "-выйти из подьезда",
                "-завезти машину",
                "-доехать до работы");
    }
    public static void haveLunch() {
        logger.info("7. Пообедать:\n {}\n {}\n {}\n {}\n",
                "-заехать домой",
                "-зайти в квартиру",
                "-открыть холодильник и взять контейнер с едой",
                "-разогреть");
    }
    public static void getHome() {
        logger.info("8. Добраться домой:\n {}\n {}\n {}\n {}\n",
                "-закончить рабочий день",
                "-закрыть станцию",
                "-завезти машину",
                "-доехать домой");
    }
    public static void turnOnTheTv() {
        logger.info("9. Включить телевизор:\n {}\n {}\n {}\n {}\n",
                "-зайти в гостинную",
                "-сесть на диван",
                "-взять пульт",
                "-вкл. нужный канал");
    }
    public static void takeAWalk() {
        logger.info("10. Прогуляться:\n {}\n {}\n {}\n {}\n",
                "-выйти из квартиры",
                "-выйти из подьезда",
                "-наметить маршрут",
                "-пройтись, подышать свежим водухом");
    }
}
