/* KiteSizeDB.java
 * Written by: CB
 * 
 * Asking for username from user.
 * Checking if username has been used before. If yes, returns "Welcome back"
 * If not, returns "Welcome".
 * ^^       ^^      ^^
 * Not really needed but just trying thing out.
 */
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

    public void setName(String newNameSetter) {
        this.name = newNameSetter;
    }
    
    public String toString() {
        return this.getName() + "!";
    }
    
}
