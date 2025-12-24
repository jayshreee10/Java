package programs;

import java.util.*;

// 123
public class SumofDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        int tempVariable = number;
        int sum = 0;
        while (tempVariable > 0) {
            int i = tempVariable % 10; // 3 , 2 , 1
            System.out.println(i);
            tempVariable = tempVariable / 10; // 12 , 1 , 0
            sum = sum + i;
        }
        System.out.println(sum);

        sc.close();

    }
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter Number");
    // int number = sc.nextInt();
    // String str = String.valueOf(number);
    // int i;
    // int length = str.length();
    // int sum = 0;

    // for (i = 0; i < length; i++) {
    // char ch = str.charAt(i);
    // System.out.println(ch);
    // sum = sum + Integer.valueOf(ch - '0');
    // }
    // System.out.println(sum);

    // sc.close();

    // }
}
