package com.company.Collections.TempConverter;

public abstract class BaseConverter {
    double temperature;
    double fahrenheit;

    BaseConverter(double temperature) {
        this.temperature = temperature;
    }

    public double convert() {
        return fahrenheit = (temperature * 9 / 5) + 32;
    }
}
