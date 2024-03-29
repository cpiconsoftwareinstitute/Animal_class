package com.carlos.picon;
public abstract class Animal {

    /**
     * Field for the level of hunger of
     * the animal.
     */
    private int hunger;
    int age;
    int state;
    private String size;
    float price;
    String name;

    /**
     * Constructor that sets the hunger
     * of the animal to zero.
     */
    ///////////////////methods/////////////////////////
    protected Animal() {
        hunger = 0;
        age = 0;
        size = "baby";
        state = 0;
    }
    ///////////////////methods/////////////////////////
    public void setName (String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    /**
     * Method to set a new state
     */
    public int Setstate(int new_state) {
        state=new_state;
        return state;
    }
    /**
     * Method to make the state of growth pass
     */
    public void statePasses() {
        state++;
    }
    /**
     * Method to get the state of the growth
     */
    public String getSize() {
        if(state<3){
            size = "Baby";
        }else if(state>3 && state<6){
            size = "Young";
        }else{
            size = "Adult";
        }
        return size;
    }
    /**
     * Retrieves the hunger of the
     * animal.
     *
     */

     /**
     * @return hunger
     */
    public int getHunger() {

        return hunger;
    }
    /**
     * Method to make the animal
     * speak.
     */
    public abstract String talk();

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
    /**
     * Method to set and get price of an animal.
     */

    public void setPrice(float new_price){

        price = new_price;

    }
    public float getPrice(){

        return price;

    }public String toString(){
        return "The animal: ";

    }

// the day is sunny
}
