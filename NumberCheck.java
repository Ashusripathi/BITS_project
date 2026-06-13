import java.util.Scanner;
public class NumberCheck {
    pu20blic static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int testCases = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= testCases; i++) {
            System.out.print("Enter string for test case " + i + ": ");
            String input = sc.nextLine();
            if (input.matches(".*\\d.*")) {
                System.out.println("Result: The string contains numbers.");
            } else{
                System.out.println("Result: The string does not contain numbers.");
            }
        }
        
        sc.close();
    }
}