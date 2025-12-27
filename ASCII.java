package programs;

import java.util.Scanner;

//Convert ASCII values to characters from A to Z
public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int value = sc.nextInt();
        if (value >= 65 && value <= 122) {
            char ch = (char) value;
            System.out.println(ch);
        } else
            System.out.println("Value must in between 65 to 122");

        sc.close();
    }
}
