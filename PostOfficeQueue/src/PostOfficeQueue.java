import java.util.concurrent.*;

public class PostOfficeQueue {

    private BlockingQueue<Integer> sportelli;

    public PostOfficeQueue(int n)
    {
        sportelli = new ArrayBlockingQueue<>(n);
    }

    public void deskStart(Integer i) throws InterruptedException {
        try
        {
            if(!this.sportelli.contains(i))
                this.sportelli.put(i);
        }
        catch (InterruptedException e){
            System.out.println("Interrupted Exception");
        }
    }

    public void deskFinish(Integer i)
    {
        this.sportelli.remove(i);
    }

    public int getFreeDesk()
    {
        for (int i = 0; ; i++)
        {
            if(!this.sportelli.contains(i))
                return i;
        }
    }
}
