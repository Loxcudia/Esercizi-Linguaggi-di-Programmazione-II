import java.util.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MultiQueue<String> q = new MultiQueue<>(3);
        q.add("uno");
        q.add("due");
        q.add("tre");
        q.add("quattro");
        String s = q.get(0);
        System.out.println(s);
    }
}