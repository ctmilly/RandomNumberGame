import java.util.ArrayList;
public class GameUI extends RandomNumberGame{
    public static int userGuess;
    public static int guessNumber = 1;

    public static boolean checkGuessLow () {
        return userGuess < theNum;
    }
    public static boolean checkGuessHigh () {
        return userGuess > theNum;
    }
    public static void guessNumGame (int numOfGuesses, ArrayList<Integer> guessHistory) {
        boolean guessedCorrectly = false;
        for (int i = 0; i < numOfGuesses; i++) {
            System.out.println("enter guess #" + guessNumber);
            if (i > 0) {
                System.out.println("Here are your past guesses:     " + guessHistory);
            }
            userGuess = userInput.nextInt();
            guessHistory.add(userGuess);
            guessNumber++;
            // tell user if high or low or correct
            if (userGuess == theNum) {
                System.out.println("Correct!!");
                guessedCorrectly = true;
                break;
            } else if (checkGuessLow()) {
                System.out.println("Too low");
            } else if (checkGuessHigh()) {
                System.out.println("Too high");
            }
        }
        if (!guessedCorrectly) {
            System.out.println("You are out of guesses. The correct number was: " + theNum);
        }
    }
}
