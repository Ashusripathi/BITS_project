// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class EligibilityCheck {
   public EligibilityCheck() {
   }

   public static void main(String[] var0) {
      byte var1 = 15;

      try {
         checkEligibility(var1);
      } catch (WorkEligibilityException var3) {
         System.out.println("Exception Caught: " + var3.getMessage());
      }

   }

   public static void checkEligibility(int var0) throws WorkEligibilityException {
      if (var0 <= 18) {
         throw new WorkEligibilityException("You are eligible to work.");
      } else {
         System.out.println("Age is greater than 18. No exception thrown.");
      }
   }
}
