package org.howard.edu.lsp.oopfinal.question2;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Using credit card payment
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");
        cart.setPaymentMethod(creditCard);
        cart.checkout(100.0);

        // Using PayPal payment
        PaymentStrategy payPal = new PayPalPayment("user@example.com");
        cart.setPaymentMethod(payPal);
        cart.checkout(50.0);

        // Using Bitcoin payment
        PaymentStrategy bitcoin = new BitcoinPayment("1AaBbCcDdEeFfGgHh");
        cart.setPaymentMethod(bitcoin);
        cart.checkout(75.0);
    }
}
