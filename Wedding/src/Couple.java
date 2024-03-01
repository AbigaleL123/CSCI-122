public class Couple{
    // Declaring the variables of bride and groom

    private Person bride;
    private Person groom;

    public Couple(Person bride, Person groom){
        this.bride = bride;
        this.groom = groom;
    }

    // getter for bride
    public Person getBride(){
        return bride;
    }

    // getter for groom
    public Person getGroom(){
        return groom;
    }
}
