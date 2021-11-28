package com.company.Persona;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Persona persona = new Persona("Josh", "Smith", 34);
        Persona persona3 = new Persona("Victor", "Smith", 34);
        Persona persona2 = new Persona("Josh", "Smith", 389);
        Persona persona1 = new Persona("Kate", "Smith", 24);

 /*       System.out.println(persona.hashCode());
        System.out.println(persona1.hashCode());
        System.out.println(persona2.hashCode());
        System.out.println(persona.equals(persona2));
        System.out.println(persona.equals(persona1));
        System.out.println(persona.toString());
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());


      ArrayList<String> list = new ArrayList<>();
        list.add("ads");
        list.add("y56h");
        list.add("12345678");
        list.add("123456789454454");
        list.add("4589");

        System.out.println(list);

      list.forEach(a -> {
            System.out.println("forEach " + a);
        });
        System.out.println();

        for (String b : list){
            System.out.println("for " + b);
        }
        System.out.println();
        for (int i = 0; i<list.size(); i++){
            System.out.println("simple for " + list.get(i));



int maxElement = 0;
int index = 0;
for( String element : list){
    for (int i = 0; i < list.size(); i++){
       if (element.length() > maxElement){
           maxElement = element.length();
           index = list.indexOf(element);
       }
    }
}
        System.out.println("Длина элемента - " + maxElement);
        System.out.println("Индекс элемента - " + index);
        System.out.println("Элемент " + list.get(index));


        Input input1 = new Input("sto", "String1", "utf-8");
        Input input2 = new Input("ufo", "String2", "ugf-15");
        Input input3 = new Input("up", "String3", "ui-487");

        ArrayList<Input> myList = new ArrayList<>();
        myList.add(input1);
        myList.add(input2);
        myList.add(input3);

            for (int i = 0; i < myList.size(); i++) {
                if (myList.get(i).value.equals("utf-8"))
                    System.out.println(myList.get(i));
            }


*/

         //SET - набор уникальных элементов

        Set<Persona> mySet = new HashSet<>();
        mySet.add(persona);
        mySet.add(persona1);
        mySet.add(persona2);
        mySet.add(persona3);

        System.out.println("set - " + mySet);





    }
}
