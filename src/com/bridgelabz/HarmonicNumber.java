/* Problem Statement=>
4. Harmonic Number
                    a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
                    b. I/P -> The Harmonic Value N. Ensure N != 0
                    c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
                    d. O/P -> Print the Nth Harmonic Value.
* */
package com.bridgelabz;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int num;
        double harmonicNumbe = 1.0;
        System.out.println("Enter the Number to print its Harmonic Number:");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        for (int i = 1; i <=num; i++) {
            harmonicNumbe = (double) (harmonicNumbe + (double) 1 / (i + 1));
            System.out.println("  Harmonic value of "+i+" is "+harmonicNumbe);
        }
        System.out.println("Harmonic Value of " + num + " is " + harmonicNumbe);
    }
}