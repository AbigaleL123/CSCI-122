import java.time.LocalDate;
import java.util.Scanner;

public class TestWedding {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // ask for the names of the bride and groom
        System.out.println("Enter the first name of the Bride: ");
        String brideFirstName = scan.nextLine();

        System.out.println("Enter the last name of the Bride: ");
        String brideLastName = scan.nextLine();

        System.out.println("Enter the first name of the Groom: ");
        String groomFirstName = scan.nextLine();

        System.out.println("Enter the last name of the Groom: ");
        String groomLastName = scan.nextLine();

        // Couple object
        Person bride = new Person(brideFirstName, brideLastName);
        Person groom = new Person(groomFirstName, groomLastName);
        Couple couple = new Couple(bride, groom);

        // Ask user for the wedding date
        System.out.println("Enter the date of the wedding (YYYY-MM-DD): ");
        String weddingDateString = scan.nextLine();
        LocalDate weddingDate = LocalDate.parse(weddingDateString);

        // Ask user for the wedding location
        System.out.println("Enter the location of the wedding: ");
        String weddingLocation = scan.nextLine();

        // Make the Wedding object
        Wedding wedding = new Wedding(couple, weddingDate, weddingLocation);

        // Now print out all of the wedding details
        System.out.println("Wedding Details: ");
        System.out.println("Bride: " + wedding.getCouple().getBride().getFirstName()+ " " + wedding.getCouple().getBride().getLastName());
        System.out.println("Groom: " + wedding.getCouple().getGroom().getFirstName()+ " " + wedding.getCouple().getGroom().getLastName());
        System.out.println("Wedding Date: " + wedding.getWeddingDate());
        System.out.println("Wedding Location: " + wedding.getLocation());
    }
}
