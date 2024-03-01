import java.time.LocalDate;

public class Wedding {
    private Couple couple;
    private LocalDate weddingDate;
    private String location;

    // Constructor for couple, local date, and location
    public Wedding(Couple couple, LocalDate weddingDate, String location){
        this.couple = couple;
        this.weddingDate = weddingDate;
        this.location = location;
    }

    // getter for couple
    public Couple getCouple(){
        return couple;
    }

    // getter for wedding date

    public LocalDate getWeddingDate(){
        return weddingDate;
    }

    // getter for location
    public String getLocation(){
        return location;
    }
}
