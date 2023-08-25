import java.util.concurrent.atomic.AtomicInteger;

public class PeriodicExecutor {

    private int limit;

    private AtomicInteger counter;

    public PeriodicExecutor(int limit)
    {
        this.limit = limit;
        this.counter = new AtomicInteger();
        this.counter.set(0);
    }

    public void addTask(Runnable r, long x) throws InterruptedException {
        while(true)
        {
            Thread t = new Thread(r);
            while(this.counter.get() + 1 > limit) {}
            synchronized (counter)
            {
                System.out.println("Incremento");
                this.counter.getAndIncrement();
            }
            t.start();
            while(t.isAlive()) {}
            synchronized (counter)
            {
                System.out.println("Decremento");
                this.counter.decrementAndGet();
            }
            try {
                Thread.sleep(x);
            }
            catch (InterruptedException e)
            {
                return;
            }
        }
    }

}
