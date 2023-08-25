import java.util.*;
public class SharedTotal {

    private long timeout;

    private Map<Thread, Double> vals;

    private Map<Thread, Boolean> setFlags;

    public SharedTotal(long ms)
    {
        this.timeout = ms;
        this.vals = new HashMap<>();
        this.vals = Collections.synchronizedMap(this.vals);
        this.setFlags = new HashMap<>();
        this.setFlags = Collections.synchronizedMap(this.setFlags);
        this.setFlags.put(Thread.currentThread(), false);
    }

    public double setValAndReceiveTot(double n) throws InterruptedException {
        if (this.setFlags.get(Thread.currentThread()))
            throw new IllegalCallerException();
        this.setFlags.put(Thread.currentThread(), true);
        this.vals.put(Thread.currentThread(), n);
        try {
            Thread.sleep(this.timeout);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        double sum = 0;
        synchronized (vals) {
            for (Double x : this.vals.values()) {
                sum += x;
            }
        }
        return sum;
    }
}
