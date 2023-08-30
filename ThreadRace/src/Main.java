import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static int threadRace(Runnable r1, Runnable r2) throws InterruptedException {
        AtomicLong timet1 = new AtomicLong(0);
        AtomicLong timet2 = new AtomicLong(0);
        Object obj1 = new Object();
        Object obj2 = new Object();
        Thread t1 = new Thread()
        {
            private final AtomicLong x = timet1;
            private final Object o1 = obj1;
            @Override
            public void run()
            {
                r1.run();
                x.set(System.currentTimeMillis());
                synchronized (o1)
                {
                    o1.notify();
                }
            }
        };
        Thread t2 = new Thread()
        {
            private final AtomicLong y = timet2;
            private final Object o2 = obj2;
            @Override
            public void run()
            {
                r2.run();
                y.set(System.currentTimeMillis());
                synchronized (o2)
                {
                    o2.notify();
                }
            }
        };
        t1.start();
        t2.start();
        synchronized (obj1)
        {
            obj1.wait();
        }
        synchronized (obj2)
        {
            obj2.wait();
        }
        if(timet1.get() < timet2.get())
            return 1;
        else
            return 2;
    }

    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = () -> {System.out.println("sono il primo runnable");};
        Runnable r2 = () -> {System.out.println("sono il secondo runnable");};
        System.out.println(threadRace(r1, r2));
    }
}