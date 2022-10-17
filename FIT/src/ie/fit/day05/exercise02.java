package ie.fit.day05;

public class exercise02 {

    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }

    public static void shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && ((hourOfDay > 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 23))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
