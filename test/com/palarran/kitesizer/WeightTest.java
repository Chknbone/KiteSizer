/* WeightTest.java
 * Dev: CB
 * 
 * Testing for user input of their weight.
 */

package com.palarran.kitesizer;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeightTest {
  //TODO figure out how to test for unknown user input instead of test provided.
    @Test //testing the 'AskWeight' class & 'getWeight' method
    public void testWeight() {
        AskWeight testWeight1 = new AskWeight();
        int result = testWeight1.getWeight();
        assertEquals(0, result);
    }
    
    @Test //testing the 'AskWeight' class & 'setWeight' method
    public void testSetWeight() {
        AskWeight testWeight2 = new AskWeight();
        testWeight2.setWeight(280);
        assertEquals(280, testWeight2.getWeight());
    }
           
}
