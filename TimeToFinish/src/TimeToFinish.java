import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class TimeToFinish {

    private Map<Thread, Long> timeToFinishMap;

    private long initialMs;

    private AtomicLong timeToFinishTotal;

    public TimeToFinish()
    {
        this.timeToFinishMap = new HashMap<>();
        this.timeToFinishMap = Collections.synchronizedMap(this.timeToFinishMap);
        this.timeToFinishTotal = new AtomicLong(0);
        this.initialMs = System.currentTimeMillis();
    }

    public void setEstimate(long ms)
    {
        long tmp = System.currentTimeMillis() + ms - this.initialMs;
        System.out.println(tmp);
        this.timeToFinishMap.put(Thread.currentThread(), tmp);
        synchronized (timeToFinishTotal)
        {
            if(tmp > this.timeToFinishTotal.get())
                this.timeToFinishTotal.set(this.timeToFinishTotal.get() + tmp);
        }
    }

    public long maxTimeToFinish()
    {
        return this.timeToFinishTotal.get();
    }

    @Override
    public String toString()
    {
        String tmp = new String();
        for (Thread t : timeToFinishMap.keySet())
        {
            tmp = t.toString() + " " + timeToFinishMap.get(t).toString() + "\n";
        }
        return tmp;
    }
}
