import java.util.Scanner;

public class palindrome {
    public static void main (String[] args)
    {
        Scanner obj = new Scanner(System.in);
    System.out.println("Enter string");
    String str = obj.nextLine();
    String rev="";
    for(int i=str.length()-1;i>=0;i--)
{
    rev+=str.charAt(i);
    System.out.println("Reverse is " +rev);
}
if(str.equals(rev))
    System.out.println("palindrome");
else
    System.out.println("Not palindrome");
    }
}
