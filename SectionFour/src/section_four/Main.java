package section_four;

public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Dave", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Buster", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bert", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Simon", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore > 100) {
//            return 3;
//        }
//        return 4;
//

        // either works
        // the below code is more concise and easier to read
        int position = 4;

        if(playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}

