
// Assigns a grocery item with a name and price
public class Item {
    private final double originalPrice;
    private String name;
    private double price;

    //setter
    public Item(String name, double originalPrice) {
        this.name = name;
        this.originalPrice= originalPrice;
    }

    // getter

    public String getName() {
        return name;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }


}
