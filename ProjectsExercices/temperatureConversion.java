package ProjectsExercices;
import java.util.Scanner;
public class temperatureConversion {
    public static void main(String[] args) {
        // temperature conversion program
        Scanner scanner = new java.util.Scanner(System.in);
        double temperature;
        double convertedTemperature;
        String choice;

        System.out.println("Temperature Conversion Program");
        System.out.println("Enter the temperature:");
        temperature = scanner.nextDouble();
        System.out.println("Convert to Celsius or Fahrenheit? (C or F)");
        choice = scanner.next().toUpperCase();

        convertedTemperature = (choice.equals("C")) ? (convertedTemperature = (temperature - 32) * 5 / 9) : (convertedTemperature = (temperature * 9 / 5) + 32);
        System.out.printf("Converted temperature: %.2f" + "*" + choice, convertedTemperature);
        scanner.close();
    }
    
}
