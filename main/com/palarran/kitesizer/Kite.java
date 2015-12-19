/* Kite.java
 * Written by: CB
 * 
 * Combines Username, windSpeed, weight and KiteSize.
*/

package com.palarran.kitesizer;

import java.time.LocalDate;

public class Kite {

    //fields
    private LocalDate todaysDate;
    private UserName users;
    private WindSpeed speeds;
    private Weight weights;
    private int sizes;
    

    //constructor
    public Kite(Size kiteSizes) {
        todaysDate = LocalDate.now();
    }
    
    //getters and setters

    public LocalDate getTodaysDate() {
        return todaysDate;
    }

    public void setTodaysDate(LocalDate todaysDateSetter) {
        this.todaysDate = todaysDateSetter;
    }

    public UserName getUsers() {
        return users;
    }

    public void setUsers(UserName newUserNameSetter) {
        this.users = newUserNameSetter;
    }

    public Weight getWeights() {
        return weights;
    }

    public void setWeights(Weight newWeightsSetter) {
        this.weights = newWeightsSetter;
    }

    public WindSpeed getSpeeds() {
        return speeds;
    }

    public void setSpeeds(WindSpeed newWindSpeedsSetter) {
        this.speeds = newWindSpeedsSetter;
    }

    public int getSizes() {
        return sizes;
    }

    public void setSizes(int finalKiteSize) {
        this.sizes = finalKiteSize;
    }
    
    public static void add(Kite tempKite) {
                
    }
    
    public String toString() {
        return "Hello " + this.getUsers() + " With your " + this.getWeights() + " and the "
                + this.getSpeeds() + " knots. Recommended kite size is "
                + this.getSizes() + ". \nData only valid for today's date: "
                + this.getTodaysDate();
    }
    
}
