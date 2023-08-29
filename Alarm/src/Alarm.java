import java.util.concurrent.atomic.AtomicBoolean;
import java.util.*;
public class Alarm {

    private long timeout;

    private Map<Thread, Boolean> flagsMap;

    public Alarm(long timeout)
    {
        this.timeout = timeout;
        String tmp = timeout + "0" + "0" + "0";
        this.timeout = Long.parseLong(tmp);
        this.flagsMap = new HashMap<>();
        this.flagsMap = Collections.synchronizedMap(this.flagsMap);
    }

    public void anomalyStart()
    {
        Thread current = Thread.currentThread();
        this.flagsMap.put(Thread.currentThread(), false);
        Thread t = new Thread()
        {
            private Thread thread = current;

            @Override
            public void run()
            {
                try {
                    Thread.sleep(timeout);
                } catch (InterruptedException e) {
                    return;
                }
                if(!flagsMap.get(thread))
                    System.out.println("Allarme!");
            }
        };
        t.start();
    }

    public void anomalyEnd()
    {
        this.flagsMap.put(Thread.currentThread(), true);
    }
}
