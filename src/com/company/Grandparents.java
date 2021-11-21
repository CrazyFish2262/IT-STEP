package com.company;

public class Grandparents extends DZ_Object {
    Grandparents(String yourObjRace, String objFamilyMember, String yourObjUniqueName,
                 int yourObjAge, String yourObjOccupation, Pets[] yourObjPets) {
        super(yourObjRace, yourObjUniqueName, yourObjAge);
        this.familyMember = objFamilyMember;
        this.occupation = yourObjOccupation;
        this.objectPets = yourObjPets;
    }

    String familyMember;
    String occupation;
    Pets[] objectPets;

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
}
