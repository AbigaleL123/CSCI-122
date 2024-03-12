
// item order with item and quantity
public class ItemOrder{

    private final Item item;
    private final int quantity;

    // setter
    public ItemOrder(Item item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }

    // calculates the price by multiplying the quantity by the price of the item
    public double calculateOrderPrice() {
        return item.getOriginalPrice() * quantity;
    }

    // getters for item and quantity
    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
