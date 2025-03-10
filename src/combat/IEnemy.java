package combat;

import player.Player;

public interface IEnemy {
    void attack(Player player);
    int getHealth();
    void takeDamage(int damage);
}
