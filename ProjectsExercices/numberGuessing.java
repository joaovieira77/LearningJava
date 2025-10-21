
import java.util.Scanner;
public class numberGuessing {
    public static void main(String[] args) {
        // number guessing game
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Number Guessing Game");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.printf("Congratulations! You've guessed the number %d in %d attempts.\n", numberToGuess, attempts);
            }
        }

        scanner.close();
    }
}
