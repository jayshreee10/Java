package programs;

//Palindrome number
public class Palindrome {
    public static void main(String args[]) {
        int num = 123;
        int temp = num;
        int reverseNumber = 0;

        while (temp > 0) {
            int i = temp % 10;
            temp = temp / 10;
            reverseNumber = reverseNumber * 10 + i;
        }

        if (num == reverseNumber) {
            System.out.println("This is a Palindrome number");

        } else
            System.out.println("This is not a Palindrome number");

    }
}
