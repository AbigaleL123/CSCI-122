public class Pizza {
// array for the toppings
    private String[] toppings;
    // price of the pizza
    private double price;

    // Constructor
    public Pizza(String[] toppings, int numToppings) {
        // initialize toppings array with size
        this.toppings = new String[numToppings];
        for (int i =0; i < numToppings; i++) {
            //copy toppings from the parameter array to the instance variable
            this.toppings[i] = toppings[i];
        }
        // price based on the number of toppings
        this.price = 14 + 2 * numToppings;
    }

    public double getPrice() {
        return price;
    }

    // toString method to return a string representation of the pizza
    public String toString() {
        StringBuilder description = new StringBuilder("Pizza with toppings: ");
        for (int i = 0; i < toppings.length; i++){
            //append each topping to the description
            description.append(toppings[i]);
            // adda comma if its not the last topping
            if ( i < toppings.length -1) {
                description.append(", ");
            }
        }
        // add price to the description
        description.append("\nPrice: $").append(price);
        return description.toString();
    }

}
