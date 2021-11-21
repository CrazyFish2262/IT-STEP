package com.company;

public class Person {
    String name;
    int age;
    Car personalCar;
    Pets[] persPets;
    Person(String name, int age, Car personalCar, Pets[] yourPersPets) {
        this.name = name;
        this.age = age;
        this.personalCar = personalCar;
        this.persPets = yourPersPets;
    }

    public void getInfo() {
        System.out.println("name: " + name + ", age: " + age);
        personalCar.getInfo();
        System.out.println();
    }
}
