package programs;

// Fibonacci numbers are a sequence starting with 0 and 1, 
// where each subsequent number is the sum of the two preceding ones 
// (e.g., 0, 1, 1, 2, 3, 5, 8...)
public class Fibonacci {
    public static void main(String args[]) {
        int limit = 10;
        int sum = 0;
        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 0; i < 10; i++) {
            System.out.print(n1 + ",");

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
