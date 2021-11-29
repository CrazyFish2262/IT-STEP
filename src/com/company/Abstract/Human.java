package com.company.Abstract;

public class Human {
    String name;
    String lastname;
    int age;

    @Override
    public String toString() {
        return name + " " + lastname + ", " + age + " y.o.";
    }

    Human(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;



    }
}
