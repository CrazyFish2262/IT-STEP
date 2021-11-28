package com.company.Collections.TempConverter;

import java.util.Scanner;

public class Temperature extends BaseConverter {
    Temperature(double temperature) {
        super(temperature);
    }

    public void getTemperature() {
        System.out.println("Celsius temperature is " + temperature);
        convert();
        System.out.println("Fahrenheit temperature is " + fahrenheit);

    }

    public void setTemperature() {
        System.out.println("Please, input your Celsius temperature:");
        Scanner scanner = new Scanner(System.in);
        this.temperature = scanner.nextDouble();
    }
}
