package ie.fit.day03;

import java.util.Scanner;

public class exercise05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter day as a number: ");
        int day;
        day = sc.nextInt();
        printDayOfTheWeek(day);

        String result;
        if (day == 0) {
            result = "Sunday";
        } else if (day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result = "Tuesday";
        } else if (day == 3) {
            result = "Wednesday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        } else {
            result = "invalid day";
        }
        System.out.println(result);

        sc.close();
    }
        public static void printDayOfTheWeek(int day) {
            switch (day) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("invalid day");
            }
        }
    }

