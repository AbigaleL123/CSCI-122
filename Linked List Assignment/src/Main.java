//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main() {


        // Create a new CarLinkedList instance
        CarLinkedList carList = new CarLinkedList();

        // Create some Car objects
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2018);
        Car car3 = new Car("Ford", "Mustang", 2022);

        // Insert the Car objects into the linked list
        carList.insertNode(car1);
        carList.insertNode(car2);
        carList.insertNode(car3);

        // Print the linked list
        System.out.println("Linked List:");
        carList.printList();

        // Search for a node with a specific brand
        CarNode foundNode = carList.searchNode("Honda");
        if (foundNode != null) {
            System.out.println("\nFound node with brand 'Honda': " + foundNode.getCar());
        } else {
            System.out.println("\nNo node found with brand 'Honda'");
        }

        // Remove duplicates of a specific brand
        carList.removeDuplicate("Toyota");
        System.out.println("\nAfter removing duplicates of 'Toyota':");
        carList.printList();

        // Find the maximum brand in the list
        String maxBrand = carList.max();
        System.out.println("\nMaximum brand in the list: " + maxBrand);

        // Create a copy of the linked list
        CarLinkedList copiedList = carList.copy();
        System.out.println("\nCopied list:");
        copiedList.printList();

    }
}