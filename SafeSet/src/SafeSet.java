import java.util.*;
public class SafeSet<T> {

    private Set<T> set;

    private Map<T, Integer> removeFlags;

    public SafeSet()
    {
        this.set = new HashSet<>();
        this.set = Collections.synchronizedSet(this.set);
        this.removeFlags = new HashMap<>();
        this.removeFlags = Collections.synchronizedMap(this.removeFlags);
    }

    public boolean add(T obj)
    {
        this.removeFlags.put(obj, 0);
        return this.set.add(obj);
    }

    public boolean remove(T obj)
    {
        int n = this.removeFlags.get(obj) + 1;
        this.removeFlags.put(obj, n);
        if(n == 2)
        {
            this.set.remove(obj);
            this.removeFlags.remove(obj);
            return true;
        }
        return false;
    }

    public boolean contains(T obj)
    {
        return this.set.contains(obj);
    }
}
