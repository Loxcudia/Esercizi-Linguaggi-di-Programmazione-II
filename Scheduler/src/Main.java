import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scheduler s = new Scheduler();
        s.addTask(() -> { System.out.println("world!"); }, 10);
        s.addTask(() -> { System.out.print("Hello␣"); }, 20);
        s.start () ;
    }
}