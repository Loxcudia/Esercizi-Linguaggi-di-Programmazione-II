import java.io.ObjectStreamException;
import java.util.*;

public class WeightedSet <T extends Object>  {
    private Set<WeightedObject<T>> mySet = new TreeSet<WeightedObject<T>>();

    private static class WeightedObject<T>
    {
        private Double weight;
        T oggetto;

        private WeightedObject(T ogg, Double w)
        {
            this.oggetto = ogg;
            this.weight = w;
        }
    }

    public void add(T ogg, Double w)
    {
        if(ogg != null)
            mySet.add(new WeightedObject<>(ogg, w));
    }

    @Override
    public String toString()
    {
        SortedSet<WeightedObject<T>> tmp = new TreeSet<>(new Comparator<WeightedObject<T>>() {
            @Override
            public int compare(WeightedObject<T> o1, WeightedObject<T> o2) {
                Double differenza = o1.weight - o2.weight;
                if(differenza.doubleValue() == 0.0)
                    return 0;
                else
                    return differenza.intValue();
            }
        });

        for(WeightedObject<T> o : mySet)
            tmp.add(o);

        String str = new String("{");

        for(WeightedObject<T> o : tmp)
            str += o.oggetto.toString() + ",";
        str += "}";
        return str;
    }

}
