package com.avp.homework8inheritanceandinterfaces.task1animals;

import java.util.Objects;

public class Mammal extends Animals{

    public int amountLeg;
    protected int amountArm;
    private String lastName;

    public Mammal(String name, String color, int age, int amountLeg, int amountArm, String lastName) {
        super(name, color, age);
        this.amountLeg = amountLeg;
        this.amountArm = amountArm;
        this.lastName = lastName;
    }

//    @Override                       // не возможно переопределить потому что метод private in Animals
//    private String getName() {
//        return "My name is " + name;
//    }

//    @Override                       // не возможно вернуть private переменную
//    protected int getAge() {
//        return age;
//    }

    @Override        // переопределил и поменял модификатор доступа на public
    public int getAge() {
        return 10;
    }

    @Override
    public String voice() {
        return "I have " + String.valueOf(getAge()) + " years" + " I have lastname " + lastName;
    }

    @Override
    public String countAge() {
        int age = getAge();
        age += 1;
        return "I'm old " + age + " years and my name is " + super.name;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", amountLeg=" + amountLeg +
                ", amountArm=" + amountArm +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return amountLeg == mammal.amountLeg && amountArm == mammal.amountArm && Objects.equals(lastName, mammal.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountLeg, amountArm, lastName);
    }
}
