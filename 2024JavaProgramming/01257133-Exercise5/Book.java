package ntou.cs.java2024;

class Book extends Product {
    String author;
    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }
    @Override
    public double calculateProductItemPrice() {
        return this.getPrice() * this.getQuantity() * 0.9;
    }
    @Override
    public String toString() {
        return super.toString() + 
        " | Author: " + author + 
        " | Subtotal: " + calculateProductItemPrice();
    }
    public String toString(int dummy) {
        return super.toString();
    }
}