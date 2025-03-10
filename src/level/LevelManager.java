package level;

public class LevelManager {
    private int level = 1;

    public void nextLevel() {
        level++;
        System.out.println("The player has moved on to the level" + level);
    }
}
