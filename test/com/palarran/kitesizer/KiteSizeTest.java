/* KiteSizeDB.java
 * Dev: CB
 * 
 * Testing KiteSizeDB.java for the correct kite size using user provided weight and wind speed.
 */

package com.palarran.kitesizer;

import static org.junit.Assert.*;

import org.junit.Test;

public class KiteSizeTest {
    //TODO the tests both pass, they are not really doing anything. The test 'testSetKiteSize' needs 
    //to be redone to accept an actual kite size based on user input.
    
    @Test //testing the 'KiteSizeDB' class & 'getTheKiteSize' method
    public void testKiteSize() { 
        KiteSizeDB testKiteSize1 = new KiteSizeDB();
        int result = testKiteSize1.getTheKiteSize();
        assertEquals(0, result);
    }
    
    @Test //testing the 'setTheKiteSize' method
    public void testSetKiteSize() { 
        KiteSizeDB testKiteSize2 = new KiteSizeDB();
        testKiteSize2.setTheKiteSize(12);
        assertEquals(12, testKiteSize2.getTheKiteSize());
    }
}
    
