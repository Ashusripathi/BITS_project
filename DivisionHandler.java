import java.util.Scanner;

public class DivisionHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Attempting division
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Custom message for division by zero
            System.out.println("Error: You cannot divide by zero!");
        } catch (Exception e) {
            // Custom message for other input errors
                System.out.println("Error: Invalid input provided.");
        } finally {
            scanner.close();
        }
    }
}                                                                                                                                                                                                                                                                                                  ij//