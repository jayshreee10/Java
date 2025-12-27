/*
Note: A year is a leap year if "any one of " the following conditions are satisfied: 

The year is multiple of 400.
The year is a multiple of 4 and not a multiple of 100.
 */
package programs;

import java.util.Scanner;

public class Leap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");

        } else
            System.out.println(year + " is not a Leap Year");

        sc.close();
    }
}
