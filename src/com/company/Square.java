package com.company;

public class Square extends Shape{
    int a;
    Square(int a) {
        this.a = a;
    }

    @Override
    void draw() {
        System.out.println("Квадрат");;
    }

    @Override
    void getSquare() {
        System.out.println("Площадь равна " + a * a);
    }
}
