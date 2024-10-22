package strategyPattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(120000.00);

        // Pay with PayPal
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(930000.00);
    }
}

