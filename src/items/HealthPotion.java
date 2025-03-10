package items;

import player.Player;

public class HealthPotion implements IItem {
    @Override
    public void use(Player player) {
        System.out.println("The player used a health potion! Health is increased.");
    }
}
