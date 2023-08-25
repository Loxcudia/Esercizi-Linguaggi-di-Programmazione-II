import java.util.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        PeriodicExecutor exec = new PeriodicExecutor(2);
        Runnable r1 = () -> {System.out.println("Rafa");};
        Runnable r2= () -> {System.out.println("Marcuzzo");};
        Runnable r3 = () -> {System.out.println("Peppe");};
        exec.addTask(r1, 1000);
        exec.addTask(r2, 500);
        exec.addTask(r3, 700);
    }
}