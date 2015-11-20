package com.palarran.kitesizer;

import static org.junit.Assert.*;

import org.junit.Test;

public class KiteSizeTest {

    @Test
    public void testKiteSize() {
        KiteSizer testKiteSize1 = new KiteSizer();
        int result = testKiteSize1.getTheKiteSize();
        assertEquals(0, result);
    }
    
    @Test
    public void testSetKiteSize() {
        KiteSizer testKiteSize2 = new KiteSizer();
        int tableResults = testKiteSize2.setTheKiteSize(theKiteSize);
        assertEquals(theKiteSize, testKiteSize2.getTheKiteSize());
    }
}
