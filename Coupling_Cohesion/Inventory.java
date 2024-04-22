import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Book> books;

    public Inventory() {
        this.books = new ArrayList<>();
    }

    // Add a book to the inventory
    public void addBook(Book book) {
        books.add(book);
    }

    // Remove a book from the inventory
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Display details of all books in the inventory
    public void displayInventory() {
        System.out.println("Inventory:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " - Rs." + book.getPrice());
        }
    }

    // Find and return a book by its title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    // Find and return a list of books by a specific author
    public List<Book> findBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    // Find and return a list of books within a specified price range
    public List<Book> findBooksByPriceRange(double minPrice, double maxPrice) {
        List<Book> booksInRange = new ArrayList<>();
        for (Book book : books) {
            if (book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
                booksInRange.add(book);
            }
        }
        return booksInRange;
    }
}
