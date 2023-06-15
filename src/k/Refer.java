package k;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import static java.lang.System.*;
public class Refer {
    public static void main(String args[]) throws Throwable{
        String str = new String("123");
        ReferenceQueue q = new ReferenceQueue();
        PhantomReference x =new PhantomReference(str, q);
        //WeakReference wr = new WeakReference(str, q);
        //str = null;
//        out.println(wr.get());
//        gc();
//        out.println(wr.get());
//        out.println(wr == q.poll());
        out.println(x.get());
        str = null;
        gc();
        Thread.sleep(2000);
        out.println(q.poll() == x);
    }
}

