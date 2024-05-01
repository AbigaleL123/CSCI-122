import java.util.Scanner;

public class CoinCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in dollars (e.g., 4.55):");
        double amount = scanner.nextDouble();

        int totalCents = (int) (amount * 100); // Convert dollars to cents
        int quarters = totalCents / 25; // Calculate number of quarters
        totalCents %= 25; // Update remaining cents

        int dimes = totalCents / 10; // Calculate number of dimes
        totalCents %= 10; // Update remaining cents

        int nickels = totalCents / 5; // Calculate number of nickels
        totalCents %= 5; // Update remaining cents

        int pennies = totalCents; // Remaining cents are all pennies

        // Output the results
        System.out.println("You will need:");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}