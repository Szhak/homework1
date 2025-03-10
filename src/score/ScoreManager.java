package score;

public class ScoreManager {
    private int score;

    public ScoreManager() {
        this.score = 0;
    }

    public void addScore(int points) {
        this.score += points;
        System.out.println("Player's score: " + score);
    }

    public int getScore() {
        return score;
    }
}
