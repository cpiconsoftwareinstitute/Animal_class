package com.carlos.picon;

public class Main {

    public static void main(String[] args){
        PetShop firstPet = new PetShop("Diomedes");

        Human Diomedes = new Human();

        Animal Aquiles = new Human ();

        Aquiles.setName("Aquiles");



        firstPet.addAnimalToInventory(Diomedes);



        firstPet.displayInventory();


        System.out.println("The animal: " + Aquiles.getName());


    }


}
