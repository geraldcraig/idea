package exercise1;

import java.util.Scanner;

public class  ReadUserData {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int userInput;
        do {
            System.out.println("enter number");
            count++;
        } while (count < 10);
        userInput = sc.nextInt();
        count++;
        System.out.println(count);

        sc.close();

    }
}
