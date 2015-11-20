/* AskForWeight.java
 * Dev: CB
 * 
 * Requesting user input of their weight.
 */

package com.palarran.kitesizer;

import java.util.Scanner;

//fields
public class AskForWeight {

    private int userWeight;

    //constructor
    public AskForWeight() {
        userWeight = 0;
    }

    //getters and setters
    public int getWeight() { //allows any class to return/use the "userWeight" variable

        Scanner getWeight = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");

        int weightInput = getWeight.nextInt();
        
        if (weightInput < 95 | weightInput > 300)
            System.out.println("Try again. Enter a weight between 95 and 300 pounds.");
        else 
            System.out.println("Your weight is " + weightInput);

        //TODO figure out if 'getWeight' needs to be closed. closing here kills the second test.
        //getWeight.close(); 
        
        userWeight = weightInput;
        
        return userWeight;
    }

    public void setWeight(int newWeight) { //allows any class to change the "userWeight" variable
        userWeight = newWeight;
    }

    public String toString() { //this overrides java's default 'toString' to a human readable string, but i cannot remember why I did it
        return "User Weight: " + this.getWeight();
    }
}