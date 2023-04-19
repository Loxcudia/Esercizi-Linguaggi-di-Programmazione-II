import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public <E> Set<E> disjoin(Collection<E> a, Collection<E> b)
    {
        Set<E> set = new HashSet<E>();
        for (E x: a)
        {
            if(a.contains(x))
            {
                a.remove(x);
                b.remove(x);
            }
            else
                set.add(x);
        }
        return set;
    }
}