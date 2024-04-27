package ntou.cs.java2024;

class Novel extends Book {
    String genre;
    public Novel(String name, double price, String author, String genre) {
        super(name, price, author);
        this.genre = genre;
    }
    @Override
    public String toString() {
        return super.toString(0) + 
                " | Author: " + author + " | Genre: " + genre + 
                " | Subtotal: " + calculateProductItemPrice();
    }
}