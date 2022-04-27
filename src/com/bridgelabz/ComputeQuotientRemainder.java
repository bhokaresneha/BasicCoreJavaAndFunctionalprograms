/* Problem Statement =>
6. Java Program to Compute Quotient and Remainder
* */
package com.bridgelabz;
import java.util.Scanner;

public class ComputeQuotientRemainder
{
    static int divisor;
    static int divident;
    static int quotient, remainder;

    public static void division(int divident,int divisor) {

        quotient = divident / divisor;
        remainder = divident % divisor;
        System.out.println("Quotient when " + divident + "/" + divisor + " is: " + quotient);
        System.out.println("Remainder when " + divident + " %" + divisor + " is: " + remainder);
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of num1 and num2");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Divident");
         divident = sc.nextInt();
        System.out.println("enter Divisor");
         divisor = sc.nextInt();
         division(divident,divisor);


    }
}
