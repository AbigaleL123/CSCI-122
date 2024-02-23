
// Allow a user to enter any number of double values up to 20. Display each entered value.
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // making an array to store the double values
         double[] numbers = new double[20];


        // A for loop to make sure that the array length does not go past 20.
        // if user entered a double the number will be stored in numbers
        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Enter number: " + (i+1) + ": ");
            if (scanner.hasNextDouble()){
                numbers[i] = scanner.nextDouble();
            }
            else {
                // if a non-double number is the loop will break
                break;
            }

        }

        // Prints out array, labeling the order which each number was input.
        // use the "Number #" (i+1) because the array starts at zero because I want the label to start at 1
        System.out.println("Entered Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number #" + (i+1) + ": " + numbers[i]);
        }

        // close scanner
        scanner.close();
    }

}









