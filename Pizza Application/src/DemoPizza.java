import java.util.Scanner;
public class DemoPizza {
   // constant for quitting the loop
    public static final String QUIT = "QUIT";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array to store toppings, with a maximum capacity of 10
        String[] toppings = new String[10];
        // Variable to keep track of the number of toppings entered
        int numToppings = 0;
        // Variable to store each topping entered by the user
        String topping;

        // prompt user for toppings until the limit or quit is entered
        while (numToppings < 10) {
            System.out.println("Enter a topping(or QUIT to finish: ");
            // Read user input and remove leading/trailing whitespaces
            topping = scanner.nextLine().trim();
            // Check if the user wants to quit
            if (topping.equalsIgnoreCase(QUIT)){
                break;
            }

            // Store the topping in the array
            toppings[numToppings] = topping;
            // Increment the number of toppings
            numToppings++;
        }

        // ask if pizza is delivered
        System.out.println("Is the pizza to be delivered? (yes/no): ");
        // Read delivery option and convert to lowercase
        String deliveryOption = scanner.nextLine().trim().toLowerCase();

        // Construct the appropriate type of Pizza object based on the delivery option
        if (deliveryOption.equals("yes")) {
            System.out.println("Enter delivery address: ");
            // Prompt user for delivery address
            String deliveryAddress = scanner.nextLine().trim();
            // Create a DeliveryPizza object
            DeliveryPizza deliveryPizza = new DeliveryPizza(toppings, deliveryAddress, numToppings);
            System.out.println("\nDelivery Pizza Details: ");
            // Display details of the delivery pizza
            System.out.println(deliveryPizza);
        }

        else {
            // Create a regular Pizza object
            Pizza pizza = new Pizza(toppings, numToppings);
            // Display details of the pizza
            System.out.println(pizza);
        }
        scanner.close();
    }
}
