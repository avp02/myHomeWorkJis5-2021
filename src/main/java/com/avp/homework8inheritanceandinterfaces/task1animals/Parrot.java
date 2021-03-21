package com.avp.homework8inheritanceandinterfaces.task1animals;

import java.util.Objects;

public class Parrot extends Bird{

    private String subclass;
    protected int  lengthTail;
    public boolean isSign;

    public Parrot(String name, String color, int age, int amountWings, int lengthBeak, short soundSing, String subclass, int lengthTail, boolean isSign) {
        super(name, color, age, amountWings, lengthBeak, soundSing);
        this.subclass = subclass;
        this.lengthTail = lengthTail;
        this.isSign = isSign;
    }

    @Override     // переопределил и поменял модификатор доступа на public
    public int getAge() {
        return super.getAge() + 1;
    }

    @Override
    public String voice() {
        return "I have soundSing " + soundSing + " and I'm belonging by " + subclass;
    }

    @Override
    public String countAge() {
        int age1 = getAge();
        age1 += 1;
        return "I'm old " + age1 + " years and my name is " + super.name + ", I have length beak is " + lengthBeak +
                ", do i sign " + isSign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return lengthTail == parrot.lengthTail && isSign == parrot.isSign && Objects.equals(subclass, parrot.subclass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subclass, lengthTail, isSign);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", lengthBeak=" + lengthBeak +
                ", soundSing=" + soundSing +
                ", subclass='" + subclass + '\'' +
                ", lengthTail=" + lengthTail +
                ", isSign=" + isSign +
                '}';
    }
}
