/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Vineetha Batchu
 */
public class ComparableCircle extends Circle implements Comparable<Circle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Circle c1) {
        return Double.compare(this.getArea(), c1.getArea());

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
