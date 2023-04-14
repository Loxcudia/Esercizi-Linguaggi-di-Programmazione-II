import java.util.*;
public class Accumulator <T extends Number>{

    private List<T> numbers = new ArrayList<T>();
    private List<T> pos = new ArrayList<T>();
    private List<T> neg = new ArrayList<T>();
    public void add (T n)
    {
        numbers.add(n);
        if(n.doubleValue() >= 0)
            pos.add(n);
        else
            neg.add(n);
    }

    public List<T> negatives()
    {
       return this.neg;
    }

    public List<T> positives()
    {
        return this.pos;
    }

    public T sum()
    {
        Double somma = 0.0;
        for(T n : numbers)
            somma = Double.sum(somma, (Double) n);
        return (T) somma;
    }
}
