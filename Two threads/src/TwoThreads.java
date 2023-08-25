import java.util.*;
public class TwoThreads {

    private Thread a;

    private Thread b;

    private List<Integer> list;
    public TwoThreads()
    {
        this.list = new ArrayList<>();
        this.list = Collections.synchronizedList(this.list);


        this.a = new Thread()
        {
            @Override
            public void run()
            {
                int n = 101;
                while(100 % n != 0)
                {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        return;
                    }
                    Random r = new Random();
                    n = r.nextInt();
                    list.add(n);
                }
                System.out.println("Ho trovato un multiplo di 100");
            }
        };


        this.b = new Thread()
        {
            @Override
            public void run()
            {
                int sum = 0;
                while(a.isAlive())
                {
                    sum = 0;
                    for (Integer x : list) {sum = sum + x;}
                }
                System.out.print("Somma: ");
                System.out.println(sum);
            }
        };


    }
}
