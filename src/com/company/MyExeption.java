package com.company;

public class MyExeption extends Exception{
    String message;
    MyExeption(String message){
        this.message = message;
    }
}
