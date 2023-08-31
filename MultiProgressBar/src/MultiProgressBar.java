import java.util.*;
public class MultiProgressBar {

    private int n_thread;

    private Map<Thread, Integer> threadStates;

    private Integer minProgress;

    public MultiProgressBar(int n)
    {
        this.n_thread = n;
        this.threadStates = new HashMap<>(n);
        this.threadStates = Collections.synchronizedMap(this.threadStates);
        this.minProgress = Integer.MAX_VALUE;
    }

    public void progress(int n)
    {
        if(n < 0 || n > 100)
            throw new IllegalArgumentException();
        if(!threadStates.containsKey(Thread.currentThread()))
        {
            if(threadStates.keySet().size() + 1 > this.n_thread)
                throw new IllegalArgumentException();
            else
            {
                threadStates.put(Thread.currentThread(), n);
                synchronized (this.minProgress)
                {
                    if(n < this.minProgress)
                        this.minProgress = n;
                }
            }
        }
        else
        {
            if(n < threadStates.get(Thread.currentThread()))
                throw new IllegalArgumentException();
            else
            {
                threadStates.put(Thread.currentThread(), n);
                synchronized (this.minProgress)
                {
                    if(n < this.minProgress)
                        this.minProgress = n;
                }
            }
        }
    }

    public int getProgress()
    {
        return this.minProgress;
    }
}
