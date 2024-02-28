import java.util.Scanner;




    public class BadSubscriptCaught {

        public static void main(String[] args) {

            // making an array to store the name strings
            String[] names = {"Abbi", "Bill", "Carter", "Dan", "Emelia", "Fran", "Grant", "Hallie", "Irene", "John"};
            Scanner scanner = new Scanner(System.in);

            try{
                // Asks user to input a number
                System.out.println("Enter a number from 0 to 9: ");
                int num = scanner.nextInt();

                // gets the name in the position that the user input
                String name = names[num];

                // Print out name
                System.out.println(name);

                }


            catch(ArrayIndexOutOfBoundsException e){

                System.out.println("The number you input is to high.");

                }
            finally {
                // close scanner
                scanner.close();
            }
            }
        }



