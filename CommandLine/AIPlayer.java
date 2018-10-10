import java.util.List;

public class AIPlayer implements Player {
    private String name;
    private GameState game;

    AIPlayer(String name, GameState game) {
        this.name = name;
        this.game = game;
    }

    public String setPlayerName() {
        return this.name;
    }

    @Override
    public String getPlayerName() {
        return name;
    }

    @Override
    public int getNextMove(List<Integer> freeCells){
        System.out.print("Hmm let me think... ");

        Robot1.blinkLights(0,0,255, 3);

        System.out.println("Oh! I know where to go!");

        //wait half a second
        try { Thread.sleep(500);
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

        //check for immediate loss
        for(int i = 0; i < length; i++) {
            int index = freeCells.get(i);
            boolean userWin = game.setBoard(index, -1);
            if(userWin) {
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
