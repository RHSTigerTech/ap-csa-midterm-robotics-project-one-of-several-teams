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

    public void setPlayer1Name() {
        player1.setPlayerName();
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public String getAltPlayer1Name() {
        String altPlayer1Name = "";
            for(int i = 0; i < player1Name.length(); i++) {
                if(i%2 == 0) {
                    String temp = player1Name.substring(i, i+1);
                    altPlayer1Name += temp.toLowerCase();
                } else {
                    String temp = player1Name.substring(i, i+1);
                    altPlayer1Name += temp.toUpperCase();
                }
            }
        return altPlayer1Name;
    }

    public void playGame() {

        //beginning of game setup
        System.out.println("Hello " + this.getAltPlayer1Name() + ", my name is " + player2Name);
        Robot1.athena.speak("Hello " + this.getAltPlayer1Name() + ", my name is " + player2Name);
        //wait
        try { Thread.sleep(4200);
        } catch (InterruptedException e){}

        System.out.println("Let's play a game. You can go first");
        Robot1.athena.speak("Let's play a game. You can go first");
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

            //Check for user win and for tie
            if(userWin){
                System.out.println(player1Name + " won!");
                Robot1.playerWin(player1Name);
                break;
            } else if(!gameOn) {
                System.out.println("It was a tie");
                Robot1.tie(player1Name);
                break;
            }

            //1 is second player (AI)
            nextMove = player2.getNextMove(freeSpaces);
            boolean aiWin = game.setBoard(nextMove, 1);
            freeSpaces = game.getFreeSpace();
            System.out.println(ui.printBoard(game));

            //check for ai win
            if(aiWin){
                System.out.println(player2Name + " won!");
                Robot1.aiWin(player1Name);
                break;
            }
        }
        System.out.println("End Game");
    }
}
