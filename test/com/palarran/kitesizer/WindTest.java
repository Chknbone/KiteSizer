/* WindTest.java
 * Dev: CB
 * 
 * Testing for user input of the wind speed.
 */

package com.palarran.kitesizer;

import static org.junit.Assert.*;

import org.junit.Test;

public class WindTest {
    //TODO figure out how to test for unknown user input instead of test provided input.
    
    @Test //testing the 'WindSpeed' class & 'getWind' method
    public void testWind() {
        WindSpeed testWind1 = new WindSpeed();
        int result = testWind1.getWind();
        assertEquals(0, result);
    }
    
    @Test //testing the 'setWind' method
    public void testSetWind() {
        WindSpeed testWind2 = new WindSpeed();
        testWind2.setWind(22);
        assertEquals(22, testWind2.getWind());
    }
}