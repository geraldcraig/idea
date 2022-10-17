package ie.fit.day04;

public class exercise01 {

    exercise01 dog = new exercise01();
    boolean dog1 = dog.shouldWakeUp(true, 1);
    boolean dog2 = dog.shouldWakeUp(false, 2);
    boolean dog3 = dog.shouldWakeUp(true, 8);
    boolean dog4 = dog.shouldWakeUp(true, -1);

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }
}
