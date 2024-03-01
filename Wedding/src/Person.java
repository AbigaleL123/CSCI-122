public class Person {

    // declaring the first and last name variables
    private String firstName;
    private String lastName;

    // Constructor for first and last name
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    // getter for first name
    public String getFirstName(){
        return firstName;
    }

    // getter for last name
    public String getLastName(){
        return lastName;
    }


}
