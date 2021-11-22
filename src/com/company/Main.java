package com.company;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
/*int a = 30;
int i = 15;
       try {
           if (i == 15)
               throw new MyExeption("Нельзя делить на 15");
       } catch (MyExeption ex){
           System.out.println(ex.message);
       } finally {
           System.out.println("Если бы можно было, было бы - " + a/i);
       }*/

     int[] array = new int[3];
     try{
         array[5] = 7;
     } catch (ArrayIndexOutOfBoundsException except){
         System.out.println("Достигнут конец массива. Последний элемент будет равен 7");
         array[array.length-1] = 7;
     }
        System.out.println(array[2]);
    }
}