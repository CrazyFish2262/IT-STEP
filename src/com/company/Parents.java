package com.company;

public class Parents extends Grandparents {

    Kids[] objectKids;
    Parents(String yourObjRace, String objFamilyMember, String yourObjUniqueName,
            int yourObjAge, String yourObjOccupation, Kids [] yourOjbKids, Pets[] yourObjPets) {
        super(yourObjRace, objFamilyMember, yourObjUniqueName, yourObjAge, yourObjOccupation, yourObjPets);
        this.objectKids = yourOjbKids;
    }

    @Override
    public void getInfo() {
        getObject();
        System.out.println("This is " + familyMember + " in the family");
        System.out.println("The Occupation is " + occupation);
        System.out.println("Kids:");
        for (int j = 0; j < objectKids.length; j++) {
            objectKids[j].getKid();
        }
        System.out.println("Also there are pets the object has: ");
        for (int i = 0; i < objectPets.length; i++) {
            objectPets[i].getInfo();
        }
        System.out.println();
    }
    }

