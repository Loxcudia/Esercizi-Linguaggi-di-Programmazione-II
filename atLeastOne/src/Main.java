import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static void atLeastOne(int n, Runnable r)
    {
        if(n < 0)
            throw new IllegalArgumentException();
        if(n == 0)
            return;
        AtomicBoolean flag = new AtomicBoolean(false);
        Set<Thread> threads = new HashSet<>();
        threads = Collections.synchronizedSet(threads);
        for(int i = 0; i < n; i++)
        {
            Thread t = new Thread()
            {
                @Override
                public void run()
                {
                    r.run();
                    flag.set(true);
                }
            };
            threads.add(t);
        }
        for (Thread t : threads)
            t.start();
        while(!flag.get()) {}
    }

    public static void main(String[] args) {

    }
}