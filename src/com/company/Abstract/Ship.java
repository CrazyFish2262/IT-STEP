package com.company.Abstract;

public class Ship extends Vehicle implements Swimmable {

    Ship(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Это умеет плавать");

    }

    @Override
    public void move() {
        System.out.println("Движется по воде");
    }
}
