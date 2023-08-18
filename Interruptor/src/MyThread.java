public class MyThread extends Thread{
    Thread other;

    public MyThread(Thread t)
    {
        this.other = t;
    }

    @Override
    public void run()
    {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            return;
        }
        other.interrupt();
        System.out.println("ok");
    }
}
