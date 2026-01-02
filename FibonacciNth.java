package programs;

public class FibonacciNth {
    public static void main(String args[]) {
        int N = 7;
        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 0; i < N - 1; i++) {

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

        }

        System.out.print(n1 + " is the Nth term");

    }
}
/*
 * 
 * (e.g., 0, 1, 1, 2, 3, 5, 8...)
 * n = 1 , 2 , 3 , 4 .........
 * op = 0 , 1 , 1 , 2 ........
 */