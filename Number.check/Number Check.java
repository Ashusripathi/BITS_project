import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int testCases = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        for (int i = 1; i <= testCases; i++) {
            System.out.print("Enter string for test case " + i + ": ");
            String input = sc.nextLine();

            // Regex ".*\\d.*" checks if there is at least one digit anywhere in the string
            if (input.matches(".*\\d.*")) {
                System.out.println("Result: The string contains numbers.");
            } else {
                System.out.println("Result: The string does not contain numbers.");
            }
        }
        
        sc.close();
    }
}