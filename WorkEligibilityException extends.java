import java.util.*;
class WorkEligibilityException extends Exception {
    public WorkEligibilityException(String message) {
        super(message);
    }
}

public class EligibilityCheck {
    public static void main(String[] args) {
        int age = 15; // You can change this value to test

        try {
            checkEligibility(age);
        } catch (WorkEligibilityException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }

    // Step 2: Method to check the condition and throw the exception
    public static void checkEligibility(int age) throws WorkEligibilityException {
        if (age <= 18) {
            // Throwing the specific message requested in the prompt
            throw new WorkEligibilityException("You are eligible to work.");
        } else {
            System.out.println("Age is greater than 18. No exception thrown.");
        }
    }
}