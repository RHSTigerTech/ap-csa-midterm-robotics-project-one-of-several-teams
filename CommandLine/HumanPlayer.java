import java.util.List;

public class HumanPlayer implements Player {
    private UserInterface ui;
    private String playerName;
    HumanPlayer(UserInterface ui) {
        this.ui = ui;
        playerName = setPlayerName();
    }



    public String setPlayerName() {
        playerName = ui.getString("Yo dude!, What's yer name? ");
        return playerName;
    }

    @Override
    public String getPlayerName(){
        return playerName;
    }

    @Override
    public int getNextMove(List<Integer> freeCells) {
        return ui.getCell("Type the number of the cell that you want to play in ", freeCells);
    }
}
