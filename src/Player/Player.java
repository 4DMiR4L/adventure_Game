package Player;

import java.util.Scanner;

public abstract class Player {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int money;
    private String weapon;

    public Player(int id, String name, int damage, int health, int money, String weapon) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.weapon = weapon;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public String getWeapon() {
        return weapon;
    }

    public static Player selectCharacter() {
        Scanner scanner = new Scanner(System.in);
        Player[] characters = {
                new Samurai(),
                new Knight(),
                new Archer()
        };
        System.out.println("Available Characters:");
        for (Player character : characters) {
            character.displayİnfo();
        }

        System.out.print("Choose your character by ID (1-3): ");
        int choice = scanner.nextInt();
        if (choice < 1 || choice > characters.length) {
            System.out.println("Invalid choice! Please try again.");
            return selectCharacter();
        }
        Player selectedCharacter = characters[choice - 1];
        System.out.println("You have chosen: " + selectedCharacter.getName());
        return selectedCharacter;
    }

    public void displayİnfo() {
        System.out.printf("ID: %d | Name: %s | Damage: %d | Health: %d | Money: %d | Weapon: %s%n",
                id, name, damage, health, money, weapon);
    }

    @Override
    public String toString() {
        return String.format("Player{id=%d, name='%s', damage=%d, health=%d, money=%d, weapon='%s'}",
                id, name, damage, health, money, weapon);
    }
}
