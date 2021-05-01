/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Vineetha Batchu
 */
public class LaptopDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Laptop l1=new Laptop(250, "SE123");
        Laptop l2=new Laptop(350, "SM113");
        Laptop l3=new Laptop(250, "SE123");
        System.out.println("Invoking equals method");
        System.out.println("Comparing object 1 and 2:  "+l1.equals(l2));
        System.out.println("Comparing object 2 and 3:  "+l2.equals(l3));
        System.out.println("Comparing object 1 and 3:  "+l3.equals(l1));
        
        System.out.println("Invoking hashcode method");
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(l3.hashCode());
        
    }
    
}
