import static java.lang.System.*;
public class Abstract {
    public static void main(String args[])
    {
        String[] name = new String[]{"123","565"};
        Integer b = 4;
        String a = Integer.toString(b);
        out.println(a);
        for(String names:name)
        {
            out.println(names);
        }
        Process c = new Process();
        c.process(new Command()
        {
            public void process()
            {
                out.println(12);
            }
        });

    }
}

interface Command
{
    void process();
}

class Process
{
    public void process(Command e)
    {
        e.process();
    }
}
