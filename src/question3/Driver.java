/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

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
        MobilePhone m=new MobilePhone("Samsung");
        System.out.println(m);
        SmartPhone s=new SmartPhone(true, "Iphone");
        System.out.println(s);
        m=s;
        SmartPhone s1=(SmartPhone)m;
        System.out.println("Type Casting");
        System.out.println(s1);

    }

}
