package programs;

import java.util.Scanner;

//Prime number within a given range
public class RangePrimeNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println(" Enter Number1");

        int num1 = sc.nextInt();
        System.out.println(" Enter Number2");

        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {

            boolean result = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    result = false;
                    break;
                }
            }
            if (result == true) {
                System.out.println(i + " Prime Number");
            } else
                System.out.println(i + " not a prime Number");

        }

        sc.close();

    }
}
