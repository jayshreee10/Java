public class FactorialSeries {
    public static void main(String args[]) {
        int input = 15;
        int value = 1;
        int term = 2;

        for (int i = input; i >= value; i--) {
            term--;
            if (term == 0) {
                System.out.println(i);
                break;
            }
            // value = value * i;
        }

        // System.out.println(value);
    }
}

// 15 , 14 , 13 , 12 , 11 , 10
// 1 , 2 , 3 , 4 , 5 , 6