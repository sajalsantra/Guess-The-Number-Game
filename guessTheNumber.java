import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

class Game {

    int compInput, userInput, noOfGuess = 0;

    public Game() {
        Random random = new Random();
        compInput = random.nextInt(10);
    }

    public void takeUserInput() {
        System.out.print("Enter your Choice: ");
        Scanner sv = new Scanner(System.in);
        userInput = sv.nextInt();
    }

    public boolean isCorrectNumber() {
        if (compInput > userInput) {
            System.out.println("Don't Match! Chose a Big Number.");
            noOfGuess++;
            return false;
        }
        if (compInput < userInput) {
            System.out.println("Don't Match! Chose a Small Number.");
            noOfGuess++;
            return false;
        } else {
            System.out.println("Congratulation! You Win The Game, ");
            noOfGuess++;
            if (noOfGuess <= 5) {
                System.out.println(" You guess the number in " + noOfGuess + " Time. You Take a Bow from me! ");
            } else {
                System.out.println(" You guess the number in " + noOfGuess
                        + " (more than five Time) Time. You didn't got any prize! ");
            }
            System.out.println(" Press 1 for Play Again & Press 0 for Exit");
            Scanner sb = new Scanner(System.in);

            int h = sb.nextInt();
            if (h == 1) {
                Random random = new Random();
                compInput = random.nextInt(10);
                noOfGuess=0;
                return false;
            } else {
                System.out.println("Thank You For Using our Services");
            }
            return true;
        }
    }
}

public class guessTheNumber {
    public static void main(String[] args) {
        boolean f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome The Guess Number Game!");
        Game guess = new Game();
        System.out.println("Now, Chose A number Between 1 to 10");
        guess.takeUserInput();

        while (!guess.isCorrectNumber()) {
            System.out.println("Guess a New Number: ");
            guess.takeUserInput();
        }
    }
}
