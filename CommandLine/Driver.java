import java.util.Scanner;

public class Driver{
    public static UserInterface ui = new UserInterface();
    public static GameState game = new GameState();


    //Controller controller = new Controller(new HumanPlayer(ui), new AIPlayer("AI Bob"));
    public static Controller controller = new Controller(game, ui, new HumanPlayer(ui), new AIPlayer("Spooky Scary Robot", game));

    public static void main(String[] args) {
//        try { Thread.sleep(1000);
//        } catch (InterruptedException e){}
        (new Thread(new TicTacToe())).start();
        RunRobot.main();
    }
}