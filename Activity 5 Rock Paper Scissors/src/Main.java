import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                String[] selections = new String[]{"Rock", "Paper", "Scissors"};
                Random random = new Random();

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your guess (Rock, Paper, Scissors): ");
                String playerGuess = scanner.nextLine();

                String computerGuess = computerGuess(selections, random);
                System.out.println("Computer Guess: " + computerGuess);

                if (isTied(playerGuess, computerGuess)) {
                    System.out.println("Tied");
                } else if (isPlayerWinner(playerGuess, computerGuess)) {
                    System.out.println("Player Wins");
                } else if (isPlayerLoser(playerGuess, computerGuess)) {
                    System.out.println("Computer Wins");
                } else {
                    System.out.println("Invalid OR Wrong Type Input");
                }
            } catch (Exception e) {
                System.out.println("Invalid OR Wrong Type Input");
            }
        }
    }

    public static String computerGuess(String[] selections, Random random) {
        int index = random.nextInt(selections.length);
        return selections[index];
    }

    public static boolean isTied(String playerGuess, String computerGuess) {
        return playerGuess.equalsIgnoreCase(computerGuess);
    }

    public static boolean isPlayerWinner(String playerGuess, String computerGuess) {
        return (playerGuess.equalsIgnoreCase("Rock") && computerGuess.equalsIgnoreCase("Scissors")) ||
                (playerGuess.equalsIgnoreCase("Paper") && computerGuess.equalsIgnoreCase("Rock")) ||
                (playerGuess.equalsIgnoreCase("Scissors") && computerGuess.equalsIgnoreCase("Paper"));
    }

    public static boolean isPlayerLoser(String playerGuess, String computerGuess) {
        return (playerGuess.equalsIgnoreCase("Rock") && computerGuess.equalsIgnoreCase("Paper")) ||
                (playerGuess.equalsIgnoreCase("Paper") && computerGuess.equalsIgnoreCase("Scissors")) ||
                (playerGuess.equalsIgnoreCase("Scissors") && computerGuess.equalsIgnoreCase("Rock"));
    }
}