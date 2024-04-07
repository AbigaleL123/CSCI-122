

public class CarNode{
    private Car car;
    private CarNode next;

    public CarNode(Car car) {
        this.setCar(car);
        this.next = null;
    }

    public Car getCar() {
        return car;
    }



    public void setCar(Car car) {
        this.car = car;
    }

    public CarNode getNext() {
        return next;
    }

    public void setNext(CarNode next) {
        this.next = next;
    }



    // Method to remove the node after the current node
    public void removeNode(CarNode node){
        if(node == null) {
            throw new IllegalArgumentException("node cant be null");

        }
    }


}