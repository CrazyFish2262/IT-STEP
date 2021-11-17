package com.company;

public class Triangle extends Shape{
    int a;
    int h;
Triangle(int a, int h){
        this.a = a;
        this.h = h;
   }
    @Override
    void draw() {
        System.out.println("Треугольник");
    }

    @Override
    void getSquare() {
        System.out.println("Площадь равна " + a * h / 2);
    }
}
