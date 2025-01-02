//this class is the main class that will run the game that have the main logic of the game
// this class has 4 instance variables and 2 setters methods and 2 logic methods
// this class is used in Main.java
// this class is used to run the game
//this class simply make 3 objects of players and take a random number between 1 and 10 and the players will guess the number until they get it right
// tha main logic of the game is when the player guess the number right the game will end , and if no one guessed the number right the game will continue

public class Guess_game {
    player P1 = new player();
    player P2 = new player();
    player P3 = new player();
    String game_name;
    public Guess_game()
    {
        P1.setName("player 1");
        P2.setName("player 2");
        P3.setName("player 3");
    }




    public void setName(String name) {
        this.game_name= name;
    }
    public void startGame()
    {
        System.out.println(game_name);

        int guss1 = 0;
        int guss2 = 0;
        int guss3 = 0;
        boolean P1isRight = false;
        boolean P2isRight = false;
        boolean P3isRight = false;
        int taret_num = (int) (Math.random() * 10);
        System.out.println("iam thinking a number between 1 and 10");

        while (true)
        {
            System.out.println("number to guess is " + taret_num);
            P1.gess();
            P2.gess();
            P3.gess();
            guss1 = P1.numtoguess;
            System.out.println( P1.getName() + " guessed : " + guss1);
            guss2 = P2.numtoguess;
            System.out.println(P2.getName() + " guessed : " + guss2);
            guss3 = P3.numtoguess;
            System.out.println(P3.getName() + " guessed : " + guss3);
            if(guss1==guss2 && guss1==guss3){
                System.out.println("you all write ! ");
                break;
            }
            if(guss1 == taret_num){
                P1isRight = true;
            }
            if(guss2 == taret_num){
                P2isRight = true;
            }
            if(guss3 == taret_num){
                P3isRight = true;
            }
            if(P1isRight){
                System.out.println(P1.getName() + " guessed right");
                break;

            }
            if(P2isRight){
                System.out.println(P2.getName() + " guessed right");

                break;
            }
            if(P3isRight){
                System.out.println(P3.getName() + " guessed right");

                break;
            }
            else
                System.out.println("all players will play again ");



        }
    }




}
