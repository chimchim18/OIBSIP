import java.util.*;

public class Chimnaz_Task2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;

        System.out.println("Welcome to the number guessing game!");
        
        for (int round = 1; ; round++){
            int targetNumber = random.nextInt(100) + 1;
            boolean guessedCorrectly = false;

            System.out.println("\n--- Round " + round + " ---\nI'm thinking of a number between 1 and 100.\nYou have 5 attempts.");
            
            for (int attempts = 1; attempts <= 5; attempts++){
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber){
                    int pointsEarned = (5 - attempts +1) * 20; 
                    totalScore += pointsEarned;
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.\nPoints earned this round: " + pointsEarned);
                    guessedCorrectly = true;
                    break;
                }

                System.out.println((userGuess < targetNumber ? "Too low!" : "Too high!") + " Try again. (" + (5 - attempts) + " attempts left)");
            }

            if (!guessedCorrectly){
                System.out.println("\nGame over for this round! The correct number was: " + targetNumber);
            }

            System.out.println("Your current total accumulated score is: " + totalScore + " points.");
            System.out.print("\nDo you want to play another round? (yes/no): ");

            if (!scanner.next().trim().toLowerCase().startsWith("y")){
                System.out.println("Final game stats -> Rounds played: " + round + " | Total score: " + totalScore + " points.\nThank you for playing! See you next time!");
                break;
            }
        }
    }
}
