package Enemies;

public abstract class Enemy {
    private String name;
    private int damage;
    private int health;
    private String loot;

    public Enemy(String name, int damage, int health, String loot) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.loot = loot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getLoot() {
        return loot;
    }

    public void setLoot(String loot) {
        this.loot = loot;
    }

}
