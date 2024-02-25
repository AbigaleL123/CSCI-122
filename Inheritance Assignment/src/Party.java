public class Party {
        // 1: setting the variable
        private static int numberOfGuests;

        // 2: the getter method
        public static int getNumberOfGuests(){
            return numberOfGuests;
        }

        // setter method
        public void setNumberOfGuests(int numberOfGuests){
            Party.numberOfGuests = numberOfGuests;
        }
        public static void displayInvitation(){
        System.out.println("Please come to my Party!");

        }

}
