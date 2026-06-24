public class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
        public void sleep()
        {
    System.out.println("Animal is sleeping");
}
public void walking() {
System.out.println("Animal is walking");
}

public class Bird extends Animal{
   @Override
public void eat(){
        System.out.println("Bird is eating");
}
   @Override
    public void sleep()
    {
        System.out.println("Bird is sleeping");
    }
       @Override
public void walking()
{
System.out.println("Bird is walking");
}
public class TestAnimal
{
    public static void main(String[] args)
    {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.walking();
    }
}
}
}

