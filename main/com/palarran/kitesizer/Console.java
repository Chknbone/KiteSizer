/* KiteSizeDB.java
 * Dev: CB
 * 
 * Program is being write initially for output to the console. Main method will live here. 
 * After getting console working, may tackle it in Spring or something similar.
 */
package com.palarran.kitesizer;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        // TODO initialize KiteSizeDB database
        // TODO initialize Console
        // TODO ask for user weight and add to DB
        // pulled from 'Weight', will live here now.
        Scanner getWeight = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");

        int weightInput = getWeight.nextInt();

        if (weightInput < 95 | weightInput > 300)
            System.out.println("Try again. Enter a weight between 95 and 300 pounds.");
        else
            System.out.println("Your weight is " + weightInput);

        //TODO figure out if 'getWeight' needs to be closed. closing here kills the second test in WeightTest.java.
        //getWeight.close(); 
        
        userWeight = weightInput;
        
        // TODO show available windspeed and ask  for input
        // pulled from 'WindSpeed.java', will live here now.
        Scanner getWind = new Scanner(System.in);

        System.out.print("Enter the wind speed in knots: ");

        int windInput = getWind.nextInt();

        if (windInput < 10 | windInput > 40)
            System.out.println("Try again. Enter a wind speed between 10 and 40 knots.");
        else
            System.out.println("Wind speed is: " + windInput);

        //TODO figure out if 'getWind' needs to be closed. closing here kills the second test in WindTest.java.
        //getWind.close();

        windSpeed = windInput;
        // TODO combine weight and wind and show suggested kite size

    }

}
