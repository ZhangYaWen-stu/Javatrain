package k;
import static java.lang.System.*;
public class Human {
    private class HumanHead
    {
        public String getName()
        {
            return  name;
        }
    }
    private HumanHead head;
    private String name;
    Human(){name = "zd";}
    public HumanHead getHead(){return new HumanHead();}
    public static void main(String args[])
    {
        Human k = new Human();
        out.println(k.getHead().getName());
    }
}

