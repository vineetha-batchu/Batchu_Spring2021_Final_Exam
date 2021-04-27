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
public class Square extends GeometricObject implements Colorable {

    private double sidelength;
    private boolean colorable;

    public Square(double sidelength, boolean colorable) {
        this.sidelength = sidelength;
        this.colorable = colorable;
    }

    public double getSidelength() {
        return sidelength;
    }

    public boolean isColorable() {
        return colorable;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double area() {
        return sidelength * sidelength;
    }

}
