/* WindTest.java
 * Dev: CB
 * 
 * Testing for user input of the wind speed.
 */

package com.palarran.kitesizer;

import static org.junit.Assert.*;
import org.junit.Test;


public class WindTest {
    //TODO figure out how to test for unknown user input instead of test provided.
    @Test //testing the 'AskWind' class & 'getWind' method
    public void testWind() {
        AskWind testWind1 = new AskWind();
        int result = testWind1.getWind();
        assertEquals(0, result);
    }
    
    @Test //testing the 'setWind' method
    public void testSetWind() {
        AskWind testWind2 = new AskWind();
        testWind2.setWind(18);
        assertEquals(18, testWind2.getWind());
    }

}
