import java.util.*;
public class Main {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Ciao!");
            }
        };
        new PeriodTask(r, 2000);

    }
}