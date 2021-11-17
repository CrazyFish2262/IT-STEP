package com.company;

public class hUMAN {
    String name;
hUMAN (String newName){    // это одноименный конструктор
        this.name = newName;
   }

    public void live ()   {
        System.out.println(this.name + " живёт");
    }
}
