import java.util.*;
public class MutexWithLog {

    private Thread thread;

    final private Object object;

    public MutexWithLog()
    {
       this.thread = null;
       this.object = new Object();
    }

    public void lock(){
        if(this.thread != null)
        {
            while(this.thread != null) {}
        }
        this.thread = Thread.currentThread();
        System.out.print(Thread.currentThread().getName());
        System.out.println("Ha acquisito il lock");
    }

    public void unlock()
    {
        if(Thread.currentThread() != this.thread)
            throw new IllegalCallerException();
        System.out.print(Thread.currentThread().getName());
        System.out.println("Ha rilasciato il lock");
        this.thread = null;
    }
}
