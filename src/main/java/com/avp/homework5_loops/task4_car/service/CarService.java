package com.avp.homework5_loops.task4_car.service;
/*
Разработать класс представляющий автомобиль, соблюдая инкапсуляцию, который обладает следующими характеристиками:
Свойства
Модель
Цвет
Максимальная скорость
Текущая скорость
Методы
Ускориться: void accelerate(int targetSpeed) - должен увеличивать скорость автомобиля используя цикл. В каждой итерации скорость нужно увеличивать на 1 ед. до достижения заданной скорости или максимально допустимой скорости автомобиля. Если текущая скорость автомобиля больше заданной, то автомобиль ускоряться не должен.
Замедлиться: void decelerate(int targetSpeed) - должен уменьшать скорость автомобиля используя цикл. В каждой итерации скорость нужно уменьшать на 1 ед. до достижения заданной скорости или полной остановки автомобиля. Если текущая скорость меньше заданной, то автомобиль замедляться не должен.
Находится ли автомобиль в движении: boolean isDriving() - возвращает true если скорость автомобиля больше 0.
Стоит ли автомобиль на месте: boolean isStopped() - возвращает true если скорость автомобиля равна 0.
Есть ли возможность ускориться: boolean canAccelerate() - возвращает true если текущая скорость меньше максимальной.
Модель, цвет и максимальная скорость должны задаваться через конструктор. Текущая скорость может быть изменена только путем вызова основных методов.
 */

import com.avp.homework5_loops.task4_car.bean.Car;

public class CarService {

    private final Car car;

    public CarService(Car car) {
        this.car = car;
    }

    public void accelerate(int targetSpeed) {
        if (targetSpeed < 0) throw new IllegalArgumentException(
                "Speed has be more zero, try one more time");
        if (car.getMaxSpeed() >= targetSpeed) {
            for (int i = car.getCurrentSpeed(); i <= targetSpeed; i++) {
//                if (car.getCurrentSpeed() > targetSpeed) {
//                    break;
//                }
                car.setCurrentSpeed(i);
            }
        } else {
            for (int i = car.getCurrentSpeed(); i <= car.getMaxSpeed(); i++) {
                car.setCurrentSpeed(i);
            }
        }
    }

    public void decelerate(int targetSpeed) {
        if (targetSpeed < 0) throw new IllegalArgumentException(
                "Speed has be more zero, try one more time");
        if(car.getMaxSpeed() >= targetSpeed) {
            for (int i = car.getCurrentSpeed(); i >= targetSpeed; i--) {
                if (car.getCurrentSpeed() < targetSpeed) {
                    break;
                }
                car.setCurrentSpeed(i);
            }
        }
    }


    public boolean isDriving() {
        boolean driving = false;
        if (car.getCurrentSpeed() > 0) {
            driving = true;
        }
        return driving;
    }

    public boolean isStopped() {
        boolean stop = false;
        if (car.getCurrentSpeed() == 0) {
            stop = true;
        }
        return stop;
    }

    public boolean canAccelerate() {
        boolean isAccelerate = false;
        if (car.getMaxSpeed() > car.getCurrentSpeed()) {
            isAccelerate = true;
        }
        return isAccelerate;
    }
}
