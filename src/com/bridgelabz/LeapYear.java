/* Problem Statement=>
        * 2. Leap Year
        a. I/P -> Year, ensure it is a 4 digit number.
        b. Logic -> Determine if it is a Leap Year.
        c. O/P -> Print the year is a Leap Year or not.
 */
package com.bridgelabz;
import java.util.Scanner;

public class LeapYear {

        public static void main (String[]args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a leap year:");
            int year = scanner.nextInt();

            if (year > 1000) {
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    System.out.println("Year:" + year + " is a leap year");
                }
                else {
                    System.out.println("Year:" + year + " is not a leap year");
                }
            }else{
            System.out.println("Enter valid input");
        }}

    }




