package libraryManagement;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String id, int issueNumber) {
        super(title, id);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: " + title + " | ID: " + id + " | Issue: " + issueNumber);
    }
}
