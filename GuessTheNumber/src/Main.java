
public class Main {
    public static void main(String[] args) throws InterruptedException {
        GuessTheNumber g = new GuessTheNumber(3, (long)5000);
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                try {
                    System.out.println(g.guessAndWait(this, 2));
                } catch (InterruptedException e) {
                   return;
                }
            }
        };
        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                try {
                    System.out.println(g.guessAndWait(this, 1));
                } catch (InterruptedException e) {
                    return;
                }
            }
        };
        t1.start();
        t2.start();
    }
}