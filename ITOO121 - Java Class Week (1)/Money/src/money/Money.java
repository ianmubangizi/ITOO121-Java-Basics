/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

import java.util.Scanner;

/**
 *
 * @author ian
 */
public class Money {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coin,
                coins = 0,
                _5rand = 0,
                _2rand = 0,
                _1rand = 0;

        double money,
                amountD;

        boolean sc = false;

        System.out.print("How Much money do you have?: ");
        money = input.nextDouble();
        boolean t = false;
        while (!t) {
            if (money < 100 || money > 135) {
                System.out.print("Error Try Again: ");
                money = input.nextDouble();
            } else {
                t = true;
            }
        }
        System.out.print("How Much Money is Due: ");
        amountD = input.nextDouble();

        while (amountD != 0) {
            System.out.print("Enter Coin Amount: ");
            coin = input.nextInt();
            while (!sc && (amountD != 0)) {
                switch (coin) {
                    case 1:
                        _1rand = _1rand + 1;
                        sc = true;
                        break;
                    case 2:
                        _2rand = _2rand + 1;
                        sc = true;
                        break;
                    case 5:
                        _5rand = _5rand + 1;
                        sc = true;
                        break;
                    default:
                        System.out.print("[R" + coin + "] Not a Coin, Try Again: ");
                        coin = input.nextInt();
                        break;
                }
            }
            if (amountD != 0) {
                sc = false;
                coins = coins + 1;
                amountD = amountD - coin;

                System.out.println("[(" + _1rand + ") 1 Rand Coins]"
                        + "[(" + _2rand + ") 2 Rand Coins]"
                        + "[(" + _5rand + ") 5 Rand Coins]\n"
                        + "[(" + coins + ") Total Coins]\n"
                        + "[Amount Due (R" + amountD + ")]");
            }
        }
    }
}
