import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static double[] sumAndMax(double[] array) {
        double[] sumAndMax = new double[2];
        sumAndMax[1] = Double.MIN_VALUE;
        AtomicBoolean bool = new AtomicBoolean(false);
        Thread t1 = new Thread() {
            @Override
            public void run()
            {
                for(int i = 0; i < array.length)
                {
                    if(array[i] > sumAndMax[1])
                        sumAndMax[i] = array[i];
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < array.length; i++) {
                    sumAndMax[0] += array[i];
                    if (sumAndMax[0] == Double.POSITIVE_INFINITY || sumAndMax[0] == Double.NEGATIVE_INFINITY) {
                        if(t1.isAlive())
                        {
                            t1.interrupt();
                            bool.set(true);
                        }
                    }
                }
            }
        };

        t1.start();
        t2.start();
        while(t1.isAlive() || t2.isAlive())
        {
            if(bool.get())
                return null;
        }
        return sumAndMax;
    }


    public static void main(String[] args) {


    }
}