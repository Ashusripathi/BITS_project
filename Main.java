import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //T no of test cases
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            //Size of ArrayList
        int ArrLisSize= sc.nextInt();
        //ArrayList Declaration
    ArrayList<Integer> arr=new ArrayList<>();
    //adding values into ArrayList
    for(int i=0;i<ArrLisSize;i++)
    {
        int va1 = sc.nextInt();
        arr.add(va1);
    }
    //printing max value from ArrayList
    System.out.println(Collections.max(arr));
}
    
    }
}
