//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// test of the code

public class Main {
    public static void main(String[] args) {

        // create items
        Item tissue = new Item("Tissues", 3);
        Item soap = new Item("Soap", 2);
        Item eggs = new Item("Eggs", 6);

        // Create item orders with bulk discounts
        ItemOrder tissueOrder = new BulkDiscountItemOrder(tissue, 5, 2, 4);
        ItemOrder soapOrder = new BulkDiscountItemOrder(soap, 3, 3, 4);
        ItemOrder eggsOrder = new BulkDiscountItemOrder(eggs, 2, 2, 10);

        // Create a shopping cart and add item orders
        ShoppingCart cart = new ShoppingCart();
        cart.addItemOrder(tissueOrder);
        cart.addItemOrder(soapOrder);
        cart.addItemOrder(eggsOrder);

        // Display the total price in the shopping cart
        System.out.println("Total Price in the Shopping Cart: $" + cart.calculateTotalPrice());
    }
}
