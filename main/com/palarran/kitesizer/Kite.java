package com.palarran.kitesizer;

import java.time.LocalDate;

public class Kite {

    //fields
    private LocalDate todaysDate;
    private UserName users;
    private WindSpeed speeds;
    private Weight weights;
    private Size sizes;

    //constructor
    public Kite(Size kiteSizes) {
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

    public Size getSizes() {
        return sizes;
    }

    public void setSizes(Size kiteSizes) {
        this.sizes = kiteSizes;
    }

    public String toString() {
        return "Hello " + this.getUsers() + " With your " + this.getWeights() + " and the "
                + this.getSpeeds() + " knots. Recommended kite size is "
                + this.getSizes() + ". \nData only valid for today's date: "
                + this.getTodaysDate();
    }

}
