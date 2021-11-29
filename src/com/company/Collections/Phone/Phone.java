package com.company.Collections.Phone;

public class Phone implements receiveCall {
    String number;
    String model;
    double weight;
    Phone(String model, String number, double weight){
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    Phone(String model, String number){
        this.model = model;
        this.number = number;
    }

    Phone() {
    }

    @Override
    public String toString() {
        return "Phone: " + "number = " + number +", model = " + model + ", weight = " + weight;
    }

    public String getNumber (){
        return number;
    }

    @Override
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    }


