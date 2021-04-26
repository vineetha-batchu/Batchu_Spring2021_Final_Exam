/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Vineetha Batchu
 */
public class TesterDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***********************************");
        Tester t1=new AdministrativeTester("Lohith", "Gurram");
        System.out.println(t1);
        t1.testingType();
        System.out.println("Salary: "+t1.calculatesalary());
        System.out.println("***********************************");
        
        Tester t2=new TechnicalTester("Vineetha", "Batchu");
        System.out.println(t2);
        t2.testingType();
        System.out.println("Salary: "+t2.calculatesalary());
        System.out.println("***********************************");
        
        
    }
    
}
