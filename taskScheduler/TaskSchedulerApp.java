import java.time.LocalDate;
import java.util.Scanner;

public class TaskSchedulerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        boolean running = true;

        System.out.println("Welcome to Task Scheduler!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Sort by Deadline");
            System.out.println("4. Sort by Priority");
            System.out.println("5. Filter by Category");
            System.out.println("6. Exit");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Deadline (YYYY-MM-DD): ");
                    LocalDate deadline = LocalDate.parse(scanner.nextLine());

                    System.out.print("Priority (LOW, MEDIUM, HIGH): ");
                    Priority priority = Priority.valueOf(scanner.nextLine().toUpperCase());

                    System.out.print("Category (WORK, PERSONAL, STUDY, HEALTH, OTHER): ");
                    Category category = Category.valueOf(scanner.nextLine().toUpperCase());

                    manager.addTask(new Task(title, deadline, priority, category));
                    break;

                case "2":
                    manager.displayAll();
                    break;

                case "3":
                    manager.sortByDeadline();
                    break;

                case "4":
                    manager.sortByPriority();
                    break;

                case "5":
                    System.out.print("Enter category: ");
                    Category cat = Category.valueOf(scanner.nextLine().toUpperCase());
                    manager.filterByCategory(cat);
                    break;

                case "6":
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
