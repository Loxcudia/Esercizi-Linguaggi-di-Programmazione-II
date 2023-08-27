import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static <T> List<? extends T> mergeIfSorted(List<? extends T> a, List<? extends T> b, Comparator<? super T> c)
    {
        AtomicBoolean bool = new AtomicBoolean(false);
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                for(int i = 0; i < a.size(); i+=2)
                {
                    if(c.compare(a.get(i), a.get(i+1)) > 0)
                        bool.set(true);
                }
            }
        };

        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                for(int i = 0; i < b.size(); i+=2)
                {
                    if(c.compare(b.get(i), b.get(i+1)) > 0)
                        bool.set(true);
                }
            }
        };
        t1.start();
        t2.start();
        while(t1.isAlive() && t2.isAlive())
        {
            if(bool.get())
                return null;
        }
        List<T> newList = new ArrayList<>();
        newList.addAll(a);
        newList.addAll(b);
        newList.sort(c);
        return newList;
    }


    public static void main(String[] args) {

    }
}