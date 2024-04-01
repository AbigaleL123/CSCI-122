import java.util.Scanner;

public class RockPaperScissors {

    // Enum to represent the different throws in the game
    enum Throw {
        ROCK, PAPER, SCISSORS
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt Player 1 to enter their throw
        System.out.println("Player 1, enter your throw (ROCK, PAPER, or SCISSORS): ");
        // Read and convert input to uppercase to match enum values
        Throw player1Throw = Throw.valueOf(scanner.next().toUpperCase());

        // Prompt Player 2 to enter their throw
        System.out.println("Player 2, enter your throw (ROCK, PAPER, or SCISSORS): ");
        // Read and convert input to uppercase to match enum values
        Throw player2Throw = Throw.valueOf(scanner.next().toUpperCase());

        // Check for a tie
        if (player1Throw == player2Throw) {
            System.out.println("It's a tie!");
        }
        // Check for winning conditions for Player 1
        else if ((player1Throw == Throw.ROCK && player2Throw == Throw.SCISSORS) ||
                (player1Throw == Throw.PAPER && player2Throw == Throw.ROCK) ||
                (player1Throw == Throw.SCISSORS && player2Throw == Throw.PAPER)) {
            System.out.println("Player 1 wins!");
        }
        // If it's not a tie and Player 1 didn't win, Player 2 must win
        else {
            System.out.println("Player 2 wins!");
        }

        // Close the scanner to release resources
        scanner.close();
    }
}