package programs;

/*
An Armstrong number (or narcissistic number) is a number that equals the sum of its own digits, each raised 
to the power of the total number of digits in the number, 
like 153 (\(1^{3}+5^{3}+3^{3}=153\)) or 9474 (\(9^{4}+4^{4}+7^{4}+4^{4}=9474\)
*/
public class Armstrong {
    public static void main(String args[]) {
        int num = 9474;
        int temp = num;
        int temp2 = num;
        double sum = 0;
        int count = 0;

        // count
        while (temp > 0) {
            temp = temp / 10;
            count = count + 1;

        }
        // System.out.println(count);

        while (temp2 > 0) {
            int i = temp2 % 10; // 3 , 5 , 1
            temp2 = temp2 / 10; // 15 , 1 , 0
            sum = sum + Math.pow(i, count); // 0+ (3*3*3) , (27 + 5^3 ) = 152 , 152+1 = 153

        }
        System.out.println(sum);

    }
}
