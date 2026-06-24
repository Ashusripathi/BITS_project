import java.util.Scanner;
public class integer {
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a Integer Number");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("The given integer is Positive");
        }
        else if(number < 0) { 
            System.out.println("The given integer is Negative");
        }
        else{
            System.out.println("The given number is zero");
        }
        sc.close();
    }
}
        