package Player;

public class Knight extends Player {

    public Knight(int id, String name, int damage, int health, int money, String weapon) {
        super(id, name, damage, health, money, weapon);
    }

    public Knight(){
        super(2,"Knight",9,8,27,"Knight");
    }

}
