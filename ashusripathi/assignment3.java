import java.util.Scanner;
class assignment3
{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char ch1=sc.next().charAt(0);
    char x=sc.next().charAt(0);
    if(ch1<x)
    {
        System.out.println(ch1+ " " +x);
    }
    else
        System.out.println(x+ " " +ch1);
    }
}