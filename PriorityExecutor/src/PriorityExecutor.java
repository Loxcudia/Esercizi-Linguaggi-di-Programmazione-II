import java.util.*;
public class PriorityExecutor extends Thread{

    class Pair
    {
        private Runnable runnable;
        private Integer priority;

        private Pair(Runnable r, Integer p)
        {
            this.runnable = r;
            this.priority = p;
        }
    }

    private List<Pair> runnables;

    public PriorityExecutor()
    {
        this.runnables = new ArrayList<>();
        this.runnables = Collections.synchronizedList(this.runnables);
    }

    public void addTask(Runnable r, int n)
    {
        Pair p = new Pair(r, n);
        runnables.add(p);
        runnables.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.priority > o2.priority)
                    return 1;
                if(o2.priority < o2.priority)
                    return -1;
                return 0;
            }
        });
    }

    @Override
    public void run()
    {
        while(runnables.size() > 0)
        {
            runnables.get(runnables.size() - 1).runnable.run();
            runnables.remove(runnables.size() - 1);
        }
    }

}
