package programs;

// Display odd numbers between 1 and 100
public class OddNumbers {
    public static void main(String args[]) {
        int i;
        // String finalValue = "";
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                // finalValue = finalValue + "," + i;

                System.out.print(i + (i == 99 ? "" : ","));

            }

        }

    }
}
