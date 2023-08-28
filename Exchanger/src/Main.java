import java.util.*;
public class Main {
    public static void main(String[] args) {

        Exchanger<String> e = new Exchanger<>();
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                String a = e.exchange("ciao");
                System.out.println(a);
            }
        };

        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                String a = e.exchange("Pippo");
                System.out.println(a);
            }
        };
        t1.start();
        t2.start();

    }
}