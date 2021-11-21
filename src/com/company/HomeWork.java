package com.company;

public class HomeWork {
    public static void main(String[] args) {
        Pets pet1 = new Pets("cat", "Kitty", 3);
        Pets pet2 = new Pets("dog", "Chucky", 4);
        Pets pet3 = new Pets("fish", "Feona", 2);

        Pets[] myPets1 = new Pets[]{pet1, pet2};
        Pets[] myPets2 = new Pets[]{pet1, pet2, pet3};


        Kids daughter = new Kids("human", "daughter", "Kate",
                14, "Schoolgirl", myPets1);
        Kids son = new Kids("human", "son", "Jonh",
                5, "Baby", myPets2);

        Kids [] mothersKids = new Kids[]{daughter,son};
        Kids [] fathersKids = new Kids[]{son};


        Grandparents grandfather = new Grandparents("human","the grandfather",
                "Nick", 65, "Doctor ", myPets2);

        Parents mother = new Parents("human", "the mother", "Jennifer",
                43,"housekeeper", mothersKids);
       grandfather.getFullInfo();

    }
}