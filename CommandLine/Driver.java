import java.util.Scanner;


public class Driver{
    public static String playerName = MyTools.readString("Yo Dawg, Whats ya name? ");
    public void main(String[] args){
       (new Thread(new TicTacToe())).start();

    }
}

