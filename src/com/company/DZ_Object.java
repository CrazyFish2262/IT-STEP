package com.company;

public class DZ_Object {
    String race;
    String uniqueName;
    int age;
DZ_Object (String yourObjRace, String yourObjUniqueName, int yourObjAge){
    this.race = yourObjRace;
        this.uniqueName = yourObjUniqueName;
        this.age = yourObjAge;
}
    public void getObject (){
        System.out.println("What do we know about " + uniqueName + "? Well, here's what we have:");
        System.out.println("This object is " + race);
        System.out.println("The name is " + uniqueName);
        System.out.println("Age: " + age + " years");
    }
}
