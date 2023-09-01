import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static java.lang.Math.*;

public class Elevator {

    private int plansNumber;

    private int currentPlan;

    private BlockingQueue<Integer> calls;

    private Thread t;

    public Elevator(int n)
    {
        this.plansNumber = n;
        this.currentPlan = 0;
        this.calls = new ArrayBlockingQueue<>(n);
        this.t = new Thread()
        {
            @Override
            public void run()
            {
                for (Integer n : calls)
                {
                    if(n == currentPlan)
                        System.out.println("L'ascensore è già qui");
                    System.out.print("L'ascensore sta lasciando il piano ");
                    System.out.println(currentPlan);
                    try {
                        Thread.sleep(2000 * abs(n - currentPlan));
                    } catch (InterruptedException e) {
                        return;
                    }
                    System.out.print("L'ascensore è arrivato al piano ");
                    System.out.println(n);
                    currentPlan = n;
                }
            }
        };
    }

    public void call(int plan) throws InterruptedException {
        if(plan < 0 || plan > this.plansNumber)
            throw new IllegalArgumentException();
        if(this.calls.isEmpty())
            this.t.start();
        if(!this.calls.contains(plan))
            this.calls.put(plan);
    }
}
