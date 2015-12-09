package com.palarran.kitesizer;

import static org.junit.Assert.*;

import org.junit.Test;

public class KiteTest {

    @Test //testing the 'Kite' class and it's getters
    public void testKite() {
        Kite testKite1 = new Kite();
        WindSpeed speedResult1 = testKite1.getSpeeds();
        Weight weightResult1 = testKite1.getWeights();
        Databases sizeResult1 = testKite1.getSizes();
        assertEquals(null, speedResult1);
        assertEquals(null, weightResult1);
        assertEquals(null, sizeResult1);
    }
    
    @Test //testing the 'setSpeeds' method
    public void testSetSpeed() {
        Kite testKite2 = new Kite();
        WindSpeed speedResult2 = new WindSpeed(15);
        testKite2.setSpeeds(speedResult2);;
        assertEquals(15, testKite2.getSpeeds());
    }
    
    @Test //testing the 'setWeight' methods
    public void testSetWeight() {
        Kite testKite3 = new Kite();
        //Weight weightResult2 = new Weight(200);
        testKite3.setWeights(200);
        assertEquals(200, testKite3.getWeights());
    }
    
//    @Test //testing the 'setKiteSizeDB' methods
//    public void testKiteSizeDB() {
//        
//    }

}
