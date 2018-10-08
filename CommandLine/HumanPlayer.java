import java.util.List;

public class HumanPlayer implements Player {
    private UserInterface ui;

    HumanPlayer(UserInterface ui) {
        this.ui = ui;
    }


    @Override
    public String getPlayerName() {
        return ui.getString("Yo dude!, What's yer name? ");
    }

    @Override
    public int getNextMove(List<Integer> freeCells) {
        return ui.getCell("Type the number of the cell that you want to play in", freeCells);
    }
}
