import combat.CombatManager;
import combat.IEnemy;
import enemies.Zombie;
import items.HealthPotion;
import level.LevelManager;
import player.Player;
import score.ScoreManager;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        CombatManager combatManager = new CombatManager();
        LevelManager levelManager = new LevelManager();
        ScoreManager scoreManager = new ScoreManager();

        HealthPotion potion = new HealthPotion();
        player.pickUpItem(potion);
        player.useItem(potion);

        IEnemy zombie = new Zombie();
        System.out.println("The player has met a zombie!");
        combatManager.engage(player, zombie);

        if (zombie.getHealth() <= 0) {
            scoreManager.addScore(100);
            levelManager.nextLevel();
        }

        System.out.println("Final score: " + scoreManager.getScore());
    }
}
