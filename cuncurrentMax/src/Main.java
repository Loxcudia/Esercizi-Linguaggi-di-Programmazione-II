import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.*;
public class Main {

    public static int concurrentMax(int [][] matrix) throws InterruptedException {
        AtomicInteger max = new AtomicInteger(Integer.MIN_VALUE);
        List<Thread> threadList = new ArrayList<>();
        threadList = Collections.synchronizedList(threadList);
        Object x = new Object();
        for(int i = 0; i < matrix.length; i++)
        {
            int [] array = new int[matrix[i].length];
            array = matrix[i];
            int[] finalArray = array;
            Object object = x;
            Thread t = new Thread()
            {
                @Override
                public void run()
                {
                    int massimo = Integer.MIN_VALUE;
                    for(int j = 0; j < finalArray.length; j++)
                    {
                      if(finalArray[j] > massimo)
                          massimo = finalArray[j];
                    }
                    synchronized (max)
                    {
                        if(massimo > max.get())
                            max.set(massimo);
                    }
                    synchronized (object)
                    {
                        object.notify();
                    }
                }
            };
            threadList.add(t);
            t.start();
            synchronized (x)
            {
                x.wait();
            }
        }
        return max.get();
    }


    public static void main(String[] args) throws InterruptedException {
        int [][] arr = { {23, 23, 45, 2, 4}, {-10, 323, 33, 445, 4}, {12, 44, 90, 232, 122}};
        System.out.println(concurrentMax(arr));
    }
}