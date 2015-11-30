package com.palarran.kitesizer;

import java.time.LocalDate;

public class Kite {

    //fields
    private LocalDate todaysDate;
    private UserName users;
    private WindSpeed speeds;
    private Weight weights;
    private Kite sizes;

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

    public Kite getSizes() {
        return sizes;
    }

    public void setSizes(Kite kiteSizes) {
        this.sizes = kiteSizes;
    }

    public static void add(Kite tempKite) {

    }

    public String toString() {
        return "Hello " + this.getUsers() + " With your " + this.getWeights() + " and the "
                + this.getSpeeds() + " knots. The recommended kite size to use is "
                + this.getSizes() + ". This data is only valid for today's date: "
                + this.getTodaysDate();
    }

}
