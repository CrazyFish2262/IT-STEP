package com.company;

public class LESSON8 {
    public static void main(String[] args) {
/*
        Father father1 = new Father("Harry");
        Son son1 = new Son("Kate");

        father1.live();
        father1.vosp();

        son1.live();
        son1.slush();
*/
Shape shape1 = new Square(5);
Shape shape2 = new Triangle(45, 4);
Shape shape3 = new Circle(35);
shape1.draw();
shape1.getSquare();

        shape2.draw();
        shape2.getSquare();

        shape3.draw();
        shape3.getSquare();

        Printer print1 = new Printer();
        print1.print(shape1);

    }
}
