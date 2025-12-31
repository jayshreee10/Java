package programs;

//Armstrong number in a given range
public class ArmstrongRange {

    public static void main(String args[]) {

        int num1 = 1630;
        int num2 = 1635;
        int num = 0;

        for (int i = num1; i <= num2; i++) {
            num = i;
            int temp1 = num;
            int temp2 = num;
            double sum = 0;
            int count = 0;

            // System.out.println((num));
            while (temp1 > 0) {
                temp1 = temp1 / 10;
                count = count + 1;
            }
            // System.out.println(count);

            while (temp2 > 0) {
                int digit = temp2 % 10;
                temp2 = temp2 / 10;
                sum = sum + Math.pow(digit, count);
            }

            if (num == sum) {
                System.out.println(num + " is a Armstrong number and the sum is = " + sum);

            } else
                System.out.println(num + " is not a Armstrong number and the sum is = " + sum);

        }

    }
}
