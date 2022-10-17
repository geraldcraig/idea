package ie.fit.day03;

public class exercise04 {

    public static void main(String[] args) {

        int amount = 10000;

        for (int i = 2; i < 9; i++) {
            System.out.println("Amount " + amount + " plus interest rate " + i + "% equals " + (amount + (amount * i / 100)));
        }

        System.out.println();

        for (int i = 8; i > 1; i--) {
            System.out.println("Amount " + amount + " plus interest rate " + i + "% equals " + (amount + (amount * i / 100)));
        }

        System.out.println();

        int[] primeNum = {1,3,5,7,9,};

        for (int i = 0; i < primeNum.length; i++) {
        }
    }
}
