package com.avp.homework7methodsclassesobjects.task2human.service;

import com.avp.homework7methodsclassesobjects.task2human.bean.Human;

public class HumanService {

    private Human human;

    public HumanService(Human human) {
        this.human = human;
    }

    String greed() {
        return "Hi! My name is " + human.getName() +
                ", I'm " + human.getAge() + " years old";
    }
}
