/* WeightTest.java
 * Dev: CB
 * 
 * Testing for user input of their weight.
 */

package com.palarran.kitesizer;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeightTest {
  //TODO figure out how to test for unknown user input instead of test provided input.
    
    @Test //testing the 'Weight' class & 'getWeight' method
    public void testWeight() {
        Weight testWeight1 = new Weight();
        int result = testWeight1.getWeight();
        assertEquals(0, result);
    }
    
    @Test //testing the 'setWeight' method
    public void testSetWeight() {
        Weight testWeight2 = new Weight();
        testWeight2.setWeight(222);
        assertEquals(222, testWeight2.getWeight());
    }
}