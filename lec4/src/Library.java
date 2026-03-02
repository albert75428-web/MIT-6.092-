import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Library {
    // Add the missing implementation to this class
    String address;
    public static double timebegin=9;
    public static double timeend=5;
    ArrayList<Book> books;
    public Library(String address) {
        this.address = address;
        this.books = new ArrayList<>();
    }
    public static void printOpeningHours()
    {
        System.out.println(timebegin+"a.m to "+timeend+"p.m");
    }
    public void printAddress()
    {
        System.out.println(this.address);
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void borrowBook(String name) {
        for(Book book:books)
        {
            if(Objects.equals(book.title, name) && !book.borrowed)
            {
                System.out.println("you can borrow this book : "+book.title);
                book.borrowed=true;
                return;
            }
            if(Objects.equals(book.title, name))
            {
                System.out.println("this book "+book.title+" is already borrowed");
                return;
            }
        }
        System.out.println("we don't have this book");

    }
    public void printAvailableBooks() {
        for(Book book:books)
        {
            if(!book.borrowed)
            {
                System.out.println("you can borrow this book : "+book.title);
            }
        }
    }
    public void returnBook(String name) {
        for(Book book:books)
        {
            if(book.title==name)
            {
                book.borrowed=false;
            }
        }
    }
    public static void main(String[] args) {
// Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
// Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
// Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
// Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
// Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();// Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();
// Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}