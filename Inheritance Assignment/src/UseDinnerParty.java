
import java.util.Scanner;

public class UseDinnerParty {

    public static void main(String[] args){

        // Declaring the variables
        int numberOfGuests;
        int dinnerChoice;
        Party party = new Party();
        DinnerParty dinnerParty = new DinnerParty();
        Scanner scanner = new Scanner(System.in);

        // User puts in the number of guests
        System.out.println("Enter number of guests for the party >> ");
        numberOfGuests = scanner.nextInt();

        // sets the number of guests to Party
        party.setNumberOfGuests(numberOfGuests);

        // Prints out number of guests
        System.out.println("This party has " + party.getNumberOfGuests() + " guests");

        // Print out of Invitation
        Party.displayInvitation();

        // input number of guests for  the dinner party
        System.out.println("Enter number of guests for the dinner party >> ");
        numberOfGuests = scanner.nextInt();

        //set the number of guests in the dinner party
        dinnerParty.setNumberOfGuests(numberOfGuests);


        // asks for input of menu choice
        System.out.println("Enter the menu option -- 1 for chicken or 2 for vegi >> ");
        dinnerChoice = scanner.nextInt();

        //set dinner choice to the dinner party
        DinnerParty.setDinnerChoice(dinnerChoice);

        // Displays the number of guests at the dinner party and what they ordered off the menu.
        System.out.println("The dinner party has " + DinnerParty.getNumberOfGuests() + " guests");
        System.out.println("Menu option: " + getDinnerDescription(dinnerChoice) + " will be served");

        DinnerParty.displayInvitation();
        scanner.close();

    }

    // assigns the choice number to the actual meal that is ordered
    private static String getDinnerDescription(int choice) {
        if (choice == 1) {
            return "Chicken";
        }

        else if (choice == 2) {
            return "Vegi";
        }
        else {
                return "Unknown";
        }
    }

}
