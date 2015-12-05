/* Size.java
 * Dev: CB
 * 
 * Holds kite size values.
*/
package com.palarran.kitesizer;

//fields
public class Size {

   private int kiteSize;
   
   //constructor
   public Size() {
       kiteSize = 0;//this would be called like: kiteSize exampleSize = new kiteSize(); 
       //exampleSize.setkiteSize(10)
   }
   public Size(int kiteSize) {
       setKiteSize(kiteSize); //this would be called like: kiteSize exampleSize = new kiteSize(10);
   }
   
   //getters and setters
   public int getKiteSize() { //allows any class to return/use the "kiteSize" variable
    return kiteSize;
   }
   
   public void setKiteSize(int kiteSize) { //allows any class to change the "kiteSize" variable
    this.kiteSize = kiteSize;
   }
   
   public String toString(){ //this overrides java's default 'toString' to a human readable string.
       return "kite size " + this.getKiteSize();
   }
   
}
