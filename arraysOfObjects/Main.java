package arraysOfObjects;

public class Main {
        public static void main(String[] args) {
           

            Car[] cars= {new Car("Ferrari", "Red"),
                         new Car("Porsche", "Black"),
                         new Car("Mercedes", "Gray")};

for (Car car: cars){
                car.color="White";
            }

            for (Car car: cars){
                car.drive();
            }
        }
}
