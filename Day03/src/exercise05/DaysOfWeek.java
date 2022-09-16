package exercise05;

import java.sql.PreparedStatement;

public class DaysOfWeek {

    public static void main(String[] args) {
        printDayOfTheWeek(9);
        int day = 0;
        String result = "";
        if(day == 0) {
            result = "Sunday";
        } else if (day == 1) {
            result = "Monday";
        } else {
            result = "Tuesday";
        }
        System.out.println(result);
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
                System.out.println("day not found");
        }
    }
}
