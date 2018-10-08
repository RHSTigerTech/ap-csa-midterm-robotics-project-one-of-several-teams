public class Driver {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        GameState game = new GameState();


        //Controller controller = new Controller(new HumanPlayer(ui), new AIPlayer("AI Bob"));
        Controller controller = new Controller(game, ui, new HumanPlayer(ui), new AIPlayer("Spooky Scary Robot", game));
        controller.playGame();
    }
}
