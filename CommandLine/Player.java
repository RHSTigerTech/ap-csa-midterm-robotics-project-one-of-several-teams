import java.util.List;

public interface Player {
    String getPlayerName();

    int getNextMove(List<Integer> freeCells);
}
