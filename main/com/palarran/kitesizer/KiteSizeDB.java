/* KiteSizeDB.java
 * Dev: CB
 * 
 * Checking the Kite Size table for the correct kite size using user provided weight and wind speed.
 * Change: Was 'KiteSizer.java' refactored to 'KiteSizeDB'.
 */

package com.palarran.kitesizer;

import java.util.ArrayList;

public class KiteSizeDB {

    //fields
    private ArrayList<Weight> weights;
    private ArrayList<WindSpeed> speeds;
    private ArrayList<Kite> sizes;

    //constructor
    public KiteSizeDB() {
        weights = new ArrayList<Weight>();
        speeds = new ArrayList<WindSpeed>();
        sizes = new ArrayList<Kite>();
    }

    //getters and setters
    public ArrayList<Weight> getWeight() {
        return weights;
    }

    public ArrayList<WindSpeed> getWindSpeed() {
        return speeds;
    }

    public ArrayList<Kite> getKite() {
        return sizes;
    }

    public void addSpeed(int speedChoices) {
        speeds.add(new WindSpeed(speedChoices));
    }

    public void addWeight(int weightChoices) {
        weights.add(new Weight(weightChoices));
    }

    public boolean addWeight(Integer usersWeight) {
        boolean weightCorrect = false;
        for (Weight check : getWeight()) {
            if (usersWeight.equals(check.getWeight())) {
                weightCorrect = true;
            }
        }
        if (weightCorrect == false) {
            weights.add(new Weight(usersWeight));
        }
        return weightCorrect;
    }

    public String addKiteSize(int pounds, int knots) {

        //finding user weight object
        Weight kiteWeight = null;
        for (Weight data : getWeight()) {
            if (pounds == data.getWeight()) {
                kiteWeight = data;
            }
        }

        //finding wind Speed object
        WindSpeed kiteSpeed = null;
        for (WindSpeed data : getWindSpeed()) {
            if (knots == data.getWind()) {
                kiteSpeed = data;
            }
        }

        //Determine kite size
        Kite tempKite = new Kite();
        tempKite.setWeights(kiteWeight);
        tempKite.setSpeeds(kiteSpeed);
        sizes.add(tempKite);
        return tempKite.toString();
    }

    public void bootstrapSpeedDB() {

        addSpeed(95);
        addSpeed(110);
        addSpeed(125);
        addSpeed(140);
        addSpeed(155);
        addSpeed(170);
        addSpeed(185);
        addSpeed(200);
        addSpeed(215);
        addSpeed(230);
        addSpeed(245);
        addSpeed(260);
    }

    public void bootstrapWeightDB() {

        addWeight(34);
        addWeight(28);
        addWeight(24);
        addWeight(21);
        addWeight(19);
        addWeight(17);
        addWeight(15);
        addWeight(14);
        addWeight(13);
        addWeight(12);
        addWeight(11);
        addWeight(10);
    }

    public void bootstrapKiteSizeDB() {

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
    }

    public void kiteTable() {
    int rowsForKnotValues = 12;
    int columnsForWeightValues = 12;
    int kv, wv;

        for(kv=0;kv<rowsForKnotValues;kv++) {
            for (wv = 0; wv < columnsForWeightValues; wv++) {
                if (kiteSizes[kv][wv] < 10) {
                    System.out.print(kiteSizes[kv][wv] + "   ");
                } else {
                    System.out.print(kiteSizes[kv][wv] + "  ");
                }
                System.out.println();
            }
        }
    }
}
