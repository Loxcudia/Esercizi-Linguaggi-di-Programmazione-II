/*
Implementare il metodo statico parallelMax, che accetta due iteratori e un comparatore, e resti-
tuisce l’elemento massimo, secondo il comparatore, tra tutti quelli restituiti dai due iteratori. Il
metodo deve usare due thread in parallelo: ciascuno scorre uno dei due iteratori.
Prestare particolare attenzione alla scelta della firma del metodo.
 */
import java.util.*;
public class Main {

    public static <T> T parallelMax(Iterator<? extends T> it1, Iterator<? extends T> it2, Comparator<? super T> comparator)
    {
        T[] maxs = (T[])new Object[2];
        maxs[0] = null;
        maxs[1] = null;
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                if(it1.hasNext())
                    maxs[0] = it1.next();
                while(it1.hasNext())
                {
                    T tmp = it1.next();
                    if(comparator.compare(maxs[0], tmp) < 0)
                        maxs[0] = tmp;
                }
            }
        };
        Thread t2 = new Thread()
        {
              @Override
              public void run()
              {
                  if(it2.hasNext())
                      maxs[1] = it2.next();
                  while(it2.hasNext())
                  {
                      T tmp = it2.next();
                      if(comparator.compare(maxs[1], tmp) < 0)
                          maxs[1] = tmp;
                  }
              }
        };
        t1.start();
        t2.start();
        while(maxs[0] == null || maxs[1] == null) {}
        if(comparator.compare(maxs[0], maxs[1]) < 0)
            return maxs[1];
        else if(comparator.compare(maxs[0], maxs[1]) > 0)
            return maxs[0];
        else
            return maxs[0];
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> l2 = Arrays.asList(6,7,8,8,10);
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2)
                    return 1;
                else if(o1 < o2)
                    return -1;
                else
                    return 0;
            }
        };
        Integer max = parallelMax(l1.iterator(), l2.iterator(), comparator);
        System.out.println(max);
    }
}