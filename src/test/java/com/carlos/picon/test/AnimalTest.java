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
        Mammal testAnimal5 = new Human();
        //Human
        testAnimal.set_age(16);
        testAnimal.timePasses();
        testAnimal.timePasses();
        testAnimal.getHunger();
        testAnimal5.breath();
        //Dog
        testAnimal2.set_age(16);
        testAnimal3.set_age(16);
        testAnimal4.set_age(16);

        assertEquals(testAnimal.get_age(), 16, "Wrong age");
        assertEquals(testAnimal.getHunger(), 2, "Wrong age");
        assertEquals(testAnimal5.breath(), "The mammal is breathing", "Wrong age");

        assertEquals(testAnimal2.get_age(), 16, "Wrong age");
        assertEquals(testAnimal3.get_age(), 16, "Wrong age");
        assertEquals(testAnimal4.get_age(), 16, "Wrong age");

    }

}
