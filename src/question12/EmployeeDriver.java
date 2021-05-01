/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Vineetha Batchu
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    private static void printlist(List<Employee> employees) {
        for (Employee s : employees) {
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(35, "Vineetha", 6000));
        employees.add(new Employee(20, "Amarnath", 5870));
        employees.add(new Employee(74, "Lohith", 8750));
        employees.add(new Employee(10, "Padma", 4500));
        employees.add(new Employee(90, "Chandhu", 5500));
        System.out.println("------------------------------------------------------------------");
        System.out.println("Original List");
        System.out.println("------------------------------------------------------------------");

        printlist(employees);
        Collections.sort(employees);
        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("After invoking one-parameter sort method of the Collections class (sorts by empId)");
        System.out.println("----------------------------------------------------------------------------------");
        printlist(employees);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("After invoking two-parameter sort method of the Collections class(sorts by salary)");
        System.out.println("----------------------------------------------------------------------------------");
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.getEmpSalary(), e2.getEmpSalary());

            } // end compareTo

        }
        );
        printlist(employees);
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getEmpName().compareTo(e2.getEmpName());

            } // end compareTo

        }
        );
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("After invoking two-parameter sort method of the Collections class (sorts by name)");
        System.out.println("---------------------------------------------------------------------------------");
        printlist(employees);
        
    }

}
