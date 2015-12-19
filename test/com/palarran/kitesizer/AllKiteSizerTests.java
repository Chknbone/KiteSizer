/* AllKiteSizeTest.java
 * Dev: CB
 * 
 * Test suite for all the JUnit test in the KiteSizeDB project.
 */
package com.palarran.kitesizer;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ WeightTest.class, WindTest.class, KiteSizeTest.class })
public class AllKiteSizerTests {

}
