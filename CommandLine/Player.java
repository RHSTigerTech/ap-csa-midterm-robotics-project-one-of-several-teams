import java.util.List;

public interface Player {
    String getPlayerName();
    String setPlayerName();
    int getNextMove(List<Integer> freeCells);
}
