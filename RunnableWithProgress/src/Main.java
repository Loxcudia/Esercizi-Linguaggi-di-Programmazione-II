
public class Main {
    public static void main(String[] args) {
        RunnableWithProgress r = new RunnableWithProgress()
        {

            private int n = 0;

            @Override
            public void run() {
                while(this.n <= 100)
                {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        return;
                    }
                    this.n = this.n + 10;
                }
            }

            @Override
            public int getProgress() {
                return this.n;
            }
        };
        Thread t = new ThreadWithProgress(r);
        t.start () ;
    }
}