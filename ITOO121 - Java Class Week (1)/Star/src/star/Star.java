/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star;

import java.util.Scanner;

/**
 *
 * @author ian
 */
public class Star {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean run = true;
        int empID = 0,
                iopts,
                runcr = 0;

        double _b = 0.057,
                _i = 0,
                sly = 0, _i_sly,
                tt_sly = 0,avg_sly;

        String dCode = "", fChin = "";

        while (run) {
            System.out.print("What would you Like to Do?\n"
                    + "(1) - Enter Employee Number\n"
                    + "(2) - Enter Salary\n"
                    + "(3) - Enter Department\n"
                    + "(4) - Increase Employee Salay\n"
                    + "(5) - Exit\n[INPUT]:");
            iopts = input.nextInt();
            runcr++;
            switch (iopts) {
                case 1:
                    System.out.print("Enter Employee Number: ");
                    empID = input.nextInt();
                    break;
                case 2:
                    System.out.print("Enter Salary for [" + empID + "]: ");
                    sly = input.nextDouble();
                    break;
                case 3:
                    System.out.print("What Department is [" + empID + "] in?\n"
                            + "(AY)\n(HT)\n(KL)\n(OD) for Other\n"
                            + "Use the Codes Above as input\n[INPUT CODE]: ");
                    dCode = input.next();
                    break;
                case 4:
                    if (dCode.equalsIgnoreCase("")
                            || (boolean) (dCode.equalsIgnoreCase("")
                            && dCode.equalsIgnoreCase("OD"))) {
                        System.out.println("Error [" + dCode + "]"
                                + " Not a Vaild input");
                    } else if (dCode.equalsIgnoreCase("OD")) {
                        _i = (_b + 0.001);
                    } else {
                        if (dCode.equalsIgnoreCase("AY")) {
                            _i = (_b + 0.003);
                        }
                        if (dCode.equalsIgnoreCase("HT")) {
                            _i = (_b + 0.006);
                        }
                        if (dCode.equalsIgnoreCase("KL")) {
                            _i = (_b + 0.0012);
                        }
                    }
                    _i_sly = sly + (_i * sly);
                    tt_sly = tt_sly + (_i * sly);
                    System.out.println("Employee [" + empID + "] Salay got a "
                            + "[" + String.format("%.2f",
                                    (_i * 100)) + "%] Increase\n"
                            + "From [R" + sly + "] to [R" + _i_sly + "]");
                    break;
                case 5:
                    avg_sly = tt_sly / runcr;
                    System.out.println("Total Increases amount to "
                            + "[R" + tt_sly + "]\n"
                            + "Avgerage Increase [R" + avg_sly + "]");
                    run = false;
                    break;
                default:
                    System.out.println("Error ["
                            + iopts + "] Not a Vaild input");
                    break;
            }
        }
    }
}
