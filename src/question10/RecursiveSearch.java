/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vineetha Batchu
 */
public class RecursiveSearch {

    static int recursivesearch(ArrayList<Integer> arrayList, int leftIndex, int rightIndex, int searchElement) {

        // if rightIndex<l,it means that element is not present in
        // the arrayList
        if (rightIndex < leftIndex) {
            return -1;
        }

        if (arrayList.get(leftIndex) == searchElement) {
            return leftIndex;
        }

        if (arrayList.get(rightIndex) == searchElement) {
            return rightIndex;
        }

        // Since element has not found on both left most and
        // rightmost boundary,ie at leftIndex and rightIndex, now recurse the
        // arrayList to find position of searchElement.
        return recursivesearch(arrayList, leftIndex + 1, rightIndex - 1, searchElement);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = 0, se = 0;
        System.out.print("Enter the number of elements in an array: ");
        n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Enter the arrayList elements: ");
        for (int i = 0; i < n; i++) {

            arrayList.add(sc.nextInt());
        }
        System.out.print("Enter the element tobe searched: ");
        se = sc.nextInt();
        int index = recursivesearch(arrayList, 0, arrayList.size() - 1, se);
        if (index == -1) {
            System.out.println("Element not found in the list");
        } else {
            System.out.println("Element found a Index " + (index + 1) + " in the given list"
                    + "");
        }

    }

}
