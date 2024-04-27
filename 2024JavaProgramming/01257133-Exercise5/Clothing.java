package ntou.cs.java2024;

class Clothing extends Product {
    String size;
    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }
    @Override
    public double calculateProductItemPrice() {
        return this.getPrice() * this.getQuantity();
    }
    @Override
    public String toString() {
        return super.toString() + 
                " | Size: " + size + " | Subtotal: " + calculateProductItemPrice();
    }
    public String toString(int dummy) {
        return super.toString();
    }
}