package SOLIDAsignment.OrderProcessing;

public class InStoreOrderProcessor implements OrderProcessor {

    @Override
    public void processOrder(Order order) {
        System.out.println("In-store order processed.");
    }

}
