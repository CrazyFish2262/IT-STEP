package com.company;

public class Car {
    String brand;
    String color;
    String bodyType;
    int speed;
    int prise;
    Car(String brand, String bodyType, String color, int carPrise){
        this.brand = brand;
        this.bodyType = bodyType;
        this.color = color;
        this.prise = carPrise;
    }
    public void getInfo(){
        System.out.println("Car brand is " + brand + ". Car's body type is " + bodyType + ". Color is " + color);
    }
    public void gas(){
        this.speed = 60;
    }
    public void breaK(){
        this.speed = 0;
    }
}
