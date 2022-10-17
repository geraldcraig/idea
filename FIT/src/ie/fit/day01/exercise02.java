package ie.fit.day01;

import java.util.Scanner;

public class exercise02 {
    public static void numKilograms(int pounds) {
        double kilograms = 0.453594237;
        System.out.println(pounds * kilograms);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of pounds: ");
        int input = sc.nextInt();

        numKilograms(input);

        sc.close();
    }
}
