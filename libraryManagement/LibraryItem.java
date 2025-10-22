package libraryManagement;

public abstract class LibraryItem {
    protected String title;
    protected String id;

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public abstract void displayInfo();
}
