public class Main {

    public static void executeWithDeadline(Runnable r, long ms)
    {
        Thread t = new Thread(r);
        Thread k = new Thread(() -> {
            System.out.println(ms);
            try {

                Thread.sleep(ms);
            } catch (InterruptedException e) {
                System.out.println("eccezione");
                return;
            }
            System.out.println("Sono il thread k e ho finito di contare");
        });
        t.start();
        k.start();
        while(t.isAlive())
        {
            System.out.println("debug");
            if(!k.isAlive())
            {
                t.interrupt();
                return;
            }
        }
        if(k.isAlive())
            k.interrupt();
    }

    public static void main(String[] args) {
        Runnable r = () -> {for(;;) {System.out.println("we");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                return;
            }
        }};
        executeWithDeadline(r, 5);
    }
}