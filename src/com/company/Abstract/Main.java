package com.company.Abstract;

public class Main {
    public static void main(String[] args) {
        MinskMoscow train1 = new MinskMoscow("Strela");
        train1.volume();
        System.out.println(train1.getName());
        train1.move();
        System.out.println();


        Ship ship1 = new Ship("Titanic");
        ship1.swim();
        ship1.move();
        System.out.println(ship1.getName());
        System.out.println();


        Birds bird1 = new Birds("Duck");
        bird1.swim();
        System.out.println(bird1.getName());
    }
}
