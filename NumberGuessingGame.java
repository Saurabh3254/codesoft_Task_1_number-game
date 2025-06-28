import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        boolean playAgain;

        System.out.println("=== Number Guessing Game ===");

        do {
            int number = rand.nextInt(100) + 1;
            int attempts = 5
            ;
            boolean won = false;

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Guess (1-100): ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct! You guessed it in " + i + " attempt(s).");
                    score++;
                    won = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
            }

            if (!won) {
                System.out.println("You lost! Number was: " + number);
            }

            System.out.println("Rounds won so far: " + score);
            System.out.print("Play again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Final score (rounds won): " + score);
        sc.close();
    }
}
