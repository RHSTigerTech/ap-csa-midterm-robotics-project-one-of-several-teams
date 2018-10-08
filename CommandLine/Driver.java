import java.util.Scanner;

public class Driver{
    public String playerName = MyTools.readString("Yo Dawg, Whats ya name? ");
    public void main(String[] args) {
        (new Thread(new TicTacToe())).start();

    }
}
