package com.avp.homework8inheritanceandinterfaces.task1animals;

import java.util.Objects;

public class Bird extends Animals{

    private int amountWings;
    protected int lengthBeak;
    public short soundSing;

    public Bird(String name, String color, int age, int amountWings, int lengthBeak, short soundSing) {
        super(name, color, age);
        this.amountWings = amountWings;
        this.lengthBeak = lengthBeak;
        this.soundSing = soundSing;
    }

    //    @Override                       // не возможно переопределить потому что метод private in Animals
//    private String getName() {
//        return "My name is " + name;
//    }

//    @Override                       // не возможно вернуть private переменную
//    protected int getAge() {
//        return age;
//    }

    @Override
    protected int getAge() {
        return super.getAge();
    }

    @Override
    public String voice() {
        return "I have " + getAge() + " years" + " I have soundSing " + soundSing;
    }

    @Override
    public String countAge() {
        int age1 = getAge();
        age1 += 1;
        return "I'm old " + age1 + " years and my name is " + super.name + ", I have length beak is " + lengthBeak;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return amountWings == bird.amountWings && lengthBeak == bird.lengthBeak && soundSing == bird.soundSing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountWings, lengthBeak, soundSing);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", amountWings=" + amountWings +
                ", lengthBeak=" + lengthBeak +
                ", soundSing=" + soundSing +
                '}';
    }
}
