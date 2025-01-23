package Enemies;

public class Zombie extends Enemy{

    public Zombie(String name, int damage, int health, String loot) {
        super(name, damage, health, loot);
    }
    public Zombie(){
        super("zombie", 3, 114, "stone");
    }
}
