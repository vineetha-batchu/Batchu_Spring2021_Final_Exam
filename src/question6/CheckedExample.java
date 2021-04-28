/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Vineetha Batchu
 */
public class CheckedExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner sc= new Scanner(new File("input.txt"));
        String id = null,fname = null,lname = null;
        while(sc.hasNext()){
            id=sc.next();
            fname=sc.next();
            lname=sc.next();
            
            }
        System.out.println("Details of student are\n"+"Student id: "+id+"\nFirst Name: "
                +fname+"    Last Name: "+lname);
    }
    
}
