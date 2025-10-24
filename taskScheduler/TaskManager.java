import java.util.*;
import java.util.stream.Collectors;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added.");
    }

    public void displayAll() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        tasks.forEach(Task::display);
    }

    public void sortByDeadline() {
        tasks.stream()
            .sorted(Comparator.comparing(Task::getDeadline))
            .forEach(Task::display);
    }

    public void sortByPriority() {
        tasks.stream()
            .sorted(Comparator.comparing(Task::getPriority).reversed())
            .forEach(Task::display);
    }

    public void filterByCategory(Category category) {
        List<Task> filtered = tasks.stream()
            .filter(t -> t.getCategory() == category)
            .collect(Collectors.toList());

        if (filtered.isEmpty()) {
            System.out.println("No tasks in category: " + category);
        } else {
            filtered.forEach(Task::display);
        }
    }
}
