public class Scheduler {

    private Runnable[] runnables;

    public Scheduler()
    {
        this.runnables = new Runnable[1000];
    }

    public void addTask(Runnable r, Integer n)
    {
        if(n < 0)
            throw new IllegalArgumentException();
        this.runnables[n] = r;
    }

    public void start()
    {
        for(int i = runnables.length - 1; i >= 0; i--)
        {
            if(this.runnables[i] != null)
            {
                Thread t = new Thread(runnables[i]);
                t.start();
                while(t.isAlive()) {}
            }
        }
    }

}
