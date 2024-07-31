import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class RandomNumberGame {
    public static Scanner userInput = new Scanner (System.in);
    public static Random randNum = new Random();
    public static int theNum;
    public static void easy (int numOfGuessesAllowed) {
        theNum = randNum.nextInt(10) + 1;
        ArrayList<Integer> guessHistory = new ArrayList<>();
        GameUI.guessNumGame(numOfGuessesAllowed, guessHistory);
    }
    public static void medium (int numOfGuessesAllowed) {
        theNum = randNum.nextInt(100) + 1;
        ArrayList<Integer> guessHistory = new ArrayList<>();
        GameUI.guessNumGame(numOfGuessesAllowed, guessHistory);

    }
    public static void hard (int numOfGuessesAllowed) {
        theNum = randNum.nextInt(1000) + 1;
        ArrayList<Integer> guessHistory = new ArrayList<>();
        GameUI.guessNumGame(numOfGuessesAllowed, guessHistory);
    }
    public static void impossible (int numOfGuessesAllowed) {
        theNum = randNum.nextInt(10000) + 1;
        ArrayList<Integer> guessHistory = new ArrayList<>();
        GameUI.guessNumGame(numOfGuessesAllowed, guessHistory);
    }
    public static void main(String[] args) {
        //Chose difficulty level
        System.out.println("""
                Choose difficulty level (enter number 1-4):
                1. Easy, 3 guesses (1-10)
                2. Medium, 5 guesses (1-100)
                3. Hard, 10 guesses (1-1,000)
                4. Impossible, 12 guesses, (1-10,000)
                """);
        int difficulty = userInput.nextInt();
        //add exception handling

        switch (difficulty) {
            case 1:
                easy(3);
                break;
            case 2:
                medium(5);
                break;
            case 3:
                hard(10);
                break;
            case 4:
                impossible(12);
                break;
        }
    }
}
