/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

import java.util.Scanner;
/**
 *
 * @author ian
 */
public class House {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numMnTS;
        
        double  accBL = 0,
                amountN,
                amountTS;
        
        System.out.print("How much do you need?: ");
        amountN = input.nextDouble();
        System.out.print("How much can you save?: ");
        amountTS = input.nextDouble();
        numMnTS = (int)(amountN/amountTS);
        if (amountTS < 80000){
            for(int i = 1; i <= numMnTS;i++)
               accBL = amountTS*((1 + 0.007/12)*i);
        } else if(amountTS >= 80000){
            for(int i = 1; i <= numMnTS;i++)
               accBL = amountTS*((1 + 0.009/12)*i);
        }
        System.out.print("You Made [R"+ accBL +"] in ["+ numMnTS +"]");
    }
}
