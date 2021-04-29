/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Vineetha Batchu
 */
public class ThrowsMultiExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("input.txt"));
        String id = null,fname = null,lname = null;
        
        System.out.println("Contents of File");
        while (sc.hasNext()) {
            id = sc.next();
            fname = sc.next();
            lname = sc.next();

        }
        System.out.println("Details of student are\n" + "Student id: " + id + "\nFirst Name: "
                + fname + "    Last Name: " + lname);
        Class.forName("Example");

    }

}
