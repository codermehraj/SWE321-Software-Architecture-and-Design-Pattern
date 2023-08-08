package SOLIDAsignment.Payment;

public class BkashPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Bkash payment processed.");
    }
}
