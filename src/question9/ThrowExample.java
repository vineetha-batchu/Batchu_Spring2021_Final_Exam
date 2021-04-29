/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.util.Scanner;

/**
 *
 * @author Vineetha Batchu
 */
public class ThrowExample {

    /**
     * @param args the command line arguments
     */
    public static void checkTheAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        checkTheAge(age);

        System.out.println("end of the code...");

    }

}
