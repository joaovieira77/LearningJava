package GradebookSystem;

import java.util.Scanner;

public class GradebookApp {
    public static void main(String[] args) {
        Gradebook gradebook = new Gradebook();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Student Gradebook System!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. View Student Grades");
            System.out.println("4. View All Students");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    gradebook.addStudent(new Student(name, id));
                    break;

                case "2":
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    Student student = gradebook.findStudentById(studentId);
                    if (student != null) {
                        System.out.print("Enter subject name: ");
                        String subjectName = scanner.nextLine();
                        System.out.print("Enter grade: ");
                        double grade = Double.parseDouble(scanner.nextLine());
                        student.addSubject(new Subject(subjectName, grade));
                        System.out.println("Grade added.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case "3":
                    System.out.print("Enter student ID: ");
                    String viewId = scanner.nextLine();
                    Student s = gradebook.findStudentById(viewId);
                    if (s != null) {
                        s.displayGrades();
                        System.out.printf("Average Grade: %.2f\n", s.getAverageGrade());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case "4":
                    gradebook.displayAllStudents();
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
