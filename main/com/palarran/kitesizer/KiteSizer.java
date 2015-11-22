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
        
        int[] topRow = new int[12];

        topRow[0] = 95;
        topRow[1] = 110;
        topRow[2] = 125;
        topRow[3] = 140;
        topRow[4] = 155;
        topRow[5] = 170;
        topRow[6] = 185;
        topRow[7] = 200;
        topRow[8] = 215;
        topRow[9] = 230;
        topRow[10] = 245;
        topRow[11] = 260;

        int[][] kiteSizes = new int[13][13];

        kiteSizes[0][0] = 3;
        kiteSizes[0][1] = 3;
        kiteSizes[0][2] = 4;
        kiteSizes[0][3] = 4;
        kiteSizes[0][4] = 5;
        kiteSizes[0][5] = 5;
        kiteSizes[0][6] = 5;
        kiteSizes[0][7] = 6;
        kiteSizes[0][8] = 6;
        kiteSizes[0][9] = 7;
        kiteSizes[0][10] = 7;
        kiteSizes[0][11] = 8;
        kiteSizes[0][12] = 34;

        kiteSizes[1][0] = 3;
        kiteSizes[1][1] = 4;
        kiteSizes[1][2] = 4;
        kiteSizes[1][3] = 5;
        kiteSizes[1][4] = 5;
        kiteSizes[1][5] = 6;
        kiteSizes[1][6] = 7;
        kiteSizes[1][7] = 7;
        kiteSizes[1][8] = 8;
        kiteSizes[1][9] = 8;
        kiteSizes[1][10] = 9;
        kiteSizes[1][11] = 9;
        kiteSizes[1][12] = 28;

        kiteSizes[2][0] = 4;
        kiteSizes[2][1] = 5;
        kiteSizes[2][2] = 5;
        kiteSizes[2][3] = 6;
        kiteSizes[2][4] = 6;
        kiteSizes[2][5] = 7;
        kiteSizes[2][6] = 8;
        kiteSizes[2][7] = 8;
        kiteSizes[2][8] = 9;
        kiteSizes[2][9] = 9;
        kiteSizes[2][10] = 10;
        kiteSizes[2][11] = 11;
        kiteSizes[2][12] = 24;

        kiteSizes[3][0] = 4;
        kiteSizes[3][1] = 5;
        kiteSizes[3][2] = 6;
        kiteSizes[3][3] = 7;
        kiteSizes[3][4] = 7;
        kiteSizes[3][5] = 8;
        kiteSizes[3][6] = 9;
        kiteSizes[3][7] = 9;
        kiteSizes[3][8] = 10;
        kiteSizes[3][9] = 11;
        kiteSizes[3][10] = 12;
        kiteSizes[3][11] = 12;
        kiteSizes[3][12] = 21;

        kiteSizes[4][0] = 5;
        kiteSizes[4][1] = 6;
        kiteSizes[4][2] = 7;
        kiteSizes[4][3] = 7;
        kiteSizes[4][4] = 8;
        kiteSizes[4][5] = 9;
        kiteSizes[4][6] = 10;
        kiteSizes[4][7] = 11;
        kiteSizes[4][8] = 11;
        kiteSizes[4][9] = 12;
        kiteSizes[4][10] = 13;
        kiteSizes[4][11] = 14;
        kiteSizes[4][12] = 19;

        kiteSizes[5][0] = 6;
        kiteSizes[5][1] = 6;
        kiteSizes[5][2] = 7;
        kiteSizes[5][3] = 8;
        kiteSizes[5][4] = 9;
        kiteSizes[5][5] = 10;
        kiteSizes[5][6] = 11;
        kiteSizes[5][7] = 12;
        kiteSizes[5][8] = 13;
        kiteSizes[5][9] = 14;
        kiteSizes[5][10] = 14;
        kiteSizes[5][11] = 15;
        kiteSizes[5][12] = 17;

        kiteSizes[6][0] = 6;
        kiteSizes[6][1] = 7;
        kiteSizes[6][2] = 8;
        kiteSizes[6][3] = 9;
        kiteSizes[6][4] = 10;
        kiteSizes[6][5] = 11;
        kiteSizes[6][6] = 12;
        kiteSizes[6][7] = 13;
        kiteSizes[6][8] = 14;
        kiteSizes[6][9] = 15;
        kiteSizes[6][10] = 16;
        kiteSizes[6][11] = 17;
        kiteSizes[6][12] = 15;

        kiteSizes[7][0] = 7;
        kiteSizes[7][1] = 8;
        kiteSizes[7][2] = 9;
        kiteSizes[7][3] = 10;
        kiteSizes[7][4] = 11;
        kiteSizes[7][5] = 12;
        kiteSizes[7][6] = 13;
        kiteSizes[7][7] = 14;
        kiteSizes[7][8] = 15;
        kiteSizes[7][9] = 16;
        kiteSizes[7][10] = 17;
        kiteSizes[7][11] = 18;
        kiteSizes[7][12] = 14;

        kiteSizes[8][0] = 7;
        kiteSizes[8][1] = 8;
        kiteSizes[8][2] = 10;
        kiteSizes[8][3] = 11;
        kiteSizes[8][4] = 12;
        kiteSizes[8][5] = 13;
        kiteSizes[8][6] = 14;
        kiteSizes[8][7] = 15;
        kiteSizes[8][8] = 16;
        kiteSizes[8][9] = 18;
        kiteSizes[8][10] = 19;
        kiteSizes[8][11] = 20;
        kiteSizes[8][12] = 13;

        kiteSizes[9][0] = 8;
        kiteSizes[9][1] = 9;
        kiteSizes[9][2] = 10;
        kiteSizes[9][3] = 12;
        kiteSizes[9][4] = 13;
        kiteSizes[9][5] = 14;
        kiteSizes[9][6] = 15;
        kiteSizes[9][7] = 16;
        kiteSizes[9][8] = 18;
        kiteSizes[9][9] = 19;
        kiteSizes[9][10] = 20;
        kiteSizes[9][11] = 21;
        kiteSizes[9][12] = 12;

        kiteSizes[10][0] = 8;
        kiteSizes[10][1] = 10;
        kiteSizes[10][2] = 11;
        kiteSizes[10][3] = 12;
        kiteSizes[10][4] = 14;
        kiteSizes[10][5] = 15;
        kiteSizes[10][6] = 16;
        kiteSizes[10][7] = 18;
        kiteSizes[10][8] = 19;
        kiteSizes[10][9] = 20;
        kiteSizes[10][10] = 22;
        kiteSizes[10][11] = 23;
        kiteSizes[10][12] = 11;

        kiteSizes[11][0] = 9;
        kiteSizes[11][1] = 10;
        kiteSizes[11][2] = 12;
        kiteSizes[11][3] = 13;
        kiteSizes[11][4] = 15;
        kiteSizes[11][5] = 16;
        kiteSizes[11][6] = 17;
        kiteSizes[11][7] = 19;
        kiteSizes[11][8] = 20;
        kiteSizes[11][9] = 22;
        kiteSizes[11][10] = 23;
        kiteSizes[11][11] = 24;
        kiteSizes[11][12] = 10;

        int weightRow = 12;
        int w;

        for (w = 0; w < weightRow; w++) {
            System.out.print(topRow[w] + " ");
        }
        System.out.print("<-Weight");
        System.out.print("\n\t\t\t\t\t\tKPH\n");

        int rowsForKnotValues = 12;
        int columnsForWeightValues = 13;
        int kv, wv;

        for (kv = 0; kv < rowsForKnotValues; kv++) {
            for (wv = 0; wv < columnsForWeightValues; wv++) {
                if (kiteSizes[kv][wv] < 10)
                    System.out.print(kiteSizes[kv][wv] + "   ");
                else
                    System.out.print(kiteSizes[kv][wv] + "  ");
            }
            System.out.println();
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