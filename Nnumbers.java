package programs;

import java.util.Scanner;

public class Nnumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double number = sc.nextDouble();
        double i;
        double sum = 0;
        for (i = 0; i <= number; i++) {
            sum = sum + i;
            System.out.print(i + "+");
        }
        System.out.println("=" + sum);

        sc.close();
    }
}