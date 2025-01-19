import Player.Player;

public class Main {
    public static void main(String[] args) {
        Player player = Player.selectCharacter();
        System.out.println(player);
        player.displayİnfo();
    }
}
