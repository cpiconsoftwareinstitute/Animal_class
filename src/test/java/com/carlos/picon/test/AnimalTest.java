package com.carlos.picon.test;

import com.carlos.picon.*;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    public void SetAgeTest(){

        Animal testAnimal = new Human();
        Animal testAnimal2 = new Dog();
        Animal testAnimal3 = new Eagle();
        Animal testAnimal4 = new Pigeon();

        //Human
        testAnimal.set_age(16);
        //Dog
        testAnimal2.set_age(16);
        testAnimal3.set_age(16);
        testAnimal4.set_age(16);

        assertEquals(testAnimal.get_age(), 16, "Wrong age");
        assertEquals(testAnimal2.get_age(), 16, "Wrong age");
        assertEquals(testAnimal3.get_age(), 16, "Wrong age");
        assertEquals(testAnimal4.get_age(), 16, "Wrong age");

    }
    @Test
    public void SetHungerTest(){

        Animal testAnimal = new Human();
        //Human
        testAnimal.timePasses();
        testAnimal.timePasses();
        testAnimal.getHunger();

        assertEquals(testAnimal.getHunger(), 2, "Wrong message");
        testAnimal.timePasses();
        testAnimal.food();
        assertEquals(testAnimal.getHunger(), 0, "Wrong message");
    }
    @Test
    public void SetBreathTest(){
        //Human
        Mammal testAnimal5 = new Human();
        //Bird
        Bird testAnimal6 = new Eagle();
        //Human
        testAnimal5.breath();
        //Bird
        testAnimal6.breath();

        assertEquals(testAnimal5.breath(), "The mammal is breathing", "Wrong action");
        assertEquals(testAnimal6.breath(), "The bird is breathing", "Wrong action");

    }
    @Test
    public void SetTalkTest(){
        //Human
        Mammal testAnimal7 = new Human();
        Bird testAnimal8 = new Eagle();
        Mammal testAnimal9 = new Dog();
        Bird testAnimal10 = new Pigeon();
        //Bird

        //Human
        testAnimal7.talk();
        testAnimal8.talk();
        testAnimal9.talk();
        testAnimal10.talk();


        assertEquals(testAnimal7.talk(), "To be or not to be", "Wrong talk");
        assertEquals(testAnimal8.talk(), "Growling!", "Wrong talk");
        assertEquals(testAnimal9.talk(), "Burking!", "Wrong talk");
        assertEquals(testAnimal10.talk(), "Cooing noise!, twittering", "Wrong talk");

    }
    @Test
    public void SetSizeTest(){
        //Human
        Animal testAnimal11= new Human();
        //Human
        for(int i=0;i<7;i++){
            testAnimal11.statePasses();
        }
        assertEquals(testAnimal11.getSize(), "Adult", "Wrong talk");
    }
}
