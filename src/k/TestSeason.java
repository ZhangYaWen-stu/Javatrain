package k;
import static java.lang.System.*;
public class TestSeason {
    public static void main(String args[]) throws Throwable
    {
        Season a = Enum.valueOf(Season.class,"SPRING");
        out.println(a.toString()+" "+ Season.FALL.toString());
        Season b = Enum.valueOf(Season.class,"SPRING");
        a.name = "Spring";
        b.name = "FALL";
        Thread.sleep(5000);
        out.println(a.name);
        out.println(b.name);
        out.println(a.infoDetail());
        out.println(a.info());
    }
}
