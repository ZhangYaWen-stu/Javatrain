import static java.lang.System.*;
public class Static {
    public static void main(String args[]) {
        String test = new String("135");
        String test1 = new String("135");
        out.println(test.hashCode());
        out.println(test1.hashCode());
    }
}
class People
{
    protected final String name;
    {
        this.name="12";
    }
    People()
    {

    }
    public final String getName()
    {
        return name;
    }

}
class Student extends People
{
//    public String getName()
//    {
//        return super.name;
//    }
//    public String getName(String name)
//    {
//        return name;
//    }
}

class Cow
{
    public static CowLeg a;
    public static int length;
//    static
//    {
//        a = new CowLeg();
//    }
    class CowLeg
    {
        public int getLength()
        {
            return length;
        }
    }

}
