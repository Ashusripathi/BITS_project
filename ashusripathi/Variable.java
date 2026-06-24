import java.util.Scanner;
public class Variable {
    public static void main(String args[]) {
        char ch = 'a';
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("The given value is Alaphabet");
        }
        if(ch>='0' && ch<='9'){
            System.out.println("The given value is Digit");
        }
            else{
                System.out.println("Special Character");
        }
        }
    }

