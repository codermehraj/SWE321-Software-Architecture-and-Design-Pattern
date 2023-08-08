package SOLIDAsignment.Application;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product p : items) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

    public void displayCart() {
        for (Product p : items) {
            System.out.println(p);
        }
    }

    public void clearCart() {
        items.clear();
    }

}
