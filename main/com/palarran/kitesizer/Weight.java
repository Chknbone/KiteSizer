/* Weight.java
 * Written by: CB
 * 
 * Holds user weight values.
 * 
 */

package com.palarran.kitesizer;

//fields
public class Weight {

    private int userWeight;

    //constructor
    public Weight() {
        userWeight = 0; //this would be called like: userWeight exampleWeight = new userWeight(); 
                        //exampleWeight.setuserWeight(100);
    }

    public Weight(int userWeight) { //constructors are allowed to have duplicate names.
        setWeight(userWeight); //this would be called like: userWeight exampleWeight = new userWeight(100);
    }

    //getters and setters
    public int getWeight() { //allows any class to return/use the "userWeight" variable
        return userWeight;
    }

    public void setWeight(int newWeight) { //allows any class to change the "userWeight" variable
        userWeight = newWeight;
    }

    public String toString() { //this overrides java's default 'toString' to a human readable string.
        return "weight at " + this.getWeight() + " pounds";
    }
}