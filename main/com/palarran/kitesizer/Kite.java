package com.palarran.kitesizer;

import java.time.LocalDate;
import java.util.Arrays;

public class Kite {

    //fields
    private LocalDate todaysDate;
    private UserName users;
    private WindSpeed speeds;
    private Weight weights;
    private Arrays sizes;

    //constructor
    public Kite(Kite kiteSizes) {
        todaysDate = LocalDate.now();
    }
    //getters and setters
    
    public LocalDate getTodaysDate() {
        return todaysDate;
    }

    public void setTodaysDate(LocalDate todaysDate) {
        this.todaysDate = todaysDate;
    }

    public UserName getUsers() {
        return users;
    }

    public void setUsers(UserName users) {
        this.users = users;
    }
    
    public Weight getWeights() {
        return weights;
    }

    public void setWeights(Weight weights) {
        this.weights = weights;
    }
    
    public WindSpeed getSpeeds() {
        return speeds;
    }
    
    public void setSpeeds(WindSpeed speeds) {
        this.speeds = speeds;
    }

    public Arrays getSizes() {
        return sizes;
    }
    
    public void setSizes(Arrays kiteSizes) {
        this.sizes = kiteSizes;
    }

    public String toString() {
        return "Hello " + this.getUsers() + " With your " + this.getWeights() + " and the "
                + this.getSpeeds() + " knots. The recommended kite size to use is "
                + this.getSizes() + ". This data is only valid for today's date: "
                + this.getTodaysDate();
    }

    public static void add(com.palarran.kitesizer.Kite kite) {
        // TODO Added this late at night and do not fully recall why. I know it has something to do with 
        // that fucked up Array for the kite sizes.

    }

    public void setSizes(com.palarran.kitesizer.Kite kiteSizes) {
        // TODO Auto-generated method stub
        
    }
}
