package com.palarran.kitesizer;

public class UserName {

    //fields
    private String name; //users name
    
    //constructor
    public UserName() {
        name = "Unknown name"; //this would be called like: UserName n1 = new UserName(); n1.setName("CB Midkiff");
    }
    
    public UserName(String name) {
        setName(name); //this would be called like: UserName n1 = new UserName("CB Midkiff");
    }
    
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    
    public String toString() {
        return this.getName() + "!";
    }
    
}
