package com.company.Collections.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Sony Ericsson W580", "+793288973", 120.8);
        Phone phone2 = new Phone("Sony Ericsson K750", "+793208921", 116.5);
        Phone phone3 = new Phone("Nokia 3300", "+793280465", 116.5);

        //Вывод информации о телефоне, имени звонящего и номере телефона
        System.out.println(phone1.toString());
        phone1.receiveCall("Alejandro");
        System.out.println(phone1.getNumber());

        System.out.println();
        System.out.println(phone2.toString());
        phone2.receiveCall("Igor");
        System.out.println(phone2.getNumber());

        System.out.println();
        System.out.println(phone3.toString());
        phone3.receiveCall("Alberto");
        System.out.println(phone3.getNumber());

        System.out.println();


    }
}
