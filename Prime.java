package programs;

//Prime number
import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println(" Enter Number");

        int num = sc.nextInt();
        boolean result = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        if (result == true) {
            System.out.println(num + " Prime Number");
        } else
            System.out.println(num + " not a prime Number");

        sc.close();

    }
}
