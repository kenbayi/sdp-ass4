package statePattern;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Transition through order states
        order.payOrder();     // Pay for the order
        order.shipOrder();    // Ship the order
        order.deliverOrder(); // Deliver the order

        // Trying to cancel after delivery
        order.cancelOrder();  // Cannot cancel after delivery
    }
}

