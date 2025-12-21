// Java Question: Internet Data Usage Billing System 📶

// Problem Statement:

// Write a Java program to calculate the monthly internet bill for a user based on data usage, speed plan, overuse penalty, and loyalty discount.

// ⸻`

// Billing Rules:

// 1️⃣ Base Plan (Choose by user)

// Plan Type    Base Data    Base Cost
// Basic    50 GB    ₹499
// Standard    100 GB    ₹799
// Premium    200 GB    ₹1299

// 2️⃣ Extra Data Charges
//     •    For usage beyond base data:
//     •    Up to 20 GB extra → ₹ 10/GB
//     •    Above 20 GB extra → ₹ 20/GB

// 3️⃣ Speed Surcharge 🚀
//     •    If user selects High-Speed Add-on → add ₹150

// 4️⃣ Loyalty Discount 🎁
//     •    If user is a customer for more than 24 months → 12% discount on base cost only

// 5️⃣ Late Payment Fee
//     •    If payment is delayed → add 5% of total bill

// ⸻

// Input Requirements:
//     1.    Customer ID
//     2.    Customer Name
//     3.    Plan Type (Basic / Standard / Premium)
//     4.    Total Data Used (GB)
//     5.    Customer Duration (months)
//     6.    High-Speed Add-on (Y / N)
//     7.    Payment Delayed (Y / N)

// ⸻

// Output:

// Display:
//     •    Customer details
//     •    Base plan cost
//     •    Extra data charges
//     •    Add-on charges
//     •    Discount applied
//     •    Late payment fee (if any)
//     •    Final payable amount

// ⸻

// Sample Input:

// Customer ID: 501
// Customer Name: Rohan
// Plan Type: Standard 
// Data Used: 135
// Customer Duration: 30
// High-Speed Add-on: Y
// Payment Delayed: N

// 799 + 200 + 300
// Sample Output:

// Base Cost: ₹799.00
// Extra Data Charges: ₹500.00
// High-Speed Add-on: ₹150.00
// Loyalty Discount: -₹95.88
// Final Bill Amount: ₹1203.12

// ⸻

package programs;

import java.util.Scanner;

public class InternetData {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int cutomerId = sc.nextInt();
        // String userName = sc.nextLine();
        System.out.println("Enter Plan Type");

        String planType = sc.nextLine();
        System.out.println("Enter Data Used");

        double dataUsed = sc.nextDouble();
        System.out.println("Enter Customer Duration");
        double customerDuration = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter add on taken ?");
        String addOn = sc.nextLine();

        System.out.println("Enter if payment delayed ?");

        String paymentDelayed = sc.nextLine();

        int dataLimit = 0;
        int basicDataLimit = 50;
        int basicDataCost = 499;

        int standardDataLimit = 100;
        int standardDataCost = 799;

        int premiumDataLimit = 200;
        int premiumDataCost = 1299;

        double baseCost = 0;
        double extraDataCharge = 0;
        double addOnCost = 0;
        double discountAmount = 0;
        double sum = 0;
        double total = 0;
        double penaltyCost = 0;

        if (planType.equals("Basic")) {
            // base cost
            baseCost = basicDataCost;
            dataLimit = basicDataLimit;
            // extra data carge cost

        }

        else if (planType.equals("Standard")) {
            baseCost = standardDataCost;
            dataLimit = standardDataLimit;
        }

        else if (planType.equals("Premium")) {
            baseCost = premiumDataCost;
            dataLimit = premiumDataLimit;
        }

        if (dataUsed > dataLimit) {
            double extraData = dataUsed - dataLimit;

            if (extraData <= 20) {
                extraDataCharge = extraData * 10;
            } else if (extraData > 20) {
                extraDataCharge = 200 + ((extraData - 20) * 20);

            }

        }

        if (addOn.equalsIgnoreCase("true")) {
            addOnCost = 150;
        }

        if (customerDuration > 24) {
            discountAmount = (baseCost * 12) / 100;
        }

        sum = (baseCost - discountAmount) + extraDataCharge + addOnCost;

        if (paymentDelayed.equalsIgnoreCase("true")) {
            penaltyCost = (sum * 5) / 100;

        }

        total = sum + penaltyCost;
        // Base Cost: ₹799.00
        // Extra Data Charges: ₹500.00
        // High-Speed Add-on: ₹150.00
        // Loyalty Discount: -₹95.88
        // Final Bill Amount: ₹1203.12
        System.out.println("Base Cost" + baseCost);
        System.out.println("Extra Data Charges" + extraDataCharge);
        System.out.println("High-Speed Add-on" + addOn);
        System.out.println("Loyalty Discount" + discountAmount);
        System.out.println("Final Bill Amount" + total);

        sc.close();
    }

}
