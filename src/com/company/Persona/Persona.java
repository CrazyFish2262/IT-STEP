package com.company.Persona;

import java.util.Objects;

public class Persona {
    String name;
    String lastname;
    int age;
    Persona (String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Персона " + name + " " + lastname + " " + age + " y.o.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return name.equals(persona.name) && lastname.equals(persona.lastname);
    }

    @Override
    public int hashCode() {
        return name.length() + age;
    }
}
