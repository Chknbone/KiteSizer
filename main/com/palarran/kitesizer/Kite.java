package com.palarran.kitesizer;

import java.time.LocalDate;
import java.util.Arrays;

public class Kite {

    //fields
    private LocalDate todaysDate;
    private WindSpeed speeds;
    private Weight weights;
    private UserName users;
    private Arrays sizes;

    

    //constructor
    public Kite(Kite kiteSizes) {
        todaysDate = LocalDate.now();
    }
    //getters and setters
    
    public WindSpeed getSpeeds() {
        return speeds;
    }

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

    public void setSpeeds(WindSpeed speeds) {
        this.speeds = speeds;
    }

    public Weight getWeights() {
        return weights;
    }

    public void setWeights(Weight weights) {
        this.weights = weights;
    }
    
    public void setSizes(Arrays sizes) {
        this.sizes = sizes;
    }
    
    public Arrays getSizes() {
        return sizes;
    }

//    public void setSizes(ArrayList<Kite> sizes2) {
//        this.sizes = sizes2;
//    }

    public String toString() {
        return "Hello " + this.getUsers() + " With your " + this.getWeights() + " and the " 
                + this.getSpeeds() + " knots. The recommended kite size to use is " 
                + this.getSizes() + ". This data is only valid for today's date: "
                + this.getTodaysDate();
    }

    public static void add(com.palarran.kitesizer.Kite kite) {
        // TODO Auto-generated method stub
        
    }
}
