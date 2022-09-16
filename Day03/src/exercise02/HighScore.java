package exercise02;

public class HighScore {

    public static void main(String[] args) {

        displayHighScore("Josh", calculateHighScorePosition(1500));
        displayHighScore("Brijesh", calculateHighScorePosition(900));
        displayHighScore("Joel", calculateHighScorePosition(400));
        displayHighScore("Gerald", calculateHighScorePosition(50));
    }

    public static void displayHighScore(String playerName, int playerPosition) {
        System.out.println("Player " + playerName + " managed to get position " + playerPosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return  4;
        }
    }

}
