package statePattern;

public class ShippedOrderState implements State {
    private Order order;

    public ShippedOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is already paid and shipped.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order is already shipped.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order delivered.");
        order.setState(order.getDeliveredState());
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cannot be cancelled after shipment.");
    }
}
