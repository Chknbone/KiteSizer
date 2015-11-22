/* AskForWindSpeed.java
 * Dev: CB
 * 
 * Requesting user input of wind speed.
 */

package com.palarran.kitesizer;

import java.util.Scanner;


public class AskForWindSpeed {
    
    //fields
    private int windSpeed;

    //constructor
    public AskForWindSpeed() {
        windSpeed = 0; //this would be called like: windSpeed exampleSpeed = new windSpeed(); 
                                                    //exampleSpeed.setwindSpeed(15);
    }
    
    public AskForWindSpeed(int windSpeed) { //constructors are allowed to have duplicate names.
        setWind(windSpeed); //this would be called like: windSpeed exampleSpeed = new windSpeed(15);
    }
    
    
    //getters and setters
    public int getWind() { //allows any class to return/use the "windSpeed" variable

        Scanner getWind = new Scanner(System.in);

        System.out.print("Enter the wind speed in knots: ");

        int windInput = getWind.nextInt();
        
        if (windInput < 10 | windInput > 40)
            System.out.println("Try again. Enter a wind speed between 10 and 40 knots.");
        else
            System.out.println("Wind speed is: " + windInput);
        
        //TODO figure out if 'getWind' needs to be closed. closing here kills the second test in WindTest.java.
        //getWind.close();
        
        windSpeed = windInput;
        
        return windSpeed;
    }

    public void setWind(int newWind) { //allows any class to change the "windSpeed" variable
        windSpeed = newWind;
    }

    public String toString() { //this overrides java's default 'toString' to a human readable string, but i cannot remember why I did it
        return "Wind Speed is: " + this.getWind();
    }
}