package GradebookSystem;

import java.util.ArrayList;

public class Gradebook {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("✅ Student added: " + student.getName());
    }

    public Student findStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) return s;
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("📭 No students enrolled.");
        } else {
            System.out.println("🎓 Student List:");
            for (Student s : students) {
                System.out.println("- " + s.getName() + " (ID: " + s.getId() + ")");
            }
        }
    }
}
