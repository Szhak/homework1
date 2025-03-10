package enemies;

import combat.IEnemy;
import player.Player;

public class Zombie implements IEnemy {
    private int health = 50;

    @Override
    public void attack(Player player) {
        player.takeDamage(10);
        System.out.println("Zombies attack the player!");
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println("Zombie's get " + damage + " damage. Current health: " + health);
    }
}
