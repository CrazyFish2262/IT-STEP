package com.company.Abstract;

import java.util.*;

public class Main {
    public static void main(String[] args) {
/*        MinskMoscow train1 = new MinskMoscow("Strela");
        train1.volume();
        System.out.println(train1.getName());
        train1.move();
        System.out.println();


        Ship ship1 = new Ship("Titanic");
        ship1.swim();
        ship1.move();
        System.out.println(ship1.getName());
        System.out.println();


        Birds bird1 = new Birds("Duck");
        bird1.swim();
        System.out.println(bird1.getName());*/

/*принцип работы Map
        Map <String, String> map = new HashMap<>();
        map.put("human","set");
        map.put("human1","set");

        System.out.println(map);*/

/*Человеки и одежда - Map

        Human human1 = new Human("Kevin", "Smith", 7);
        Human human2 = new Human("John", "Smith", 12);
        Human human3 = new Human("Tom", "Smith", 35);

        Set<String> set1 = new HashSet<>();
        set1.add("Кроссы");
        set1.add("Кеды");
        set1.add("Шорты");
        set1.add("Майка");
        set1.add("Худи");

        Set<String> set2 = new HashSet<>();
        set2.add("Рубашка");
        set2.add("Свитер");
        set2.add("Брюки");
        set2.add("Туфли");
        set2.add("Носки");

        Map<Human, Set<String>> map = new HashMap<>();
        map.put(human1, set2);
        map.put(human2, set1);
        map.put(human3, set2);

        System.out.println(map);*/

/*
        int[][] array = new int[10][8];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = i + j;
            }
        }
        *//*        System.out.println(function(array));*//*
        System.out.println(multilist(array));*/

    }

//метод, создающий список из много двумерного массива данных
    public static List<Integer> function(int[][] tenzor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < tenzor.length; i++) {
            for (int j = 0; j < tenzor[i].length; j++) {
                list.add(tenzor[i][j]);
            }
        }
        return list;
    }

//список из списков
    public static List<List<Integer>> multilist(int[][] multitenzor) {
        List<List<Integer>> list = new ArrayList<>();
        for (int m = 0; m < multitenzor.length; m++) {
            List<Integer> superList = new ArrayList<>();
            for (int j = 0; j < multitenzor[m].length; j++) {
                superList.add(multitenzor[m][j]);
            }
            list.add(superList);
        }
        return list;
    }


}
