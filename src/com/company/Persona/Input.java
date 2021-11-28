package com.company.Persona;

public class Input {
    String type;
    String name;
    String value;


    Input(String type, String name, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Input{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';



    }
}

