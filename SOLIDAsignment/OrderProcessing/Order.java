
package SOLIDAsignment.OrderProcessing;

import SOLIDAsignment.Application.Cart;
import SOLIDAsignment.Payment.PaymentMethod;

public class Order {
    private Cart cart;
    private PaymentMethod paymentMethod;

    public Order(Cart cart, PaymentMethod paymentMethod) {
        this.cart = cart;
        this.paymentMethod = paymentMethod;
    }

    public void processOrder(OrderProcessor orderProcessor) {
       
        orderProcessor.processOrder(this);

        System.out.println("Order processed!");
        paymentMethod.processPayment(cart.getTotalPrice());
    }
}
