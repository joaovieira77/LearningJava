package inehritance;

public class Main {
    public static void main(String[] args) {



        // Inheritance = One class inherits the attributes and methods

        //                         from another class.
        //                         Child <- Parent <- Grandparent



        Dog dog = new Dog();

        Cat cat = new Cat();

        Plant plant= new Plant();
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);
        plant.photosynthesize();
        dog.speak();
        cat.speak();
        dog.eat();
        cat.eat();
        

}
}