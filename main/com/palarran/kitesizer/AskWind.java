/* AskWind.java
 * Dev: CB
 * 
 * Requesting user input of wind speed.
 */

package com.palarran.kitesizer;

import java.util.Scanner;

//fields
public class AskWind {

    private int windSpeed;

    //constructor
    public AskWind() {

        windSpeed = 0;
    }

    //getters and setters
    public int getWind() { //allows any class to return/use the "windSpeed" variable

        Scanner getWind = new Scanner(System.in);

        System.out.print("Enter the wind speed in knots: ");

        int windInput = getWind.nextInt();

        if (windInput >= 10 & windInput <= 40)
            System.out.println("Wind speed is " + windInput);

        if (windInput <= 9 | windInput >= 41)
            System.out.println("Try again. Enter a wind speed between 10 and 40 knots.");
        
        //TODO figure out if 'getWind' needs to be closed. closing here kills the second test.
        //getClass().getWind.close();

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
