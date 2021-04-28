/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.util.Scanner;

/**
 *
 * @author Vineetha Batchu
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of Circle 1: ");
        double r1=sc.nextDouble();
        System.out.print("Enter the radius of Circle 2: ");
        double r2=sc.nextDouble();
        ComparableCircle c1 = new ComparableCircle(r1);
        ComparableCircle c2 = new ComparableCircle(r2);
        if (c1.compareTo(c2) > 0) {
            System.out.println("Larger object is" + c1);

        } else if (c1.compareTo(c2) ==0) {
            System.out.println("Both objects " + c1 + " and " + c2 + " are equal");

        } else {
            System.out.println("Larger Object is " + c2);

        }

    }

}
