import java.util.*;
public class ForgetfulSet<T> {

    private Set<T> objects;

    private long ms;

    public ForgetfulSet(long ms)
    {
        this.ms = ms;
        this.objects= new HashSet<>();
        this.objects = Collections.synchronizedSet(this.objects);
    }

    public void add(T obj)
    {
        this.objects.add(obj);
        Thread t = new Thread()
        {
            @Override
            public void run()
            {
                try {
                    Thread.sleep(ms);
                } catch (InterruptedException e) {
                    return;
                }
                objects.remove(obj);
            }
        };
        t.start();
    }

    public boolean contains(T obj)
    {
        return this.objects.contains(obj);
    }


}
