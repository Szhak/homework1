package player;

import items.IItem;
import combat.IEnemy;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private int health;
    private final int attackPower;
    private final List<IItem> inventory;

    public Player() {
        this.health = 100;
        this.attackPower = 15;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println("The player received: " + damage + " damage. Current health: " + health);
        if (this.health <= 0) {
            System.out.println("The player lost!");
        }
    }

    public void attack(IEnemy enemy) {
        System.out.println("The player attacks the enemy!");
        enemy.takeDamage(attackPower);
    }

    public void pickUpItem(IItem item) {
        inventory.add(item);
        System.out.println("The player picked up the item: " + item.getClass().getSimpleName());
    }

    public void useItem(IItem item) {
        if (inventory.contains(item)) {
            item.use(this);
            inventory.remove(item);
            System.out.println("The player used an item: " + item.getClass().getSimpleName());
        } else {
            System.out.println("this item is missing from the inventory.");
        }
    }
}
