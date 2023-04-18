
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public <T> Comparator<T> combine(Comparator<T> a, Comparator<T> b)
    {
        return new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                Integer x = a.compare(o1,o2);
                if(x == 0)
                    return x;
                else
                    return b.compare(o1,o2);
                }
            };
    }
}
