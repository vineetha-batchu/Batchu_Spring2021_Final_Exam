/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quetion3Narrowing;

/**
 *
 * @author Vineetha Batchu
 */
public class NarrowingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double number = 10.99;
        System.out.println("The double value: " + number);

        // convert into int type
        int convertedNumber = (int) number;
        System.out.println("The integer value: " + convertedNumber);
    }

}
