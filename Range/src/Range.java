import java.util.*;
public class Range<T extends Comparable<T>>{

    private List<T> intervallo;
    private T min;
    private T max;

    public Range(T minimo, T massimo)
    {
        this.min = minimo;
        this.max = massimo;
        intervallo = new ArrayList<T>();
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Range<T> t = (Range<T>) obj;
        return this.max == t.max && this.min == t.min;
    }

    @Override
    public int hashCode()
    {
        return 0;
    }

    public boolean isInside(T x)
    {
       if(x.compareTo(max) > 0)
           return false;
       else if(x.compareTo(min) < 0)
           return false;
       return true;
    }

    public boolean isOverlapping(Range <T> x)
    {
        for (T  n: this.intervallo)
        {
            for (T m: x.intervallo)
            {
                if(n.compareTo(m) == 0)
                    return true;
            }
        }
        return false;
    }
}
