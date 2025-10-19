package constructor;

public class Student {
    String name;
    int age;
    Double gpa;
    Boolean isEnrolled;

    Student(String name, int age, double gpa){

        this.name = name;

        this.age = age;

        this.gpa = gpa;

        this.isEnrolled = true;

    }



    void study(){

        System.out.println(this.name + " is studying");

    }

}
