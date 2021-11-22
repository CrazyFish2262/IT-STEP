package com.company.Abstract;

public abstract class Vehicle {
    String name;
    Vehicle (String name){
        this.name = name;
    }

 public abstract void move();

    public void volume(){
        System.out.println("beep");
    }

    public String getName(){
        return this.name;
    }
    }
