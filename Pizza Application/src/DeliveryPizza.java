public class DeliveryPizza extends Pizza{
    private double deliveryFee;
    private String deliveryAddress;

    // constructor
    public DeliveryPizza(String[] toppings, String deliveryAddress, int numToppings) {
       // call the variables from the superclass Pizza
        super(toppings, numToppings);
        this.deliveryAddress = deliveryAddress;
        // calculate delivery fee based on pizza price
        if (super.getPrice() > 18) {
            this.deliveryFee = 3;
        }
        else {
            this.deliveryFee = 5;
        }
    }

    // override toString method so that the delivery info is in the description
    @Override
    public String toString() {
        return super.toString() + "\nDelivery Address: " + deliveryAddress + "\nDelivery Fee: $" + deliveryFee;
    }

}
