package exercise01;

public class BarkingDog {

    BarkingDog dog = new BarkingDog();
    boolean dog1 = dog.shouldWakeUp(true, 1);
    boolean dog2 = dog.shouldWakeUp(false, 2);
    boolean dog3 = dog.shouldWakeUp(true, 8);
    boolean dog4 = dog.shouldWakeUp(true, -1);



    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking == true && (hourOfDay <= 8 || hourOfDay > 22)) {
            return true;
        }
            return false;
    }
}
