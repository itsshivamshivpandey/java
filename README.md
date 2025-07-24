import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lastGuessCount = 0;
        int choice;

        while (true) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("-------------------- WELCOME TO NUMBER GUESSING GAME --------------------");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Choose one option ---> ");
            System.out.println("1.>>> Play the Game >>>");
            System.out.println("2.>>> See the last Game Score >>>");
            System.out.println("3.>>> Exit from the Game >>>");
            System.out.print("\nEnter Your Option : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nLet's Start the Game...\n");
                    System.out.print("Enter what would you like the range of the numbers to be? : ");
                    int range = scanner.nextInt();
                    int realNumber = random.nextInt(range + 1);
                    int guessCount = 0;
                    int guess;

                    do {
                        System.out.print("\nEnter your guess number : ");
                        guess = scanner.nextInt();
                        guessCount++;

                        if (guess > realNumber) {
                            System.out.println("The number is lower than your guess...");
                        } else if (guess < realNumber) {
                            System.out.println("The number is higher than your guess...");
                        } else {
                            System.out.println("\nGreat! You guessed the correct number...!!!");
                            if (guessCount == 1) {
                                System.out.println("You guessed the number in 1st Try!!!\n");
                            } else {
                                System.out.println("You guessed the number in " + guessCount + " Tries...!\n");
                            }
                        }
                    } while (guess != realNumber);

                    lastGuessCount = guessCount;
                    break;

                case 2:
                    if (lastGuessCount == 0) {
                        System.out.println("\nYou haven't played the game once yet...\n");
                    } else if (lastGuessCount == 1) {
                        System.out.println("\nIn the Last Game, you won the game in 1st Try...!\n");
                    } else {
                        System.out.println("\nIn the Last Game, you won the game in " + lastGuessCount + " Tries...\n");
                    }
                    break;

                case 3:
                    System.out.println("\nThanks for Playing the Game...!\n");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid Option Choice... Please Try Again...\n");
            }
        }
    }
}
