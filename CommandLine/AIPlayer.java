import java.util.List;

public class AIPlayer implements Player {
    private String name;
    private GameState game;

    AIPlayer(String name, GameState game) {
        this.name = name;
        this.game = game;
    }

    public String setPlayerName() {
        return "";
    }

    @Override
    public String getPlayerName() {
        return name;
    }

    @Override
    public int getNextMove(List<Integer> freeCells){
        System.out.print("Hmm let me think... ");

        //wait half a second
        try { Thread.sleep(2000);
        } catch (InterruptedException e){}

        System.out.println("Oh! I know where to go!");

        //wait half a second
        try { Thread.sleep(1000);
        } catch (InterruptedException e){}

        int length = freeCells.size();

        //check for immediate win
        for(int i = 0; i < length; i++) {
            int index = freeCells.get(i);
            boolean aiWin = game.setBoard(index, 1);
            if(aiWin) {
                game.setBoard(index, 0);
                return index;
            } else
                game.setBoard(index, 0);
        }

        //return random
        int index = (int)(Math.random()*length);
        int result = freeCells.get(index);
        return result;
    }
}
