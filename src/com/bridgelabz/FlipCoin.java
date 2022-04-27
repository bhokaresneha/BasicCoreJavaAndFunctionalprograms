/*Problem Statement=>
            * 1. Flip Coin and print percentage of Heads and Tails-
            a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
            b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
            heads
            c. O/P -> Percentage of Head vs Tails
* */
package com.bridgelabz;
import java.util.Scanner;

public class FlipCoin {
   static int  flips;
    public static void main(String[] args) {
        int head=0,tails=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of times you want to flip the coins");
        flips = scanner.nextInt();

        for (int i = 0; i < flips; i++) {
            double random = Math.random();
  //         System.out.println("Head"+random);
            if(random < 0.5)
            {
                tails++;
//              System.out.println("tails"+random);
            }
            else
            {
                head++;
                System.out.println("h"+random);

            }
        }

       System.out.println("Count of Head =>"+head+"\nCount of Tails=>"+tails);
       double cnttails=tails / (double) flips* 100 ;
       double cnthead= head/ (double) flips* 100 ;
       System.out.println("Percentage of Head =>"+cnthead+"\nPercentage of  Tails=>"+cnttails);
    }
}