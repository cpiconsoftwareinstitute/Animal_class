package com.carlos.picon;

import java.util.ArrayList;

public class PetShop {

    ///////////////////variables/////////////////////////
    private ArrayList<Animal> inventory;
    private String nameOfStore;

    public PetShop(String name){

        nameOfStore = name;
        inventory = new ArrayList<>();

    }
    public String sellAnimal(Animal animal){

        if(inventory.indexOf(animal)>=0){
            inventory.remove(animal);
            return "you own " + animal.getPrice() +"$";
        }else{
            return "Animal is not in stock";
        }


    }
    public void  addAnimalToInventory(Animal animal){

        inventory.add(animal);
    }

    public void displayInventory(){

        StringBuilder sb = new StringBuilder();
        for(Animal a : inventory){
            sb.append(a);
            sb.append(System.lineSeparator());
        }
        System.out.println(sb);

    }

}
