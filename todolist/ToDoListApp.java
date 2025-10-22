package todolist;

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoListApp {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println(" Welcome to Your To-Do List!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View tasks");
            System.out.println("2. Add task");
            System.out.println("3. Remove task");
            System.out.println("4. Exit");
            System.out.print(" Your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    ArrayList<String> tasks = manager.getTasks();
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet.");
                    } else {
                        System.out.println("Your Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case "2":
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    manager.addTask(task);
                    System.out.println(" Task added.");
                    break;

                case "3":
                    ArrayList<String> currentTasks = manager.getTasks();
                    if (currentTasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.println("Your Tasks:");
                        for (int i = 0; i < currentTasks.size(); i++) {
                            System.out.println((i + 1) + ". " + currentTasks.get(i));
                        }
                        System.out.print(" Enter task number to remove: ");
                        try {
                            int index = Integer.parseInt(scanner.nextLine()) - 1;
                            if (index >= 0 && index < currentTasks.size()) {
                                manager.removeTask(index);
                                System.out.println(" Task removed.");
                            } else {
                                System.out.println("Invalid task number.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a valid number.");
                        }
                    }
                    break;

                case "4":
                    running = false;
                    System.out.println(" Goodbye!");
                    break;

                default:
                    System.out.println(" Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
