/* KiteSizer.java
 * Dev: CB
 * 
 * Checking the Kite Size table for the correct kite size using user provided weight and wind speed.
 */

package com.palarran.kitesizer;

//fields
public class KiteSizer {
    
    private int theKiteSize;
    
    //constructor
    public KiteSizer() {
        theKiteSize = 0;
    }
    
    public KiteSizer(int theKiteSize) {
        setTheKiteSize(theKiteSize);
    }
    
    //getter and setters
    public int getTheKiteSize() {
        return theKiteSize;
    }

    public void setTheKiteSize(int theKiteSize) {
        this.theKiteSize = theKiteSize;
    }
    
    public String toString() { //this overrides java's default 'toString' to a human readable string, but i cannot remember why I did it
        return "The recommend kite size is: " + this.getTheKiteSize();
    }
}