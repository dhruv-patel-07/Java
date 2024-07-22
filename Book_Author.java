

// Author
class Author {
    private String firstName;
    private String lastName;

    // Constructor with parameters
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // toString method
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

class Book {
    private String title;
    private Author author;
    private double price;

    // Constructor with parameters
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // toString method
    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price;
    }
}

public class Book_Author {
    public static void main(String[] args) {
        // Create an author
        Author author1 = new Author("John", "Doe");

        // Create a book using the author created above
        Book book1 = new Book("Java Programming", author1, 29.99);

        // Display book details
        System.out.println(book1);
    }
}


