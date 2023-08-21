/*
Si implementi una classe RunOnSet che esegue il metodo run di un oggetto RunnableWithArg su
tutti gli oggetti di una data collezione, contemporaneamente.
 */
import java.util.*;
public class RunOnSet<T> extends Thread{

    private RunnableWithArg<T> runnableWithArg;
    private Collection<T> collection;
    private ArrayList<Thread> threads;
    public RunOnSet(RunnableWithArg<T> runnableWithArg ,Collection<T> collection)
    {
        this.collection = collection;
        this.runnableWithArg = runnableWithArg;
        threads = new ArrayList<>();
    }

    @Override
    public void run()
    {
        for (T x : collection)
        {
            Thread t = new Thread()
            {
                private T tmp = x;
                @Override
                public void run()
                {
                    runnableWithArg.run(tmp);
                }
            };
            threads.add(t);
        }
        for (Thread t : threads)
            t.start();
    }
}
