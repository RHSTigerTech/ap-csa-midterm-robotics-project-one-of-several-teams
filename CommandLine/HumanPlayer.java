import java.util.List;

public class HumanPlayer implements Player {
    private UserInterface ui;
    private String playerName;
    HumanPlayer(String playerName, UserInterface ui) {
        this.ui = ui;
        this.playerName = playerName;
    }


    @Override
    public String getPlayerName() {
        return playerName;
    }

    @Override
    public int getNextMove(List<Integer> freeCells) {
        return ui.getCell("Type the number of the cell that you want to play in\n", freeCells);
    }
}
