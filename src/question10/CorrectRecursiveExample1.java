/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author Vineetha Batchu
 */
public class CorrectRecursiveExample1 {

    public static long fact(int n) {
        // correct base case
        if (n < 1) {
            return 1;
        } else {
            return n*fact(n-1);
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Fcatorial of 5 is " + fact(5));
    }

}