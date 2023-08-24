import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SharedCounter {

    private AtomicInteger counter;

    public SharedCounter()
    {
        this.counter = new AtomicInteger();
        this.counter.set(0);
    }

    public synchronized void incr()
    {
        this.counter.getAndIncrement();
    }

    public synchronized void decr()
    {
        if(this.counter.get() > 0)
            this.counter.getAndIncrement();
    }

    public void waitForValue(int n)
    {
        if(n == this.counter.get()) {}
        else
            while(n != this.counter.get()) {}
    }

}
