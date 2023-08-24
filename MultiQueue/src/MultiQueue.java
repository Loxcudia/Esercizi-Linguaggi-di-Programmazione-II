import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MultiQueue <T>{

    private Set<BlockingQueue<T>> queueSet;

    private int n;

    public MultiQueue(int n)
    {
        this.queueSet = new HashSet<>();
        this.n = n;
        for(int i = 0; i < n; i++)
        {
            BlockingQueue<T> x = new ArrayBlockingQueue<>(5);
            this.queueSet.add(x);
        }
        this.queueSet = Collections.synchronizedSet(this.queueSet);
    }

    public void add(T x) throws InterruptedException {
        int min = 0;
        for (BlockingQueue<T> queue : this.queueSet)
        {
            if(queue.size() == 0)
            {
                try
                {
                    queue.put(x);
                    return;
                }
                catch (InterruptedException e)
                {
                    return;
                }
            }
            if(queue.size() <= min)
                min = queue.size();
        }
        for (BlockingQueue<T> queue: queueSet)
        {
            if(queue.size() == min)
            {
                queue.put(x);
                return;
            }
        }
    }

    public T get(int i) throws InterruptedException {
        if(i < 0 || i >= this.n)
            throw new IllegalArgumentException();
        int counter = 0;
        for (BlockingQueue<T> queue : queueSet)
        {
            if(i == counter) {
                try {
                    return queue.take();
                } catch (InterruptedException e) {
                    return null;
                }
            }
            else
                counter++;
        }
        return null;
    }

}
