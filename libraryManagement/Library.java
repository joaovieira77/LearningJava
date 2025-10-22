package libraryManagement;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item added: " + item.getTitle());
    }

    public void removeItem(String id) {
        items.removeIf(item -> item.getId().equals(id));
        System.out.println("Item with ID " + id + " removed.");
    }

    public void displayAllItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the library.");
        } else {
            System.out.println("Library Collection:");
            for (LibraryItem item : items) {
                item.displayInfo();
            }
        }
    }
}
