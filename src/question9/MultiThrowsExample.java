/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Vineetha Batchu
 */
public class MultiThrowsExample {

    public static void myMethod(int n) throws IOException, ClassNotFoundException {
        if (n == 1) {
            throw new IOException("IOException Occurred");
        } else {
            throw new ClassNotFoundException("ClassNotFoundException");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int n=sc.nextInt();
        try {
            
            myMethod(n);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
