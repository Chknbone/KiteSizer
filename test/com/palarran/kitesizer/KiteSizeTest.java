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
        Databases testKiteSize1 = new Databases();
        int result = testKiteSize1.bootstrapKiteSizeDB();
        assertEquals(0, result);
    }
    
    @Test //testing the 'setTheKiteSize' method
    public void testSetKiteSize() { 
        Databases testKiteSize2 = new Databases();
        testKiteSize2.setTheKiteSize(12);
        assertEquals(12, testKiteSize2.bootstrapKiteSizeDB());
    }
}
    
