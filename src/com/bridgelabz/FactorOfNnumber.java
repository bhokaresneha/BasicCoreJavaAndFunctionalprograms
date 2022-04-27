/* Problem Statement=>
5. Factors
            a. Desc -> Computes the prime factorization of N using brute force.
            b. I/P -> Number to find the prime factors
            c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
            d. O/P -> Print the prime factors of number N.
* */
package com.bridgelabz;

import java.util.Scanner;

public class FactorOfNnumber {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to find its Factors::");
        num = scanner.nextInt();
        System.out.print("Factors :: ");

        for (int i=2 ;i<= num; i++){
           // System.out.println("i="+i);

            // if factor is a factor of n, repeatedly divide it out
            if (num % i== 0){
                System.out.print(" "+i);
                num=num / i;
              //  System.out.println("num="+num);
            }
        }
    }
}
