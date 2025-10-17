import java.util.Scanner;
public class calculator { 
    public static void main(String[] args) {
        // simple calculator program
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Simple Calculator Program");
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("Result: %.2f\n", result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("Result: %.2f\n", result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("Result: %.2f\n", result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("Result: %.2f\n", result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '^':
                result = Math.pow(num1, num2);
                System.out.printf("Result: %.2f\n", result);
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }

        scanner.close();
    }
    
}
