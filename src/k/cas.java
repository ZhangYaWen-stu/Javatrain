package k;

import static java.lang.System.out;

public class cas {
    public static void main(String args[])
    {
        Student a = new Student();
        out.println(a.age);
        People l = (People)a;
        out.println(l.age);
        out.println(a);
        a.getName();
        l.getName();
    }
}
class People
{
    public int age;

    People()
    {
        age = 5;
    }
    void getName()
    {
        out.println("People");
    }
}
class Student extends People{
    public int age;
    Student()
    {
        age = 0;
    }
    public String toString()
    {
        return "12";
    }
    public void getName()
    {
        out.println("Student");
    }

}

