

public class TicTacToe implements Runnable{
    public void run(){
        Driver.controller.playGame();
    }
    public static void main() {
        Driver.controller.playGame();
    }
}
