import static java.lang.System.*;
import java.util.Scanner;
public class Test1 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(in);
        int a=input.nextInt();
        out.println(a);
    }
}
class Person
{
    public String name;
    public Person(String name)
    {
        this.name=name;
    }
}
class TempPerson
{
    public Person tmp;
    public TempPerson(Person tmp)
    {
        this.tmp=tmp;
    }
}


