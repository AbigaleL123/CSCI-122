import java.util.ArrayList;

// represents a shopping cart that stores the items
public class ShoppingCart{

    private ArrayList<ItemOrder> itemOrders;

    public ShoppingCart() {
        this.itemOrders = new ArrayList<>();
    }

    // Adds an item order to the shopping cart
    public void addItemOrder(ItemOrder itemOrder) {
        itemOrders.add(itemOrder);
    }

    // Removes and item from the shopping cart

    public void removeItemOrder(ItemOrder itemOrder) {
        itemOrders.remove(itemOrder);
    }

    // Searches for an item order in the shopping cart
    public ItemOrder searchItemOrder(String itemName) {
        for (ItemOrder order : itemOrders) {

            // Ingnore case will allow the user to input the item name and not have to be exact
            if (order.getItem().getName().equalsIgnoreCase(itemName)) {
                return order;
            }
        }
        return null;
    }

    // calculates the total price of all the item orders in the shopping cart
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (ItemOrder order : itemOrders) {
            totalPrice += order.calculateOrderPrice();
        }
        return totalPrice;
    }
}
