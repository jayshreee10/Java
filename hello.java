package programs;

import java.util.*;

public class hello {

    public static void main(String args[]) {
        System.out.println("Hello World");
        UserInput userInput = new UserInput();
        userInput.takeInput();
    }

    public static class UserInput {

        public void takeInput() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name");
            String name = sc.nextLine();
            System.out.println("User name is " + name);

            sc.close();
        }
    }

}
