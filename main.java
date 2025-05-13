import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book(1, "Java Programming", "James Gosling", true));
        library.addBook(new Book(2, "Data Structures", "Robert Lafore", true));

        library.addUser(new User(101, "Tejesh Reddy Karne"));

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Display Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            if (choice == 1) {
                library.displayBooks();
            } else if (choice == 2) {
                System.out.print("Enter Book ID to borrow: ");
                int bookId = scanner.nextInt();
                library.borrowBook(bookId);
            } else if (choice == 3) {
                System.out.print("Enter Book ID to return: ");
                int bookId = scanner.nextInt();
                library.returnBook(bookId);
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
        scanner.close();
    }
}
