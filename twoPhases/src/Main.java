import java.util.*;
public class Main {

    public static void twoPhases(Iterable<Runnable> a, Iterable<Runnable> b)
    {
        Set<Thread> threads = new HashSet<>();
        threads = Collections.synchronizedSet(threads);
        int i = 0;
        for (Runnable r : a)
        {
            int finalI = i;
            Thread t = new Thread()
            {
                private int index = finalI;
                @Override
                public void run()
                {
                    int j = 0;
                    r.run();
                    for (Runnable r2 : b)
                    {
                        if(index == j)
                        {
                            r2.run();
                            return;
                        }
                        j++;
                    }
                }
            };
            threads.add(t);
            i++;
        }
        for (Thread t : threads)
            t.start();
    }

    public static void main(String[] args) {

    }
}