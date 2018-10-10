

public class TicTacToe implements Runnable{
    public void run(){
        try { Thread.sleep(1000);
        } catch (InterruptedException e){}
        Driver.controller.playGame();
    }
    public static void main() {
        Driver.controller.playGame();
    }
}
