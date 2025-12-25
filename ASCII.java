package programs;

import java.util.Scanner;

//Convert ASCII values to characters from A to Z
public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int value = sc.nextInt();
        char ch = (char) value;
        System.out.println(ch);
        sc.close();
    }
}
