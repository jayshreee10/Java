package programs;

import java.util.Scanner;

// - Find the sum of odd numbers between 1 and n
// - Find the total number of odd numbers between 1 and n

public class oddSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n;
        int count = 0;
        System.out.println("Enter number");
        n = sc.nextInt();
        int finalValue = 0;
        // String finalValue = "";
        for (i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                finalValue = finalValue + i;
                System.out.print(i + "+");
                count++;
            }

        }
        System.out.println("=" + finalValue);
        System.out.println("Total Odd numbers" + count);

        sc.close();
    }
}
