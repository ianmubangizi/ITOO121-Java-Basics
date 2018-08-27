/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club;

import java.util.Scanner;

/**
 *
 * @author ian
 */
public class Club {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use Scanner as input byt making a new 
        // var named input
        Scanner input = new Scanner(System.in);

        // String start with String then varname
        String mmName;

        double unw,
                cuw,
                whr;

        boolean run = true;
        // This is how you Display
        while (run) {
            System.out.print("Enter (None) to exit or your Name: ");
            mmName = input.next();
            if (mmName.equalsIgnoreCase("None")){
                run = false;
            } else {
                System.out.print("What was your inital Weight: ");
                unw = input.nextDouble();
                System.out.print("What is your current Weight: ");
                cuw = input.nextDouble();
                if (unw < cuw) {
                    whr = cuw - unw;

                    System.out.println(mmName + " you gained [" + whr + "kg] Stop Eating");
                }
                if (unw > cuw) {
                    whr = cuw - unw;

                    System.out.println(mmName + " you lost [" + whr + "kg] Start Eating");
                }
            }
        }
    }
}
