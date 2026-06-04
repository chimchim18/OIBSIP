import java.util.*;

public class Chimnaz_Task2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int roundNumber = 1;
        boolean playAgain = true;

        System.out.println("WELCOME TO THE NUMBER GUESSING GAME");

        while(playAgain){
            int targetNumber = random.nextInt(100) + 1;
            int maxAttempts = 5;
            int attemptsUsed = 0;
            boolean guessedCorrectly = false;

            System.out.println("\n--- ROUND " + roundNumber + " ---");
            System.out.println("Im thinking of a number between 1 and 100.");
            System.out.println("Can you guess it? You have " + maxAttempts + " attempts total.");

            while(attemptsUsed < maxAttempts){
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsUsed++;

                if(userGuess == targetNumber){
                    System.out.println("Congratulations! You guessed the number in " + attemptsUsed + " attempts.");

                    //fewer attempts equals higher points
                    int pointsEarned =(maxAttempts - attemptsUsed + 1) * 20;
                    totalScore +=pointsEarned;

                    System.out.println("Points earned this round: " + pointsEarned);
                    guessedCorrectly = true;
                    break;
                }else if (userGuess < targetNumber){
                    System.out.println("Too low! Try a higher number. (" + (maxAttempts - attemptsUsed) + " attempts left)");
                }else{
                    System.out.println("Too high! Try a lower number. (" + (maxAttempts - attemptsUsed) + " attempts left)");
                }}

            if(!guessedCorrectly){
                System.out.println("\n Game Over for this round! You've used all attempts.");
                System.out.println("The correct number was: " + targetNumber);}

            System.out.println("Your current total accumulated score is: " + totalScore + " points.");

            System.out.print("\nDo you want to play another round? (yes/no): ");
            String choice = scanner.next().trim().toLowerCase();

            if(choice.equals("yes") || choice.equals("y")){
                roundNumber++;
            }else{
                playAgain = false;}}
        
        System.out.println("Final Game Stats -> Rounds Played: " + roundNumber + " | Total Score: " + totalScore + " points.");
        System.out.println("Thank you for playing! See you next time.");}
}
