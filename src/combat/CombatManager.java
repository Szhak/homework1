package combat;

import player.Player;

public class CombatManager {
    public void engage(Player player, IEnemy enemy) {
        System.out.println("The battle with the enemy has begun!");
        while (enemy.getHealth() > 0 && player != null) {
            player.attack(enemy);
            if (enemy.getHealth() > 0) {
                enemy.attack(player);
            }
        }
        System.out.println("The battle is over!");
    }
}
