package GradebookSystem;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Subject> subjects = new ArrayList<>();

    public Student(String name, String id) {
        super(name, id);
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void displayGrades() {
        System.out.println(" Grades for " + name + ":");
        for (Subject s : subjects) {
            System.out.println("- " + s.getName() + ": " + s.getGrade());
        }
    }

    public double getAverageGrade() {
        if (subjects.isEmpty()) return 0;
        double total = 0;
        for (Subject s : subjects) {
            total += s.getGrade();
        }
        return total / subjects.size();
    }
}
