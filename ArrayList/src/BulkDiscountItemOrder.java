public class BulkDiscountItemOrder extends ItemOrder{

    private int bulkQuantity;
    private double bulkPrice;

    // setter and assigning the variables to BulkDiscountItemOrder
    public BulkDiscountItemOrder(Item item, int quantity, int bulkQuantity, double bulkPrice) {
        // taking item and price from the super class
        super(item, quantity);
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
    }

    public double calculateOrderPrice() {
        int originalQuantity = getQuantity() % bulkQuantity;
        int bulkOrderQuantity = getQuantity() / bulkQuantity;

        double originalPrice = originalQuantity * getItem().getOriginalPrice();
        double bulkPrice = bulkOrderQuantity * this.bulkPrice;

        return originalPrice + bulkPrice;

    }
}
