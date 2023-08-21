/*
Implementare il metodo statico executeInParallel, che accetta come argomenti un array di
oggetti di tipo Runnable e un numero naturale k, ed esegue tutti i Runnable dell'array, k alla volta.
In altre parole, all'inizio il metodo fa partire in parallelo i primi k Runnable dell'array.
Poi, non appena uno dei Runnable in esecuzione termina, il metodo ne fa partire un altro, preso
dall'array, fino ad esaurire tutto l'array.
Risolvere l'esercizio senza utilizzare attesa attiva.
 */
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void executeInParallel(Runnable[] runnables, Integer k) throws InterruptedException {
        if(k <= 0)
            return;
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(k);
        List<Thread> threads = new ArrayList<>();
        for(int i = 0; i < threads.size(); i++)
        {
            int finalI = i;
            Thread t = new Thread()
            {
                int index = finalI;

                @Override
                public void run()
                {
                    try {
                        queue.put(runnables[index]);
                    } catch (InterruptedException e) {
                        return;
                    }
                    runnables[index].run();
                    queue.remove(runnables[index]);
                }
            };
            threads.add(t);
        }
        for (Thread t : threads)
            t.start();
    }


    public static void main(String[] args) {

    }
}