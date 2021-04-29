/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Vineetha Batchu
 */
public class MultiCatchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            double a[] = new double[10];
            a[12] = 67.8 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception has occured");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception has occured");
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
        System.out.println("end of the code");
    }

}
