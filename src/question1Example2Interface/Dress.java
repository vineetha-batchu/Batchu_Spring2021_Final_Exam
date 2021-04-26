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
public interface Dress {
    default void clothingtype(){
        System.out.println("Clothing Type: Dress");
    }
}
