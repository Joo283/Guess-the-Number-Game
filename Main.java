// Main class to run the game
// this class is simply take the name of the game and start the game
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter the name of the game: ");
        String game_name = sc.nextLine();
        Guess_game game = new Guess_game();
        game.setName(game_name);
        game.startGame();



    }

}
