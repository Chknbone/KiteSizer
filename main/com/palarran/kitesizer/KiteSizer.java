/* KiteSizer.java
 * Dev: CB
 * 
 * Checking the Kite Size table for the correct kite size using user provided weight and wind speed.
 */

package com.palarran.kitesizer;

//fields
public class KiteSizer {
    
    private int theKiteSize;
    
    //constructor
    public KiteSizer() {
        theKiteSize = 0;
    }
    
    public KiteSizer(int theKiteSize) {
        setTheKiteSize(theKiteSize);
    }
    
    //getter and setters
    public int getTheKiteSize() {
        int[][] tableNumbers = new int[12][12];

        tableNumbers[0][0] = 3;
        tableNumbers[0][1] = 3;
        tableNumbers[0][2] = 4;
        tableNumbers[0][3] = 4;
        tableNumbers[0][4] = 5;
        tableNumbers[0][5] = 5;
        tableNumbers[0][6] = 5;
        tableNumbers[0][7] = 6;
        tableNumbers[0][8] = 6;
        tableNumbers[0][9] = 7;
        tableNumbers[0][10] = 7;
        tableNumbers[0][11] = 8;

        tableNumbers[1][0] = 3;
        tableNumbers[1][1] = 4;
        tableNumbers[1][2] = 4;
        tableNumbers[1][3] = 5;
        tableNumbers[1][4] = 5;
        tableNumbers[1][5] = 6;
        tableNumbers[1][6] = 7;
        tableNumbers[1][7] = 7;
        tableNumbers[1][8] = 8;
        tableNumbers[1][9] = 8;
        tableNumbers[1][10] = 9;
        tableNumbers[1][11] = 9;

        tableNumbers[2][0] = 4;
        tableNumbers[2][1] = 5;
        tableNumbers[2][2] = 5;
        tableNumbers[2][3] = 6;
        tableNumbers[2][4] = 6;
        tableNumbers[2][5] = 7;
        tableNumbers[2][6] = 8;
        tableNumbers[2][7] = 8;
        tableNumbers[2][8] = 9;
        tableNumbers[2][9] = 9;
        tableNumbers[2][10] = 10;
        tableNumbers[2][11] = 11;

        tableNumbers[3][0] = 4;
        tableNumbers[3][1] = 5;
        tableNumbers[3][2] = 6;
        tableNumbers[3][3] = 7;
        tableNumbers[3][4] = 7;
        tableNumbers[3][5] = 8;
        tableNumbers[3][6] = 9;
        tableNumbers[3][7] = 9;
        tableNumbers[3][8] = 10;
        tableNumbers[3][9] = 11;
        tableNumbers[3][10] = 12;
        tableNumbers[3][11] = 12;

        tableNumbers[4][0] = 5;
        tableNumbers[4][1] = 6;
        tableNumbers[4][2] = 7;
        tableNumbers[4][3] = 7;
        tableNumbers[4][4] = 8;
        tableNumbers[4][5] = 9;
        tableNumbers[4][6] = 10;
        tableNumbers[4][7] = 11;
        tableNumbers[4][8] = 11;
        tableNumbers[4][9] = 12;
        tableNumbers[4][10] = 13;
        tableNumbers[4][11] = 14;

        tableNumbers[5][0] = 6;
        tableNumbers[5][1] = 6;
        tableNumbers[5][2] = 7;
        tableNumbers[5][3] = 8;
        tableNumbers[5][4] = 9;
        tableNumbers[5][5] = 10;
        tableNumbers[5][6] = 11;
        tableNumbers[5][7] = 12;
        tableNumbers[5][8] = 13;
        tableNumbers[5][9] = 14;
        tableNumbers[5][10] = 14;
        tableNumbers[5][11] = 15;

        tableNumbers[6][0] = 6;
        tableNumbers[6][1] = 7;
        tableNumbers[6][2] = 8;
        tableNumbers[6][3] = 9;
        tableNumbers[6][4] = 10;
        tableNumbers[6][5] = 11;
        tableNumbers[6][6] = 12;
        tableNumbers[6][7] = 13;
        tableNumbers[6][8] = 14;
        tableNumbers[6][9] = 15;
        tableNumbers[6][10] = 16;
        tableNumbers[6][11] = 17;

        tableNumbers[7][0] = 7;
        tableNumbers[7][1] = 8;
        tableNumbers[7][2] = 9;
        tableNumbers[7][3] = 10;
        tableNumbers[7][4] = 11;
        tableNumbers[7][5] = 12;
        tableNumbers[7][6] = 13;
        tableNumbers[7][7] = 14;
        tableNumbers[7][8] = 15;
        tableNumbers[7][9] = 16;
        tableNumbers[7][10] = 17;
        tableNumbers[7][11] = 18;

        tableNumbers[8][0] = 7;
        tableNumbers[8][1] = 8;
        tableNumbers[8][2] = 10;
        tableNumbers[8][3] = 11;
        tableNumbers[8][4] = 12;
        tableNumbers[8][5] = 13;
        tableNumbers[8][6] = 14;
        tableNumbers[8][7] = 15;
        tableNumbers[8][8] = 16;
        tableNumbers[8][9] = 18;
        tableNumbers[8][10] = 19;
        tableNumbers[8][11] = 20;

        tableNumbers[9][0] = 8;
        tableNumbers[9][1] = 9;
        tableNumbers[9][2] = 10;
        tableNumbers[9][3] = 12;
        tableNumbers[9][4] = 13;
        tableNumbers[9][5] = 14;
        tableNumbers[9][6] = 15;
        tableNumbers[9][7] = 16;
        tableNumbers[9][8] = 18;
        tableNumbers[9][9] = 19;
        tableNumbers[9][10] = 20;
        tableNumbers[9][11] = 21;

        tableNumbers[10][0] = 8;
        tableNumbers[10][1] = 10;
        tableNumbers[10][2] = 11;
        tableNumbers[10][3] = 12;
        tableNumbers[10][4] = 14;
        tableNumbers[10][5] = 15;
        tableNumbers[10][6] = 16;
        tableNumbers[10][7] = 18;
        tableNumbers[10][8] = 19;
        tableNumbers[10][9] = 20;
        tableNumbers[10][10] = 22;
        tableNumbers[10][11] = 23;

        tableNumbers[11][0] = 9;
        tableNumbers[11][1] = 10;
        tableNumbers[11][2] = 12;
        tableNumbers[11][3] = 13;
        tableNumbers[11][4] = 15;
        tableNumbers[11][5] = 16;
        tableNumbers[11][6] = 17;
        tableNumbers[11][7] = 19;
        tableNumbers[11][8] = 20;
        tableNumbers[11][9] = 22;
        tableNumbers[11][10] = 23;
        tableNumbers[11][11] = 24;

        int rowsAreKnots = 12;
        int columnsAreWeights = 12;

        int i, j;
        //TODO the loops work and kick out the full/correct table. But need to figure out how to access the correct data
        for (i = 0; i < rowsAreKnots; i++) {
            for (j = 0; j < columnsAreWeights; j++) {
                System.out.print(tableNumbers[i][j] + " ");// this is just here to show the table, will be replace with something useful
            }
            System.out.println("");// this is just here to show the table. Same as above.
        }
        return theKiteSize;
    }

    public void setTheKiteSize(int theKiteSize) {
        this.theKiteSize = theKiteSize;
    }
    
    public String toString() { //this overrides java's default 'toString' to a human readable string, but i cannot remember why I did it
        return "The recommend kite size is: " + this.getTheKiteSize();
    }
}