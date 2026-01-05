

//Factorial of a number
// Input: n = 5
// Output: 120
// Explanation: 5! = 5 * 4 * 3 * 2 * 1 = 120
public class Factorial {
    public static void main(String args[]) {
        int input = 5;
        int value = 1;

        for (int i = 1; i <= input; i++) {
            value = value * i;
        }

        System.out.println(value);
    }
}
