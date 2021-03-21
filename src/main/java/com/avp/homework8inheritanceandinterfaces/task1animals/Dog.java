package com.avp.homework8inheritanceandinterfaces.task1animals;

import java.util.Objects;

public class Dog extends Mammal{

    public int amountMustache;
    private String lastName1;
    protected int age1;

    public Dog(String name, String color, int age, int amountLeg, int amountArm, String lastName, int amountMustache, String lastName1, int age1) {
        super(name, color, age, amountLeg, amountArm, lastName);
        this.amountMustache = amountMustache;
        this.lastName1 = lastName1;
        this.age1 = age1;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String voice() {
        return "I have " + age1 + " years" + ", I have lastname " +
                lastName1 + ", I have " + amountMustache + " mustache" +
                ", I have " + super.amountLeg + " legs and " + super.amountArm + " arms";
    }

    @Override
    public String countAge() {
        age1 += 5;
        return "I'm old " + age1 + " years and my name is " + super.name + ", I'm " + super.color + " color";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return amountMustache == dog.amountMustache && age1 == dog.age1 && Objects.equals(lastName1, dog.lastName1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountMustache, lastName1, age1);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", amountMustache=" + amountMustache +
                ", lastName1='" + lastName1 + '\'' +
                ", age1=" + age1 +
                ", amountLeg=" + amountLeg +
                ", amountArm=" + amountArm +
                '}';
    }
}
