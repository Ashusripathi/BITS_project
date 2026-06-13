import java.util.Scanner;

public class DivisionHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            
            int result = a / b;  // This line throws ArithmeticException if b = 0
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            // Custom message for division by zero
            System.out.println("Error: you cannot divide by zero");
            
        } catch (Exception e) {
            // Custom message for other input errors like entering text instead of number
            System.out.println("Error: invalid input. Please enter numbers only");
            
        } finally {
            sc.close();  // Good practice to close scanner
            System.out.println("Program ended");
        }
    }
}