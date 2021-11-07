package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //создаём двумерный массив 5 х 5
        Random random = new Random();
        int sumAltDiagonal = 0;
        int[][] array = new int[5][5];
        int maxElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10) - 8;
                System.out.printf(array[i][j] + " ");
                if (array[i][j] > maxElement) { //находим максимальный элемент в матрице
                    maxElement = array[i][j];
                }

            }

            System.out.println();
        }
        System.out.println("Максимальный элемент матрицы " + maxElement);


        // находим сумму элементов побочной диагонали
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
                if (i == array.length - 1 - j) {
                    sumAltDiagonal += array[i][j];
                }
            }

        }
        System.out.println("Сумма элементов побочной диагонали " + sumAltDiagonal);


        //разворачиваем двумерный массив в одномерный
        System.out.println();
        System.out.println("Двумерный массив преобразован в одномерный массив");
        int[] monoArray = new int[array.length * array[array.length - 1].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int a = 0;
                if (a < monoArray.length) {
                    monoArray[a] = array[i][j];
                    System.out.print(monoArray[a] + " ");
                    a++;
                }

            }
        }
        System.out.println();
        System.out.println();


        //вывести минимальное значение в каждой строке массива

        int min, max;
        min = max = array[0][0];
        int[] minArray = new int[array.length];
        for (int i = 0, strInd = 1; i < array.length; i++) {
            minArray[i] = array[i][0];
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < minArray[i]) {
                    minArray[i] = min = array[i][j];
                }
            }
            System.out.print("Минимальный элемент в " + strInd + " строке - " + minArray[i]);
            System.out.println();
            strInd++;
        }


    }
}
