import java.util.ArrayList;
import java.util.List;

public class GameState {
    private int[] board = new int[9];
    private int[][] wins = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8},
            {0, 3, 6},
            {1, 4, 7},
            {2, 5, 8},
            {0, 4, 8},
            {2, 4, 6}
    };

    public List<Integer> getFreeSpace() {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < 9; i++) {
            if (board[i] == 0)
                result.add(i);
        }

        if (result.isEmpty())
            Controller.gameOn = false;
        return result;
    }

    public int[] getBoard() {
        return board;
    }

    public boolean setBoard(int index, int player) {
        this.board[index] = player;

        if(player == 0)
            return false;
        else
            return win(player);
    }

    public void reset() {
        for(int i = 0; i < 9; i++) {
            board[i] = 0;
        }
    }

    private boolean win(int player){
        if(player == -1) { //-1 is first player (user)
            for(int i = 0; i < 8; i++) {
                int temp = 0;
                for(int y = 0; y < 3; y++) {
                    temp += board[wins[i][y]];
                }
                if(temp == -3){
                    return true;
                }
            }
            return false;
        } else if(player == 1) { //-1 is first player (user)
            for(int i = 0; i < 8; i++) {
                int temp = 0;
                for(int y = 0; y < 3; y++) {
                    temp += board[wins[i][y]];
                }
                if(temp == 3){
                    return true;
                }
            }
            return false;
        } else
            return false;
    }
}
