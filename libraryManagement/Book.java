package libraryManagement;

public class Book extends LibraryItem {
    private String author;

    public Book(String title, String id, String author) {
        super(title, id);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + title + " | ID: " + id + " | Author: " + author);
    }
}
