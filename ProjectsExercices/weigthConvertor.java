import java.util.Scanner;
  
public class weigthConvertor {
    public static void main(String[] args) {
    // weight conversion program
    Scanner scanner = new Scanner(System.in);
    double weight;
    double newWeight;
    int choice;

    System.out.println("Weight Conversion Program");
    System.out.println("1. Pounds to Kilograms");
    System.out.println("2. Kilograms to Pounds");
    System.out.print("Enter your choice (1 or 2): ");
    choice = scanner.nextInt();

    if (choice == 1) {
        System.out.print("Enter weight in pounds: ");
        weight = scanner.nextDouble();
        newWeight = weight * 0.453592;
        System.out.printf("Weight in kilograms: %.2f\n", newWeight);
    } else if (choice == 2) {
        System.out.print("Enter weight in kilograms: ");
        weight = scanner.nextDouble();
        newWeight = weight / 0.453592;
        System.out.printf("Weight in pounds: %.2f\n", newWeight);
    } else {
        System.out.println("Invalid choice.");
    }

  scanner.close();
}
}
