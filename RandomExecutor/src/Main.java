
public class Main {
    public static void main(String[] args) throws InterruptedException {RandomExecutor e = new RandomExecutor();
        Runnable r1 = () -> { System.out.println(1); };
        Runnable r2 = () -> { System.out.println(2); };
        Runnable r3 = () -> { System.out.println(3); };
        e.addTask(r1);
        e.addTask(r2);
        e.addTask(r3);
        e.launch();
        e.join (r2) ;
    }
}