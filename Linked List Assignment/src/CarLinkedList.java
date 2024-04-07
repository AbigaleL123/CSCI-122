

public class CarLinkedList{
    private CarNode head;
    private CarNode tail;



    public void insertNode(Car car) {
        CarNode node = new CarNode(car);
        if(car == null){
            throw new IllegalArgumentException("Car can't be null");
        }

        if (head == null) {
            head = node;
        }
        else{
            tail.setNext(node);
        }
        tail = node;
    }


public CarNode searchNode(String brand) {
    if (brand == null) {
        throw new IllegalArgumentException("Brand cannot be null");
    }

    CarNode current = head;
    while (current != null) {
        if (current.getCar().getBrand().equals(brand)) {
            return current;
        }
        current = current.getNext();
    }
    return null; // Return null if the brand is not found
}

public CarLinkedList copy() {
    CarLinkedList newList = new CarLinkedList();
    CarNode current = head;

    while (current != null) {
        newList.insertNode(new Car(current.getCar())); // Creates a new Car object using the copy constructor
        current = current.getNext();
    }

    return newList;
}


public void removeDuplicate(String brand) {
    if (brand == null) {
        throw new IllegalArgumentException("Brand cannot be null");
    }

    CarNode current = head;
    CarNode previous = null;

    while (current != null) {
        if (current.getCar().getBrand().equals(brand)) {
            if (previous == null) {
                // If the duplicate node is the head node
                head = current.getNext();
            } else {
                // If the duplicate node is not the head node
                previous.setNext(current.getNext());
            }

            // Update the tail if the removed node was the tail
            if (current == tail) {
                tail = previous;
            }
            // Move to the next node
            current = current.getNext();
        } else {
            // Move to the next node
            previous = current;
            current = current.getNext();
        }
    }
}



public String max() {
    if (head == null) {
        return null; // Return null if the linked list is empty
    }

    String maxBrand = head.getCar().getBrand();
    CarNode current = head.getNext();

    while (current != null) {
        if (current.getCar().getBrand().compareTo(maxBrand) > 0) {
            maxBrand = current.getCar().getBrand();
        }
        current = current.getNext();
    }

    return maxBrand;
}



public void printList() {
    CarNode current = head;
    System.out.println("Linked List:");
    while (current != null) {
        System.out.println(current.getCar());
        current = current.getNext();
    }
}
}







