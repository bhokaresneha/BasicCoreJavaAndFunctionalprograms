/* Problem Statement=>
7. Java Program to Swap Two Numbers

* */
package com.bridgelabz;
import java.util.Scanner;

public class Swap2No {

    public static void swapTwoNo(int num1,int num2){
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Numbers After Swap  Num1=>"+num1+"\t Num2=>"+num2);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First No");
        int num1 =scanner.nextInt();
        System.out.println("Enter Second No ");
        int num2=scanner.nextInt();
        System.out.println("Numbers Before Swap  Num1=>"+num1+"\tNum2=>"+num2);
          }
}
