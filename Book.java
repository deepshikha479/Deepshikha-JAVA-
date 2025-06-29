public class Book {
    String title, author;
    double price;

    // Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display details
    void display() {
        System.out.println(title + " by " + author + " - Rs." + price);
    }

    public static void main(String[] args) {
        Book b = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 299.0);
        b.display();
    }
}
