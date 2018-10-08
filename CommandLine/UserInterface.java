import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Scanner userInput = new Scanner(System.in);

    public String getString(String prompt) {
        //Print the prompt that the user wants to use
        System.out.print(prompt);

        //save the users input into a variable
        String string = userInput.nextLine();

        //return the variable storing the users input
        return string;
    }

    public int getCell(String prompt, List<Integer> freeCells){
        //initialize a Scanner object
        Scanner userInput = new Scanner(System.in);

        //Print the prompt that the user wants to use
        System.out.print(prompt);

        //Confirm input is an integer
        while(!userInput.hasNextInt())
        {
            userInput.nextLine();    //This takes whatever non integer the user entered and throws it away
            System.out.print("Error (Not an integer)\n" + prompt);   //This prints Error then re-prompts the user
        }

        //save the users input into a variable
        int number = userInput.nextInt();

        //Confirm input is a free cell
        while (!freeCells.contains(number - 1)) {
            userInput.nextLine();
            System.out.print("Error (Not a free cell)\n" + prompt);
            number = userInput.nextInt();
        }

        return number - 1;
    }

    public String printBoard(GameState game) {
        int[] board = game.getBoard();

        //convert the array board into an array of strings to be printed to the screen
        String[] test2 = new String[board.length];
        for(int i = 0; i < board.length; i++){
            if(board[i] == 1) //1 is second player (AI)
                test2[i] = "O";
            else if(board[i] == -1) //-1 is first player (user)
                test2[i] = "X";
            else
                test2[i] = " ";
        }


        String result =  String.format(" %s ┃ %s ┃ %s         1 ┃ 2 ┃ 3 \n"
                                     + "━━━╋━━━╋━━━       ━━━╋━━━╋━━━\n"
                                     + " %s ┃ %s ┃ %s   <━━   4 ┃ 5 ┃ 6 \n"
                                     + "━━━╋━━━╋━━━       ━━━╋━━━╋━━━\n"
                                     + " %s ┃ %s ┃ %s         7 ┃ 8 ┃ 9 \n", test2);

        return result;
    }
}
