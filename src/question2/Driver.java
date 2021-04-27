/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

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
        GeometricObject[] squares = {new Square(8, true), new Square(20, false),
            new Square(25, true), new Square(30, true), new Square(55, false)};
        for (GeometricObject o : squares) {
            System.out.println("-----------------------------");
            System.out.println("Area is " + o.area());
            Square s = (Square) o;
            if (s.isColorable()) {
                s.howToColor();
            }
            System.out.println("-----------------------------");
            
        }
    }

}
