package Player;

public class Archer extends Player {
    public Archer(int id, String name, int damage, int health, int money, String weapon) {
        super(id, name, damage, health, money, weapon);
    }

    public Archer(){
        super(3, "Archer", 7, 6, 30, "Arrow");
    }

}
