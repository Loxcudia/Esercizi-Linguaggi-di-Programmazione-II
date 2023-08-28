public class Main {
    public static void main(String[] args) {
        Runnable r1 = () -> {System.out.println("sono r1");};
        Runnable r2 = () -> {System.out.println("sono r2");};
        PriorityExecutor e = new PriorityExecutor();
        e.addTask(r2, 10);
        e.addTask(r1, 100);
        e. start () ;
        e.addTask(r2, 15);
        e.addTask(r1, 50);

    }
}