package programs;

//Greatest of three numbers
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        double num1 = sc.nextDouble();
        System.out.println("Enter the num2");
        double num2 = sc.nextDouble();
        System.out.println("Enter the num3");
        double num3 = sc.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Greatest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Greatest number is " + num2);

        } else
            System.out.println("Greatest number is " + num3);

        sc.close();
    }
}
