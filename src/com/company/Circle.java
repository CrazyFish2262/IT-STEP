package com.company;

public class Circle extends Shape{
    int r;
    Circle(int r) {
        this.r = r;
    }
    @Override
    void draw() {
        System.out.println("Круг");
    }

    @Override
    void getSquare() {
        System.out.println("Площадь равна " + Math.PI * r * r);
    }
   }
