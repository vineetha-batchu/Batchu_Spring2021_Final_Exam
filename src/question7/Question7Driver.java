/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Vineetha Batchu
 */
public class Question7Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        //creating an integer IntegerArray
        int[] IntegerArray = new int[100];
        for (int i = 0; i < IntegerArray.length; i++) {
            IntegerArray[i] = (int) (Math.random() * 100) + 1;
        }

        // ask the user to enter the index 
        System.out.print("Enter the index of the array: ");
        try {
            // Display that index element value
            System.out.println("The corresponding element value is "
                    + IntegerArray[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds.");
        }
    }

}
