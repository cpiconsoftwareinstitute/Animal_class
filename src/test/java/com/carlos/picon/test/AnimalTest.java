package com.carlos.picon.test;

import com.carlos.picon.*;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    void SetAgeTest(){

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
    void SetHungerTest(){

        Animal testAnimal = new Human();
        //Human
        testAnimal.timePasses();
        testAnimal.timePasses();
        testAnimal.getHunger();

        assertEquals(testAnimal.getHunger(), 2, "Wrong age");

    }
    @Test
    void SetBreathTest(){
        //Human
        Mammal testAnimal5 = new Human();
        //Bird
        Bird testAnimal6 = new Eagle();
        //Human
        testAnimal5.breath();
        //Bird
        testAnimal6.breath();

        assertEquals(testAnimal5.breath(), "The mammal is breathing", "Wrong age");
        assertEquals(testAnimal6.breath(), "The bird is breathing", "Wrong age");

    }
    @Test
    void SetTalkTest(){
        //Human
        Mammal testAnimal7 = new Human();
        //Bird

        //Human
        testAnimal7.talk();

        assertEquals(testAnimal7.talk(), "To be or not to be", "Wrong age");

    }
}
