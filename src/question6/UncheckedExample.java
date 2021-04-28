/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Vineetha Batchu
 */
public class UncheckedExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String ar[] = {"vinee","Lohith" ,"vyshu", "chandhu"};
        try {
            
        
        for (int i = 0; i <= ar.length; i++) {
            System.out.println(ar[i]);
        }
        }
        catch (ArithmeticException e) {
            System.out.println(e+" Message: "+e.getMessage());
        }
        finally{
        System.out.println("End of the list");
        }
    }

}
