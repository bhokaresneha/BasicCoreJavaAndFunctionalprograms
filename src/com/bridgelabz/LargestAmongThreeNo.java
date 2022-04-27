/* Problem Statement=>
                    10. Java Program to Find the Largest Among Three Numbers
* */
package com.bridgelabz;

import java.util.Scanner;

public class LargestAmongThreeNo {
    static int large;

    public static void main(String[] args){
        System.out.println("Searching for the largest Number among the given numbers:");
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Largest Number Among:");
        num = scanner.nextInt();
        System.out.println("Enter the Numbers");
        for (int i= 1 ;i<= num ;i++){
            int temp = scanner.nextInt();
           // System.out.println(large);
            if (temp > large)
                large=temp;
        }
        System.out.println("largest Number is ::"+large);
    }
}
