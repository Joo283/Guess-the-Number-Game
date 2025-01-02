
// this class is for the players to guess the number
// the player will guess a random number between 1 and 10
// the player will guess the number until he gets it right
// this class is used in Guess_game.java
//this class is made for making users to guess the number
// this class has 3 methods and 2 instance variables
public class player {
    private String name;
    public int numtoguess;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void gess() {
        this.numtoguess = (int) (Math.random() * 10);

    }
}
