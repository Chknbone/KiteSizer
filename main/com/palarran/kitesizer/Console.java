/* KiteSizeDB.java
 * Written by: CB
 * 
 * Program is being write initially for output to the console. Main method will live here. 
 * After getting console working, may tackle it in Spring or something similar.
 */

package kitesizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

    public static void main(String[] args) {

        Databases prodDB = new Databases();
      
        prodDB.setLogging();

        // initialize Console
        boolean programRunning = true;
        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
        String userName = null;
        int userWeightPounds = 0;
        int windSpeedKnots = 0;
        //TODO add variable for kite size
        
        
        while (programRunning) {
            //ask for users name and add it to DB
            System.out.println("Enter your name: ");

            try {
                userName = consoleInput.readLine();
            } catch (IOException e) {
                System.out.println("Names only, no numbers. Try again."); //THIS DOES NOTHING
            }

            boolean nameResult = prodDB.addUser(userName);

            if (nameResult) {
                System.out.println("Welcome back " + userName); //user name exists in DB
            } else {
                System.out.println("Welcome " + userName); // user name does not exist in DB
            }

            // ask for user weight and add to DB
            System.out.println("This App will determine what size kite you should use based on your weight and the wind speed you provide.");
            System.out.print("\nFrom the following list (in lbs): ");
            
            //for (Integer data : prodDB.getWeight()) {  //If you are sending the whole ArrayList here anyway, then what's the point in making it private?
            //    System.out.println(data);
            //}
            System.out.println(prodDB.listWeights());

            String prompt = "Enter the weight closest to your weight. (\"Price is Right\" rules apply.)";
            userWeightPounds = MyUtil.getInt(prompt);
          
            //show list of available wind speeds and ask  for input
            System.out.print("\nFrom the following list of wind Speeds (in knots): ");
            System.out.println(prodDB.listSpeeds());

            prompt = "Enter the wind speed closest to the wind speed you are gonna kite in. (\"Price is Right\" rules apply here too.)";
            windSpeedKnots = MyUtil.getInt(prompt);
          
            
            //choosing kite size
            //TODO add in kite size stuff
            
            // combine weight and wind and show suggested kite size
            String kiteInfo = prodDB.addKiteSize(userName, userWeightPounds, windSpeedKnots);
            System.out.println("\nMaths done. Here are the details: ");
            System.out.println(kiteInfo + "\n");
        }
    }
}