package programs;

import java.util.Scanner;

// Display odd numbers between 1 and n
public class OddNumbers1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i;
        System.out.println("Enter a number");

        int n = sc.nextInt();
        int lastOddNumber = n;
        if (n % 2 == 0) {
            lastOddNumber = (n - 1);
        }
        // String finalValue = "";
        for (i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                // finalValue = finalValue + "," + i;

                System.out.print(i + (i == lastOddNumber ? "" : ","));

            }

        }
        sc.close();
    }
}
