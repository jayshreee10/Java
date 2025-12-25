package programs;

import java.util.Scanner;

public class Cube {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of cube");

        double number = sc.nextDouble();

        double volume = Math.pow(number, 3);

        System.out.println("volume of the cube is = " + volume);

        sc.close();

    }

}