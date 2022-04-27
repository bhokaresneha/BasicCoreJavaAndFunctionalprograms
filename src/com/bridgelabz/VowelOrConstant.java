/* Problem Statement =>
9. Java Program to Check Whether an Alphabet is Vowel or Consonant
* */
package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConstant {
    static char ch;
    public static void main(String[] args){
        System.out.println("Checking the Entered Alphabet is Vowel or Consonant");
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
            System.out.println("Vowel");
        }
        else
            System.out.println("Consonant");
    }
}

