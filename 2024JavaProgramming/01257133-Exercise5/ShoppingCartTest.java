package ntou.cs.java2024;

public class ShoppingCartTest {
    public static void main(String[] args) {
        // Create some products
        Product novel = new Novel("The Great Gatsby", 15.99, "F. Scott Fitzgerald", "Classic");
        Product shirt = new Shirt("Striped T-Shirt", 29.99, "M", "Cotton");
        Product book = new Book("Java Programming", 49.99, "John Doe");
        Product jeans = new Clothing("Blue Jeans", 39.99, "L");

        // Add products to the shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(novel, 2); // Adding 2 novels
        cart.addItem(shirt, 3); // Adding 3 shirts
        cart.addItem(book, 1); // Adding 1 book
        cart.addItem(jeans, 2); // Adding 2 pairs of jeans

        // Calculate total price before discount
        double totalPriceBeforeDiscount = cart.calculateTotalPrice();
        System.out.printf("Total Price before Discount: $%.2f%n", totalPriceBeforeDiscount);

        // Apply 20% discount
        double discountedPrice = cart.applyDiscount(20);
        System.out.printf("Total Price after Discount: $%.2f%n", discountedPrice);
    }
}
