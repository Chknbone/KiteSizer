/* KiteSizeDB.java
 * Written by: CB
 * 
 * Checking the Kite Size table for the correct kite size using user provided weight and wind speed.
 * 
 */

package com.palarran.kitesizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Databases {

    //fields
    private ArrayList<UserName> users;
    private ArrayList<Weight> weights;
    private ArrayList<WindSpeed> speeds;

    private void Kite(Arrays sizes) {

    }

    private static Logger kiteSizeDBLog = Logger.getLogger(Databases.class.getName());
    private static ConsoleHandler logScreen = new ConsoleHandler();

    //constructor
    public Databases() {
        users = new ArrayList<UserName>();
        weights = new ArrayList<Weight>();
        speeds = new ArrayList<WindSpeed>();
    }

    public Databases(Kite sizes) {
        sizes = new Kite(sizes);
    }

    //    private void Kite(Arrays sizes) {
    //        // TODO Auto-generated method stub
    //        
    //    }

    //getters and setters
    public void setLogging() {
        kiteSizeDBLog.addHandler(logScreen);
        kiteSizeDBLog.setLevel(Level.FINE);
        kiteSizeDBLog.setUseParentHandlers(false);
        logScreen.setLevel(Level.FINE);
    }

    public ArrayList<UserName> getUsers() {
        return users;
    }

    public ArrayList<Weight> getWeight() {
        return weights;
    }

    public ArrayList<WindSpeed> getWindSpeed() {
        return speeds;
    }

    public Arrays getKite() {
        return getKite();
    }

    public void addWeight(int weightChoices) {
        weights.add(new Weight(weightChoices));
    }

    public void addSpeed(int speedChoices) {
        speeds.add(new WindSpeed(speedChoices));
    }

    public void addSize(Kite kiteSizes) {
        Kite.add(new Kite(kiteSizes));
    }

    public boolean addUser(String userName) {
        boolean userExist = false;
        for (UserName data : getUsers()) {
            if (userName.equals(data.getName())) {
                userExist = true;
            }
        }
        if (userExist == false) {
            users.add(new UserName(userName));
        }
        return userExist;
    }

    public String addKiteSize(String userName, int userWeight, int userSpeed, int kiteSize) {
        kiteSizeDBLog.fine("Starting the process");
        //finding user object
        kiteSizeDBLog.fine("Getting user name");
        UserName kiteBoarder = null;
        for (UserName data : getUsers()) {
            if (userName.equals(data.getName())) {
                kiteBoarder = data;
            }
        }

        //finding user weight object
        kiteSizeDBLog.fine("Getting users weight");
        Weight kiteWeight = null;
        for (Weight data : getWeight()) {
            kiteSizeDBLog.fine("Comparing " + userWeight + " to " + data.getWeight());
            if (userWeight == data.getWeight()) {
                kiteWeight = data;
                kiteSizeDBLog.fine("kiteWeight value " + kiteWeight);
            }

        }

        //finding wind Speed object
        kiteSizeDBLog.fine("Getting wind speed");
        WindSpeed kiteSpeed = null;
        for (WindSpeed data : getWindSpeed()) {
            if (userSpeed == data.getWind()) {
                kiteSpeed = data;
            }

        }

        //TODO the below kiteSizes Arrays is not working. The loop works, but have not figure out how to use the indexes above to pull the right kite size out of the Array below.
        Kite kiteSizes = null;
        int rowsForKnotValues = 12;
        int columnsForWeightValues = 12;
        int kv, wv;

        int speedIndex = getWindSpeed().indexOf(kiteSpeed);
        int weightIndex = getWeight().indexOf(kiteWeight);

        for (kv = 0; kv < rowsForKnotValues; kv++) {
            for (wv = 0; wv < columnsForWeightValues; wv++) {
                
                Arrays[][] finalKiteSize = new Arrays [weightIndex][speedIndex];
               
                kiteSizeDBLog.fine("Arrays output " + finalKiteSize);
                //TODO God Dammit. I lost the plot here. I'm using Arrays wrong somehow.

                System.out.println();
            }
        }

        //Determine kite size
        kiteSizeDBLog.fine("Getting kite size and adding it all togather");
        Kite tempKite = new Kite(null);
        tempKite.setUsers(kiteBoarder);
        tempKite.setWeights(kiteWeight);
        tempKite.setSpeeds(kiteSpeed);
        tempKite.setSizes(kiteSizes);
        //tempKite.setTodaysDate(todaysDate);
        Kite.add(tempKite);
        kiteSizeDBLog.fine("DONE!");
        return tempKite.toString();
    }

    public void bootstrapWeightDB() {

        addWeight(95);
        addWeight(110);
        addWeight(125);
        addWeight(140);
        addWeight(155);
        addWeight(170);
        addWeight(185);
        addWeight(200);
        addWeight(215);
        addWeight(230);
        addWeight(245);
        addWeight(260);
    }

    public void bootstrapSpeedDB() {

        addSpeed(34);
        addSpeed(28);
        addSpeed(24);
        addSpeed(21);
        addSpeed(19);
        addSpeed(17);
        addSpeed(15);
        addSpeed(14);
        addSpeed(13);
        addSpeed(12);
        addSpeed(11);
        addSpeed(10);
    }

    public void bootstrapKiteSizeDB() {

        int[][] kiteSizes = new int[12][12];

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
    
}
