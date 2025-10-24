import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate deadline;
    private Priority priority;
    private Category category;

    public Task(String title, LocalDate deadline, Priority priority, Category category) {
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
        this.category = category;
    }

    public String getTitle() { return title; }
    public LocalDate getDeadline() { return deadline; }
    public Priority getPriority() { return priority; }
    public Category getCategory() { return category; }

    public void display() {
        System.out.printf("%s | %s | %s | %s\n",
            title, deadline, priority, category);
    }
}
