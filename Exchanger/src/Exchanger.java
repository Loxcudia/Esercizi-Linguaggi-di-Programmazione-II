import java.util.concurrent.atomic.AtomicBoolean;
import java.util.*;
public class Exchanger<T> {

    private T object;

    private AtomicBoolean first;

    public Exchanger()
    {
        this.object = null;
        this.first = new AtomicBoolean(false);
    }

    public T exchange(T obj)
    {
        if(!this.first.get())
        {
            this.first.set(true);
            while(this.first.get()) {}
            return obj;
        }
        else
        {
            this.first.set(false);
            return obj;
        }
    }
}
