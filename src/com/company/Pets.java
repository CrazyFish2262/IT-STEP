package com.company;

public class Pets {
    String animal;
    String animalName;
    int animalAge;
    Pets(String persAnimal, String animalName, int persAnimalAge){
        this.animal = persAnimal;
        this.animalName = animalName;
        this.animalAge = persAnimalAge;
    }
    public void getInfo() {
        System.out.println("*** " + animal + ". It's name: " + animalName + ", age: " + animalAge);
    }

}
