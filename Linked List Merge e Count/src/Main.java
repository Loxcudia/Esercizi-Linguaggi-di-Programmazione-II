import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> a = new LinkedList<Integer>();
        a.addAll(Arrays.asList(1,2,3,4,5));
        LinkedList<Integer> b = new LinkedList<Integer>();
        b.addAll(Arrays.asList(6,7,8,9,10));
        LinkedList<Integer> c = new LinkedList<Integer>();
        c = merge(a, b);
        System.out.println(c);
    }

    public static <T> LinkedList<T> merge(LinkedList<T> L1, LinkedList<T> L2)
    {
        if(L1.size() != L2.size())
            throw new IllegalArgumentException();
        LinkedList<T> L3  = new LinkedList<T>();
        for(int i = 0; i < L1.size(); i++)
        {
            L3.add(L1.get(i));
            L3.add(L2.get(i));
        }
        return L3;
    }

}