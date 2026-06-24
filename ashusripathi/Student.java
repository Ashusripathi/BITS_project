import java.util.*;
class Student{
    Student() 
    {
        System.out.println("default Constructor");
    }
    Student(String s)
    {
        System.out.println("My Name is" + s);
    }
    public static void main(String args[])
    {
        Student obj1 = new Student();
        Student obj2 = new Student("ASHU");
        
    }
}
    


