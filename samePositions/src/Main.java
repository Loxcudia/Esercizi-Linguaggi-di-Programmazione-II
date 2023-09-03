import java.util.*;
public class Main {

    public static int samePositions(List<?> list1, List<?> list2)
    {
        if(list1.size() != list2.size())
            throw new IllegalArgumentException();
        int counter = 0;
        Iterator<?> iterator1 = list1.iterator();
        Iterator<?> iterator2 = list2.iterator();
        while(iterator1.hasNext())
        {
            if(iterator1.next().equals(iterator2.next()))
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> l2 = Arrays.asList(4,5,6,7,5);
        System.out.println(samePositions(l1,l2));
    }
}