/* KiteSizer.java
 * Dev: CB
 * 
 * Checking the Kite Size table for the correct kite size using user provided weight and wind speed.
 */

package com.palarran.kitesizer;

public class KiteSizer {
    
  //fields
    private int theKiteSize;
    
    //constructor
    public KiteSizer() {
        theKiteSize = 0; //this would be called like: theKiteSize exampleSize = new theKiteSize(); 
                         //exampleSize.settheKiteSize(9);
    }
    
    public KiteSizer(int theKiteSize) { //constructors are allowed to have duplicate names.
        setTheKiteSize(theKiteSize); //this would be called like: theKiteSize exampleKiteSize = new theKiteSize(9);
    }
    
    //getters and setters
    public int getTheKiteSize() {
        int[][] kiteTableNumbers = new int[12][12]; //Setting the 2 diminsional Array size

        kiteTableNumbers[0][0] = 3;
        kiteTableNumbers[0][1] = 3;
        kiteTableNumbers[0][2] = 4;
        kiteTableNumbers[0][3] = 4;
        kiteTableNumbers[0][4] = 5;
        kiteTableNumbers[0][5] = 5;
        kiteTableNumbers[0][6] = 5;
        kiteTableNumbers[0][7] = 6;
        kiteTableNumbers[0][8] = 6;
        kiteTableNumbers[0][9] = 7;
        kiteTableNumbers[0][10] = 7;
        kiteTableNumbers[0][11] = 8;

        kiteTableNumbers[1][0] = 3;
        kiteTableNumbers[1][1] = 4;
        kiteTableNumbers[1][2] = 4;
        kiteTableNumbers[1][3] = 5;
        kiteTableNumbers[1][4] = 5;
        kiteTableNumbers[1][5] = 6;
        kiteTableNumbers[1][6] = 7;
        kiteTableNumbers[1][7] = 7;
        kiteTableNumbers[1][8] = 8;
        kiteTableNumbers[1][9] = 8;
        kiteTableNumbers[1][10] = 9;
        kiteTableNumbers[1][11] = 9;

        kiteTableNumbers[2][0] = 4;
        kiteTableNumbers[2][1] = 5;
        kiteTableNumbers[2][2] = 5;
        kiteTableNumbers[2][3] = 6;
        kiteTableNumbers[2][4] = 6;
        kiteTableNumbers[2][5] = 7;
        kiteTableNumbers[2][6] = 8;
        kiteTableNumbers[2][7] = 8;
        kiteTableNumbers[2][8] = 9;
        kiteTableNumbers[2][9] = 9;
        kiteTableNumbers[2][10] = 10;
        kiteTableNumbers[2][11] = 11;

        kiteTableNumbers[3][0] = 4;
        kiteTableNumbers[3][1] = 5;
        kiteTableNumbers[3][2] = 6;
        kiteTableNumbers[3][3] = 7;
        kiteTableNumbers[3][4] = 7;
        kiteTableNumbers[3][5] = 8;
        kiteTableNumbers[3][6] = 9;
        kiteTableNumbers[3][7] = 9;
        kiteTableNumbers[3][8] = 10;
        kiteTableNumbers[3][9] = 11;
        kiteTableNumbers[3][10] = 12;
        kiteTableNumbers[3][11] = 12;

        kiteTableNumbers[4][0] = 5;
        kiteTableNumbers[4][1] = 6;
        kiteTableNumbers[4][2] = 7;
        kiteTableNumbers[4][3] = 7;
        kiteTableNumbers[4][4] = 8;
        kiteTableNumbers[4][5] = 9;
        kiteTableNumbers[4][6] = 10;
        kiteTableNumbers[4][7] = 11;
        kiteTableNumbers[4][8] = 11;
        kiteTableNumbers[4][9] = 12;
        kiteTableNumbers[4][10] = 13;
        kiteTableNumbers[4][11] = 14;

        kiteTableNumbers[5][0] = 6;
        kiteTableNumbers[5][1] = 6;
        kiteTableNumbers[5][2] = 7;
        kiteTableNumbers[5][3] = 8;
        kiteTableNumbers[5][4] = 9;
        kiteTableNumbers[5][5] = 10;
        kiteTableNumbers[5][6] = 11;
        kiteTableNumbers[5][7] = 12;
        kiteTableNumbers[5][8] = 13;
        kiteTableNumbers[5][9] = 14;
        kiteTableNumbers[5][10] = 14;
        kiteTableNumbers[5][11] = 15;

        kiteTableNumbers[6][0] = 6;
        kiteTableNumbers[6][1] = 7;
        kiteTableNumbers[6][2] = 8;
        kiteTableNumbers[6][3] = 9;
        kiteTableNumbers[6][4] = 10;
        kiteTableNumbers[6][5] = 11;
        kiteTableNumbers[6][6] = 12;
        kiteTableNumbers[6][7] = 13;
        kiteTableNumbers[6][8] = 14;
        kiteTableNumbers[6][9] = 15;
        kiteTableNumbers[6][10] = 16;
        kiteTableNumbers[6][11] = 17;

        kiteTableNumbers[7][0] = 7;
        kiteTableNumbers[7][1] = 8;
        kiteTableNumbers[7][2] = 9;
        kiteTableNumbers[7][3] = 10;
        kiteTableNumbers[7][4] = 11;
        kiteTableNumbers[7][5] = 12;
        kiteTableNumbers[7][6] = 13;
        kiteTableNumbers[7][7] = 14;
        kiteTableNumbers[7][8] = 15;
        kiteTableNumbers[7][9] = 16;
        kiteTableNumbers[7][10] = 17;
        kiteTableNumbers[7][11] = 18;

        kiteTableNumbers[8][0] = 7;
        kiteTableNumbers[8][1] = 8;
        kiteTableNumbers[8][2] = 10;
        kiteTableNumbers[8][3] = 11;
        kiteTableNumbers[8][4] = 12;
        kiteTableNumbers[8][5] = 13;
        kiteTableNumbers[8][6] = 14;
        kiteTableNumbers[8][7] = 15;
        kiteTableNumbers[8][8] = 16;
        kiteTableNumbers[8][9] = 18;
        kiteTableNumbers[8][10] = 19;
        kiteTableNumbers[8][11] = 20;

        kiteTableNumbers[9][0] = 8;
        kiteTableNumbers[9][1] = 9;
        kiteTableNumbers[9][2] = 10;
        kiteTableNumbers[9][3] = 12;
        kiteTableNumbers[9][4] = 13;
        kiteTableNumbers[9][5] = 14;
        kiteTableNumbers[9][6] = 15;
        kiteTableNumbers[9][7] = 16;
        kiteTableNumbers[9][8] = 18;
        kiteTableNumbers[9][9] = 19;
        kiteTableNumbers[9][10] = 20;
        kiteTableNumbers[9][11] = 21;

        kiteTableNumbers[10][0] = 8;
        kiteTableNumbers[10][1] = 10;
        kiteTableNumbers[10][2] = 11;
        kiteTableNumbers[10][3] = 12;
        kiteTableNumbers[10][4] = 14;
        kiteTableNumbers[10][5] = 15;
        kiteTableNumbers[10][6] = 16;
        kiteTableNumbers[10][7] = 18;
        kiteTableNumbers[10][8] = 19;
        kiteTableNumbers[10][9] = 20;
        kiteTableNumbers[10][10] = 22;
        kiteTableNumbers[10][11] = 23;

        kiteTableNumbers[11][0] = 9;
        kiteTableNumbers[11][1] = 10;
        kiteTableNumbers[11][2] = 12;
        kiteTableNumbers[11][3] = 13;
        kiteTableNumbers[11][4] = 15;
        kiteTableNumbers[11][5] = 16;
        kiteTableNumbers[11][6] = 17;
        kiteTableNumbers[11][7] = 19;
        kiteTableNumbers[11][8] = 20;
        kiteTableNumbers[11][9] = 22;
        kiteTableNumbers[11][10] = 23;
        kiteTableNumbers[11][11] = 24;

        int rowsAreKnots = 12;
        int columnsAreWeights = 12;

        int i, j;
        //TODO the loops work and kick out the full/correct table. But need to figure out how to access the correct data
        for (i = 0; i < rowsAreKnots; i++) {
            for (j = 0; j < columnsAreWeights; j++) {
                System.out.print(kiteTableNumbers[i][j] + " ");// this is just here to show the table, will be replace with something useful
            }
            System.out.println("");// this is just here to show the table. Same as above.
        }
        return theKiteSize; //Does nothing yet. But this should pass data to KiteSizeTest.java
    }

    public void setTheKiteSize(int theKiteSize) { //allows any class to change the "theKiteSize" variable
        this.theKiteSize = theKiteSize;
    }
    
    public String toString() { //this overrides java's default 'toString' to a human readable string, but i cannot remember why exactly I did it
        return "The recommend kite size is: " + this.getTheKiteSize();
    }
}