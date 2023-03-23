import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static <T> void reverseList(List<T> list)
    {
        if(list == null || list.size() <= 1)
            return;
        T tmp = list.remove(0);
        reverseList(list);
        list.add(tmp);
    }
    public static void main(String[] args)
    {
        List<Integer> interi = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverseList(interi);
        System.out.println(interi);
    }
}