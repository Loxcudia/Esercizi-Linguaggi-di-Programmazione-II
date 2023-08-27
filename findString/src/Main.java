import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static boolean findString(String x, String[] a)
    {
        AtomicBoolean boolt1 = new AtomicBoolean(false);
        AtomicBoolean boolt2 = new AtomicBoolean(false);
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                for(int i = 0; i < a.length; i++)
                {
                    if(x.compareTo(a[i]) == 0)
                    {
                        boolt1.set(true);
                    }
                }
            }
        };

        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                for(int i = 0; i < a.length; i++)
                {
                    if(x.length() == a[i].length())
                        boolt2.set(true);
                }
            }
        };

        t1.start();
        t2.start();
        while(t1.isAlive() || t2.isAlive())
        {
            if(!boolt2.get())
            {
                t1.interrupt();
                return false;
            }
            if(!boolt1.get())
            {
                t2.interrupt();
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}