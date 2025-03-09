
import java.util.Random;
import java.util.Scanner;

public class WT2_SP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true; // Variable to control the loop for playing again

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100
            int userGuess = 0;
            int attempts = 0;

            System.out.println("Welcome to the Guessing Game!");
            System.out.println("Try to guess the number between 1 and 100.");

            // Loop until the user guesses the correct number
            while (userGuess != randomNumber) {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number!");
                    System.out.println("It took you " + attempts + " attempts.");
                }
            }

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine();  // Consume the newline character left by nextInt()
            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("yes")) {
                playAgain = false;
                System.out.println("Thanks for playing! Goodbye.");
            }
        }

        scanner.close();
        
        String userInput;

        // Implementing the do-while loop
        do {
            System.out.print("Enter something (type 'exit' to quit): ");
            userInput = scanner.nextLine();
            System.out.println("You entered: " + userInput);
        } while (!userInput.equalsIgnoreCase("exit"));

        System.out.println("You entered 'exit'. GOODBYE!!");
        scanner.close();
    }

    }
