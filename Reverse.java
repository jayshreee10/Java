package programs;

//Reverse of a number
public class Reverse {
    public static void main(String args[]) {
        int num = 908;
        int temp = num;
        int ReversedNum = 0;
        while (temp > 0) {
            int i = temp % 10;

            temp = temp / 10;

            ReversedNum = ReversedNum * 10 + i;
        }

        System.out.println(ReversedNum);

    }
}
/*
 * 
 * ReversedNum = 0
 * it 1 : temp >0 : true
 * temp = 453
 * i = 3
 * temp = 45
 * ReversedNum = 3
 * 
 * it 2 : temp >0 : true
 * i = 5
 * temp = 4
 * ReversedNum = 30 + 5 = 35
 * 
 * it 3 : temp >0 : true
 * i = 4
 * temp = 0
 * ReversedNum = 35*10 + 4 = 354
 * 
 * 
 * temp2 = temp2 + i
 * "" = ""+"3"= "3"
 * "3"= "3"+"5"
 * "35"="35"+"4"
 * "354"
 * 
 * 3+5=35
 * 35+4=354
 */