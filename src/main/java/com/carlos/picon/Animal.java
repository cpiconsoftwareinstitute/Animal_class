package com.carlos.picon;
public abstract class Animal {

    /**
     * Field for the level of hunger of
     * the animal.
     */
    private int hunger;
    int age;
    /**
     * Constructor that sets the hunger
     * of the animal to zero.
     */
    protected Animal() {
        hunger = 0;
    }

    /**
     * Retrieves the hunger of the
     * animal.
     *
     * @return hunger
     */
    public int getHunger() {
        return hunger;
    }
    /**
     * Method to make the animal
     * speak.
     */
    public abstract void talk();

    /**
     * Adds times since the animal
     * has eaten - increases hunger.
     */
    public void timePasses() {
        hunger++;
    }

    /**
     * Feed the animal. Not hungry
     * anymore.
     */
    public void food() {
        hunger = 0;
    }


    public void set_age(int new_age){

        age = new_age;

    }
    public int get_age(){

       return age;

    }

// the day is sunny
}
