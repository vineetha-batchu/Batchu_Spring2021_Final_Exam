/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1Example2AbstractClass;

/**
 *
 * @author Vineetha Batchu
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rock r1=new Rock();
        System.out.println("Invoking a non abstract method of the abstract class");
        System.out.println("*******************************************************");
        r1.display();
        System.out.println("\nInvoking an abstract method of the abstract class");
        System.out.println("*******************************************************");
        r1.getMusicType();
        
        
        //from another sub class
        Pop p1=new Pop();
        System.out.println("\nInvoking a non abstract method of the abstract class");
        System.out.println("*******************************************************");
        p1.display();
        System.out.println("\nInvoking an abstract method of the abstract class");
        System.out.println("*******************************************************");
        p1.getMusicType();
    }
    
}
