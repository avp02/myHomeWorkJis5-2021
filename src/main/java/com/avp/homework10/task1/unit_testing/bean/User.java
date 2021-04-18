package com.avp.homework10.task1.unit_testing.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
Требования:
Создать сервис (UserService) и репозиторий (UserRepository) для сущности User и протестировать при помощи jUnit.
Основная сущность - User. Необходимые параметры:
идентификатор (id)
имя (name)
возраст (age)
Зависимости (dependencies):
У класса UserService должна быть зависимостьотUserRepository
Функциональные требования для класса UserService:
метод (addUser) для проверки пользователя и вызова метода сохранения пользователя в базу данных у репозитория.
Требования класса UserRepository. Необходимые параметры:
коллекция (users) для хранения пользователей. Используйте HashMap. В качестве ключа - id, в качестве значения - user.
Функциональные требования для класса UserRepository:
метод (save) для сохранения пользователя в коллекцию
Протестировать класс UserService при помощи Unit тестов. В качестве репозитория используйте MockUserRepository.
*Примечание: Так как при юнит тестировании не используется реальная база, необходимо создать mock. Создайте класс MockUserRepository. MockUserRepository наследуется от UserRepository.
Необходимые параметры для MockUserRepository:
триггер был ли вызван mock (isMockTriggered) - тип данных boolean.
Функциональные требования класса MockUserRepository:
Переопределенный метод save. В случае, если метод был вызван - менять состояние isMockTriggered на true.
В тестах проверить, что mock был вызван.
 */
@Data
@AllArgsConstructor
public class User {

    private String id;
    private String name;
    private int age;

}
