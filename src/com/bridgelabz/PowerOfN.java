/*3. Power of 2
        a. Desc -> This program takes a command-line argument N and prints a table of the
        powers of 2 that are less than or equal to 2^N.
        b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
        c. Logic -> repeat until i equals N.
        d. O/P -> Print the year is a Leap Year or not.
*/
package com.bridgelabz;

import java.util.Scanner;

public class PowerOfN
{
    public static void main(String[] args)
    {
        int num;
        int power = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Power of Two :");
        num = sc.nextInt();
        int i = 1;
        while (i <= num)
        {
            if (0 <= num && num< 31)
                power = 2 * power;
            System.out.println("2^"+i+"="+power);
            i++;
        }
    }
}
