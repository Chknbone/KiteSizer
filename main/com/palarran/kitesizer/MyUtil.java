package kitesizer;

import java.util.Scanner;

/* Sample Usage: 
        int x = MyUtil.getInt("How many stones do you want to take?");
*/

public class MyUtil {
    static int getInt(String prompt) {
            Scanner sc = new Scanner(System.in);
            System.out.print(prompt);

            boolean inputOK = false;
            int num = 0;

            while (! inputOK) {
                    if (sc.hasNextInt()) {  //check for int
                            num = sc.nextInt();
                            inputOK = true;
                    } else {
                            sc.nextLine();   //remove any junk typed
                            System.out.println("You must enter an int");
                            System.out.print(prompt);
                    }
            }
            return num;
    }
}
