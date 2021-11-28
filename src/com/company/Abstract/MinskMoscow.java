package com.company.Abstract;

public class MinskMoscow extends Train {

    MinskMoscow(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Маршрут поезда: Минск - Москва");

    }
}
