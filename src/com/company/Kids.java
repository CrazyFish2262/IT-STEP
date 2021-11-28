package com.company;

public class Kids extends Grandparents {


    Kids(String yourRace, String objFamilyMember, String yourUniqueName,
         int yourAge, String yourObjOccupation,Pets[] yourObjPets) {
        super(yourRace, objFamilyMember, yourUniqueName, yourAge, yourObjOccupation, yourObjPets);

    }

    @Override
    public void getInfo() {
        getObject();
        System.out.println("This is " + familyMember + " in the family");
        System.out.println("Occupation is " + occupation);
        System.out.println("Also there are pets the object has: ");
        for (int i = 0; i < objectPets.length; i++) {
            objectPets[i].getInfo();

        }
        System.out.println();
    }


    public void getKid() {
        System.out.println("*** " + uniqueName + ". Age: " + age);
}}
