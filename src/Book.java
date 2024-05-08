import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    // data field or property
    private String name;
    private double price;
    private String author;

    Book() {
    }   // default constructor

    Book(String name, String author, double price) {  // parameterized constructor
        this.author = author;
        this.name = name;
        this.price = price;
    }

    // ArrayList to store data of book in it
    static ArrayList<Book> books = new ArrayList<>();

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // method to display all book
    public static void displayAllBook() {
        ArrayList<Book> booksList = Book.books;
        if (booksList.isEmpty()) {
            System.out.println("there is no data");
        } else {
            for (Book book : booksList) {
                System.out.println("name        author        price");
                System.out.println();
                System.out.println(book.getName() + "        "
                        + book.getAuthor() + "        "
                        + book.getPrice());
            }
        }
    }

    // method to add new books
    public static void addBooks(Scanner input) {
        System.out.println("Enter the count of books : ");
        int bookCount = input.nextInt();
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Enter the book " + (i + 1) + " name");
            String bookName = input.next();
            System.out.println("Enter the book " + (i + 1) + " author");
            String bookAuthor = input.next();
            System.out.println("Enter the book " + (i + 1) + " price");
            double bookPrice = input.nextDouble();

            Book b = new Book(bookName, bookAuthor, bookPrice);
            Book.books.add(b);
        }
    }

    // method to get the book object by its name
    public static Book getBookByName(String bookName) {
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
                return book;
            }
        }
        return null;
    }
}

