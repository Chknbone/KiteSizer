/* WindSpeed.java
 * Written by: CB
 * 
 * Requesting user input of wind speed.
 * 
 */

package com.palarran.kitesizer;

public class WindSpeed {

    //fields
    private int windSpeed;

    //constructor
    public WindSpeed() {
        windSpeed = 0; //this would be called like: windSpeed exampleSpeed = new windSpeed(); 
                       //exampleSpeed.setwindSpeed(15);
    }

    public WindSpeed(int windSpeed) { //constructors are allowed to have duplicate names.
        setWind(windSpeed); //this would be called like: windSpeed exampleSpeed = new windSpeed(15);
    }

    //getters and setters
    public int getWind() { //allows any class to return/use the "windSpeed" variable
        return windSpeed;
    }

    public void setWind(int newWindSpeedSetter) { //allows any class to change the "windSpeed" variable
        windSpeed = newWindSpeedSetter;
    }

    public String toString() { //this overrides java's default 'toString' to a human readable string, but i cannot remember why I did it
        return "wind blowing " + this.getWind();
    }
}