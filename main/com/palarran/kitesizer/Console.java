/* KiteSizeDB.java
 * Dev: CB
 * 
 * Program is being write initially for output to the console. Main method will live here. 
 * After getting console working, may tackle it in Spring or something similar.
 */
package com.palarran.kitesizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        // TODO initialize KiteSizeDB database
        KiteSizeDB prodDB = new KiteSizeDB();
        prodDB.bootstrapKiteSizeDB();
        prodDB.bootstrapWeightDB();
        prodDB.bootstrapSpeedDB();

        // TODO initialize Console
        boolean programRunning = true;
        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
        int userWeightPounds = 0;
        int windSpeedKnots = 0;

        while (programRunning) {
            // TODO ask for user weight and add to DB
            System.out.print(
                    "This App will determine what size kite you should us based on your weight and the wind speed you provide.");
            System.out.println("\nFrom the following list: ");
            for (Weight data : prodDB.getWeight()) {
                System.out.println(data);
            }

            System.out.println("Enter the weight closet to your weight. Prices Right rules apply");
            try {
                userWeightPounds = Integer.parseInt(consoleInput.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Weights provided must be integers");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // TODO show available wind speeds and ask  for input
            System.out.println("\nFrom the following list of wind Speeds: ");
            for (WindSpeed data : prodDB.getWindSpeed()) {
                System.out.println(data);
            }

            System.out.println(
                    "Enter the wind speed closet to the wind speed you are gonna kite in. Prices Right rules apply here as well");
            try {
                windSpeedKnots = Integer.parseInt(consoleInput.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Wind speeds provided must be integers");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // TODO combine weight and wind and show suggested kite size
            String kiteInfo = prodDB.addKiteSize(userWeightPounds, windSpeedKnots);
            System.out.println("\nEvaluation successfull. Here are your details: ");
            System.out.println(kiteInfo + "\n");
        }
    }
}