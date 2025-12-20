// Java Question: Electricity Bill Calculation ⚡

// Problem Statement:

// Write a Java program to calculate the electricity bill for a customer based on the number of units consumed.

// Billing Rules:
//     •    First 100 units → ₹ 1.5 per unit
//     •    Next 100 units (101–200) → ₹ 2.5 per unit
//     •    Above 200 units → ₹ 4.0 per unit
//     •    Fixed meter charge → ₹ 50

// Requirements:
//     1.    Take customer name and units consumed as input using Scanner.
//     2.    Calculate the total electricity bill based on the slab system.
//     3.    Display:
//     •    Customer name
//     •    Units consumed
//     •    Total bill amount

// Sample Input:

// Enter customer name: Rahul
// Enter units consumed: 250

// Sample Output:

// Customer Name: Rahul
// Units Consumed: 250
// Total Electricity Bill: ₹650.0

//100*1.5 =150
//100*2.5=250
//50*4=200
// total = 150+250+200+50 =650

// Constraints:
//     •    Units consumed ≥ 0
//     •    Use if-else conditions
//     •    Use proper formatting for output
package programs;

import java.util.Scanner;

public class ElectricBill {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double firstHundredUnit = 150;
        double secondHundredUnit = 250;
        double fixedCharge = 50;
        double total = 0;
        System.out.println("Enter Unit");
        double unit = sc.nextDouble();
        double sum = 0;
        if (unit <= 100) {
            sum = (unit * 1.5);

        } else if (unit > 100 && unit <= 200) {
            sum = firstHundredUnit + ((unit - 100) * 2.5);

        } else {
            sum = firstHundredUnit + secondHundredUnit + ((unit - 200) * 4);

        }
        total = sum + fixedCharge;
        System.out.println("Units Consumed:" + unit);
        System.out.println("Total Electricity Bill: " + total);
        sc.close();
    }
}

/**
 * 270
 * 
 * unit = unit <= 100 => unit * 1.5
 * unit > 100 & unit < 200 => (100)1.5 + (unit-100)2.5
 * unit > 200 => (100)1.5 + (100)2.5 + (unit-200)*4
 * total cost = sum + 50
 */
