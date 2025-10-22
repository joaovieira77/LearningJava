package libraryManagement;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Library Management System!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Remove Item");
            System.out.println("4. View All Items");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    library.addItem(new Book(bookTitle, bookId, author));
                    break;

                case "2":
                    System.out.print("Enter magazine title: ");
                    String magTitle = scanner.nextLine();
                    System.out.print("Enter magazine ID: ");
                    String magId = scanner.nextLine();
                    System.out.print("Enter issue number: ");
                    int issue = Integer.parseInt(scanner.nextLine());
                    library.addItem(new Magazine(magTitle, magId, issue));
                    break;

                case "3":
                    System.out.print("Enter item ID to remove: ");
                    String removeId = scanner.nextLine();
                    library.removeItem(removeId);
                    break;

                case "4":
                    library.displayAllItems();
                    break;

                case "5":
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
