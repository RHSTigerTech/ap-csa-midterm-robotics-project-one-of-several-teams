import java.util.List;

public class Controller {
    private GameState game;
    private UserInterface ui;
    private final Player player1;
    private final Player player2;
    private int nextMove;
    private List<Integer> freeSpaces;
    private String player1Name;
    private String player2Name;
    public static boolean gameOn;


    public Controller(GameState game, UserInterface ui, Player player1, Player player2) {
        this.game = game;
        this.ui = ui;
        this.player1 = player1;
        this.player2 = player2;
        player1Name = player1.getPlayerName();
        player2Name = player2.getPlayerName();
    }

    public void playGame() {
        //beginning of game setup
        System.out.println("Hello " + player1Name + ", my name is " + player2Name);

        //wait
        try { Thread.sleep(700);
        } catch (InterruptedException e){}

        System.out.println("Let's play a game. You can go first");

        //wait
        try { Thread.sleep(1300);
        } catch (InterruptedException e){}


        //start of each game (repeated when user chooses to play again)
        gameOn = true;
        game.reset();
        freeSpaces = game.getFreeSpace();
        System.out.println(ui.printBoard(game));

        //game play
        while(gameOn) {
            //-1 is first player (user)
            nextMove = player1.getNextMove(freeSpaces);
            boolean userWin = game.setBoard(nextMove, -1);
            freeSpaces = game.getFreeSpace();
            System.out.println(ui.printBoard(game));

            if(userWin){
                System.out.println(player1Name + " won!");
                break;
            } else if(!gameOn) {
                System.out.println("It was a tie");
                break;
            }

            //1 is second player (AI)
            nextMove = player2.getNextMove(freeSpaces);
            boolean aiWin = game.setBoard(nextMove, 1);
            freeSpaces = game.getFreeSpace();
            System.out.println(ui.printBoard(game));

            if(aiWin){
                System.out.println(player2Name + " won!");
                break;
            }
        }
        System.out.println("End Game");
    }
}
