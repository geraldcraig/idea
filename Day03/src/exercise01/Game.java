package exercise01;

public class Game {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        calculateScorePrint(true, 800, 5, 100);
        System.out.println(calculateScore(false, 800, 5, 100));
    }

    public static void calculateScorePrint(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }
}
