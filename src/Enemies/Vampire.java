package Enemies;

public class Vampire extends Enemy{

    public Vampire(String name, int damage, int health, String loot) {
        super(name, damage, health, loot);
    }
    public Vampire() {
        super("Vampire", 6, 16, "wood");
    }
}
