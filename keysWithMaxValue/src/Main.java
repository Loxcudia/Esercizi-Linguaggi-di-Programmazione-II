import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    <S> Set<S> keysWithMaxValue (Map<S, Integer> map)
    {
        List<Integer> values = new ArrayList<Integer>();
        values = (List<Integer>) map.values();
        values.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        Integer max = values.get(values.size() - 1);
        Set<S> keysMax = new TreeSet<S>();
        for(Map.Entry<S, Integer> entry : map.entrySet())
        {
            if(entry.getValue().compareTo(max.intValue()) == 0)
                keysMax.add(entry.getKey());
        }
        return keysMax;
    }

}