package com.company.Abstract;

public class Birds implements Swimmable{
    String name;
    Birds( String name){
        this.name = name;
    }
    @Override
    public void swim() {
        System.out.println("Я плаваю, потому что я уточка");
    }
    public String getName(){
        return this.name;

    }
}
