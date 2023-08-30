import java.util.*;
import java.util.concurrent.*;

public class MultiBuffer <T>{

    private final BlockingQueue<T>[] set;

    private int size;

    public MultiBuffer(int n)
    {
        this.set = new LinkedBlockingQueue[n];
        for(int i = 0; i < n; i++)
            this.set[i] = new LinkedBlockingQueue<T>();
        this.size = n;
    }

    public void insert(T obj) throws InterruptedException {
        int min = Integer.MAX_VALUE;
        int min_queue = 0;
        synchronized (set)
        {
            for(int i = 0; i < this.size; i++)
            {
                if(set[i].size() <= min)
                {
                    min = set[i].size();
                    min_queue = i;
                }
            }
        }
        set[min_queue].put(obj);
    }

    public T take(int i) throws InterruptedException {
        if(i < 0 || i >= this.size)
            throw new IllegalArgumentException();
        return set[i].take();
    }
}
