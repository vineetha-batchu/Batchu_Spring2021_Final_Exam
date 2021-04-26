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
public class TechnicalTester extends Tester{

    @Override
    public void testingType() {
        System.out.println("Testing Type: Technical Testing");
        }
     public TechnicalTester(String fname,String lname) {
        super(fname,lname);
    }

    @Override
    public double calculatesalary() {
        return ItIndustry.hours*40.0;
        }
    
}
