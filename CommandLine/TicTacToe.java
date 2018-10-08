

public class TicTacToe implements Runnable{
    public void run(){
        main();
    }
    public static void main() {
        UserInterface ui = new UserInterface();
        GameState game = new GameState();


        //Controller controller = new Controller(new HumanPlayer(ui), new AIPlayer("AI Bob"));
        Controller controller = new Controller(game, ui, new HumanPlayer(Driver.playerName, ui), new AIPlayer("Spooky Scary Robot", game));
        controller.playGame();
    }
}