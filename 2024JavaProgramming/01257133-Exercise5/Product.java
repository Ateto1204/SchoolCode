package ntou.cs.java2024;

public abstract class Product {
    private final String name;
    private final double price;
    private int quantity;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateProductItemPrice();

    @Override
    public String toString() {
        return "Product: " + name + " | Price: $" + price + " | Quantity: " + quantity;
    }
}