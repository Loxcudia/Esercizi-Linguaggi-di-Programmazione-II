import java.util.*;
public class Main {
    public static void main(String[] args) {
        Collection<Integer> s = new HashSet<Integer>();
        s.add(3); s.add(13); s.add(88);
        RunnableWithArg<Integer> r = new RunnableWithArg<Integer>() {
            public void run(Integer i) {
                System.out.println(i/2);
            }
        };
        Thread t = new RunOnSet<Integer>(r, s);
        t.start();
    }
}