package ie.fit.day02;

public class exercise01 {

    public static void main(String[] args) {

        double num1 = 20.00;
        double num2 = 80.00;
        double result = (num1 + num2) * 100;
        double remainder = result % 40;
        boolean booleanValue = (remainder == 0) ? true: false;

        if (booleanValue) {
            System.out.println("No remainder");
        } else {
            System.out.println("Got some remainder");
        }
    }
}
