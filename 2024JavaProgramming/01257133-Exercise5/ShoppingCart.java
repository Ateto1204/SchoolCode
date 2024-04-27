package ntou.cs.java2024;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        product.setQuantity(quantity);
        System.out.println(product);
        
        items.add(product);
    }

    public double calculateTotalPrice() {
        // TODO
        double totalPrice = 0;
        for (Product product : items) {
            totalPrice += product.calculateProductItemPrice();
        }
        return totalPrice;
    }

    public double applyDiscount(double discountPercentage) {
        // TODO
        double discountedPrice = calculateTotalPrice();
        discountedPrice *= (100-discountPercentage);
        discountedPrice /= 100.0;
        return discountedPrice;
    }
}
