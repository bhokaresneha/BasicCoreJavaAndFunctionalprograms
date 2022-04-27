/* Problem Statement=>
8. Java Program to Check Whether a Number is Even or Odd
* */
package com.bridgelabz;

import java.util.Scanner;

public class EvenOrOddNumber {
    static int  Number;

    public static void checkOddorEven(int num){
        if(Number % 2== 0){
            System.out.println("The Entered Number is Even Number");
        }
        else
            System.out.println("The Entered Number is Odd Number");
    }

    public static void main(String[] args){
        System.out.println("Enter the Number to check Even or Odd");
        Scanner scanner = new Scanner(System.in);
        Number = scanner.nextInt();
        checkOddorEven(Number);
    }

}
