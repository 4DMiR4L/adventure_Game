package Player;

public class Samurai extends Player {

    public Samurai(int id, String name, int damage, int health, int money, String weapon) {
        super(id, name, damage, health, money, weapon);
    }

    public Samurai() {
        super(1, "Samurai", 10, 7, 25, "Katana");
    }
}
