package ntou.cs.java2024;

class Shirt extends Clothing {
    String material;
    public Shirt(String name, double price, String size, String matereial) {
        super(name, price, size);
        this.material = matereial;
    }
    @Override
    public String toString() {
        return super.toString(0) + 
        " | Size: " + size + " | Material: " + material + 
        " | Subtotal: " + calculateProductItemPrice();
    }
}