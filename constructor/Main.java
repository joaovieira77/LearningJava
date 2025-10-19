package constructor;

public class Main {

    public static void main(String[] args) {



        // constructor = A special method to initialize objects

        //                         You can pass arguments to a constructor

        //                         and set up initial values



        Student student1 = new Student("Oliver", 20, 3.2);

        Student student2 = new Student("Benji", 44, 1.5);

        Student student3 = new Student("Mark", 27, 4.0);



        System.out.println("Name: " + student1.name);

        System.out.println("Age: " + student1.age);

        System.out.println("GPA: " + student1.gpa);

        System.out.println("Enrolled: " + student1.isEnrolled);



        System.out.println("Name: " + student2.name);

        System.out.println("Age: " + student2.age);

        System.out.println("GPA: " + student2.gpa);

        System.out.println("Enrolled: " + student2.isEnrolled);



        System.out.println("Name: " + student3.name);

        System.out.println("Age: " + student3.age);

        System.out.println("GPA: " + student3.gpa);

        System.out.println("Enrolled:" + student3.isEnrolled);

        

        student1.study();

        student2.study();

        student3.study();

    }

}
