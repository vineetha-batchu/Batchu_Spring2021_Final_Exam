/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1Example2Interface;

/**
 *
 * @author Vineetha Batchu
 */
public class SilkDress implements MaterialSilk,Dress{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SilkDress s=new SilkDress();
        s.materialtype();
        s.clothingtype();
    }
    
}
