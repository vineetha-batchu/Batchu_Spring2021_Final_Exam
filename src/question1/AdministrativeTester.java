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
public class AdministrativeTester extends Tester{

    @Override
    public void testingType() {
        System.out.println("Testing Type: Administrative Testing");
        }

    public AdministrativeTester(String fname,String lname) {
        super(fname,lname);
    }

    @Override
    public double calculatesalary() {
        return ItIndustry.hours*30.0;
        }
    
}
