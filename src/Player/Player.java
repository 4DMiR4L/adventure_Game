package Player;

public abstract  class Player {
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

    public void setId(int id) {
        this.id = id;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void selectCharacter(){

    }

    public void displayİnfo(){
        System.out.println("Id ="+ getId()+"Name ="+ getName()+"Damage ="+ getDamage()+"Health ="+ getHealth()+"Money ="+ getMoney());

    }



}
