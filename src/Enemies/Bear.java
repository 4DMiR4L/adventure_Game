package Enemies;

public class Bear extends Enemy{

    public Bear(String name, int damage, int health, String loot) {
        super(name, damage, health, loot);
    }
    public Bear(){
        super("Bear",8,17,"water");
    }
}
