import java.util.*;
import java.util.concurrent.atomic.*;

public class PeriodTask {

    private Thread thread;
    private AtomicLong totalTime;


    public PeriodTask(Runnable r, long ms)
    {
        totalTime = new AtomicLong(0);
        thread = new Thread()
        {
            private long milliseconds = ms;
            private Runnable runnable = r;
            @Override
            public void run()
            {
                while(true)
                {
                    runnable.run();
                    try {
                        Thread.sleep(milliseconds);
                    } catch (InterruptedException e) {
                        return;
                    }
                    totalTime.set(totalTime.get() + milliseconds);
                }
            }
        };
        thread.start();
    }

    public long getTotalTime()
    {
        return this.totalTime.get();
    }

}
