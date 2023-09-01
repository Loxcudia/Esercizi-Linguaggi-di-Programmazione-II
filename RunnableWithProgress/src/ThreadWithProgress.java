public class ThreadWithProgress extends Thread{

    private RunnableWithProgress runnableWithProgress;

    public ThreadWithProgress(RunnableWithProgress r)
    {
        this.runnableWithProgress = r;
    }

    @Override
    public void run()
    {
        Thread t = new Thread(() -> runnableWithProgress.run());
        t.start();
        int tmp = 0;
        while(runnableWithProgress.getProgress() < 100 && t.isAlive())
        {
            if(tmp == runnableWithProgress.getProgress())
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("eccezione");
                    return;
                }
            }
            else
            {
                System.out.println(runnableWithProgress.getProgress());
                tmp = runnableWithProgress.getProgress();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("eccezione");
                    return;
                }
            }
        }
    }
}
