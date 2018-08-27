/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ball;
/**
 *
 * @author ian
 */
public class Ball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double rgh = 7.85;
        int cc = 0;
        while(rgh > 0.05){
           System.out.println(rgh);
           rgh = rgh - (rgh/2);
           cc++;
        }
        System.out.println("From the Heghit of 7.85m"
                + " a Ball will Bounce ["+cc+"] Times Before getting to 5cm");
    }
    
}
