
import java.util.Scanner;
public class compoundInterest {
    
    public static void main(String[] args) {
    // compound interest calculation program    
    Scanner scanner = new Scanner(System.in);
    double principal;   
    double rate;   
    int timesCompounded;
    int years;
    double amount;

    System.out.println("Compound Interest Calculation Program");
    System.out.print("Enter the principal amount: ");   
    principal = scanner.nextDouble();
    System.out.print("Enter the annual interest rate (in %): ");    
    rate = scanner.nextDouble() / 100;
    System.out.print("Enter the number of times interest is compounded per year: ");
    timesCompounded = scanner.nextInt();
    System.out.print("Enter the number of years the money is invested: ");
    years = scanner.nextInt();
    amount = principal * Math.pow((1 + rate / timesCompounded), timesCompounded * years);
    System.out.printf("The amount after %d years is: %.2f\n", years, amount);
    scanner.close();
        
}
}
