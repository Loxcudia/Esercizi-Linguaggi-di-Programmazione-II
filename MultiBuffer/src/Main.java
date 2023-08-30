import java.util.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MultiBuffer<Integer> mb = new MultiBuffer<Integer>(3);
        mb.insert(13);
        mb.insert(24);
        mb.insert(35);
        System.out.println(mb.take(0));
        System.out.println(mb.take(1));
        System.out.println(mb.take(2));
    }
}