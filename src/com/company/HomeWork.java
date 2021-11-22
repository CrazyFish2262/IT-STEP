package com.company;

public class HomeWork {
    public static void main(String[] args) {
        Pets pet1 = new Pets("cat", "Kitty", 3);
        Pets pet2 = new Pets("dog", "Chucky", 4);
        Pets pet3 = new Pets("fish", "Feona", 2);
        Pets pet4 = new Pets("cat", "Mr.Grey", 6);
        Pets pet5 = new Pets("dog", "Goofy", 6);
        Pets pet6 = new Pets("fish", "Nemo", 1);
        Pets[] myPets1 = new Pets[]{pet6};
        Pets[] myPets2 = new Pets[]{pet1, pet2, pet3};
        Pets[] myPets3 = new Pets[]{pet4, pet5};


        Kids daughter = new Kids("human", "the daughter", "Kate",
                14, "Schoolgirl", myPets1);
        Kids son = new Kids("human", "the son", "Jonh",
                5, "Baby", myPets1);
        Kids[] kids = new Kids[]{daughter, son};


        Grandparents grandfather = new Grandparents("human", "the grandfather",
                "Nick", 65, "Pet lover", myPets2);

        Parents mother = new Parents("human", "the mother",
                "Jennifer", 43, "Housekeeper", kids, myPets3);
        Parents father = new Parents("human", "the father",
                "Ben", 46, "Doctor", kids, myPets3);


        grandfather.getInfo();
        mother.getInfo();
        father.getInfo();
        daughter.getInfo();
        son.getInfo();

    }
}