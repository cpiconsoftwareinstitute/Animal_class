package com.carlos.picon.test;

import com.carlos.picon.Animal;
import com.carlos.picon.Dog;
import com.carlos.picon.Human;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    void SetAgeTest(){

        Animal testAnimal = new Human();
        Animal testAnimal2 = new Dog();
        testAnimal.set_age(16);
        testAnimal2.set_age(16);
        assertEquals(testAnimal.get_age(), 16, "Wrong age");
        assertEquals(testAnimal2.get_age(), 16, "Wrong age");
    }

}
