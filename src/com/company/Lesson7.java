package com.company;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
  /*      Pets pet1 = new Pets("cat", "Kitty", 3);
        Pets pet2 = new Pets("dog", "Chacky", 4);
        Pets pet3 = new Pets("frog", "Feona", 2);
        Pets pet4 = new Pets("spider", "Peter", 4);
        Pets pet5 = new Pets("hamster", "Rocky", 1);

Pets [] myPets1 = new Pets[]{pet1, pet5};
        Pets [] myPets2 = new Pets[]{pet2, pet3, pet4};


        Car car1 = new Car("Mercedes", "Sedan", "Green", 50000);
        Person person1 = new Person("Sarah Connor", 35, car1,myPets1);

        Car car2 = new Car("Volvo", "Pickup", "Pink", 35000);
        Person person2 = new Person("John Connor", 15, car2, myPets1);

        Car car3 = new Car("Lada", "Sedan", "baklazan", 100500);
        Person person3 = new Person("Timati", 40, car3, myPets2);

        Car car4 = new Car("Tesla", "Sedan", "Space Grey", 63800);
        Person person4 = new Person("Ilon Musk", 43, car4, myPets2);

        Car car5 = new Car("Gael", "Minivan", "Space Grey", 1900);
        Person person5 = new Person("Vasya", 49, car5, null);

        person1.getInfo();
        person2.getInfo();
        person3.getInfo();
        person4.getInfo();
        person5.getInfo();


        System.out.println(car1.speed);
        car1.gas();
        System.out.println(car1.speed);
        car1.breaK();
        System.out.println(car1.speed);

       Person [] personList = new Person []{person1, person2, person3, person4, person5};
*//*       int maxPrise = 0;
       String richManName = "null";
       for (int i = 0; i < personList.length; i++){
           if (personList[i].personalCar.prise > maxPrise){
               maxPrise = personList[i].personalCar.prise;
               richManName = personList[i].name;
           }

       }
        System.out.println("Maximum car prise is " + maxPrise + ". " + richManName + " is the richest man");*//*

        System.out.println();
        System.out.println();

        for (int i = 0; i < personList.length; i++){
            for(int j = 0; j < personList[i].persPets.length;j++){
                if (personList[i].persPets[j] == null){
                    System.out.println(personList[i].name  + " has no pets :( ");
                    break;
                }
                       System.out.println(personList[i].name + " has a " + personList[i].persPets[j].animal + ". It's name is " + personList[i].persPets[j].animalName + ". It is " + personList[i].persPets[j].animalAge + " years old.");

            }}

        }


*/

        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(4,5));

    }}
