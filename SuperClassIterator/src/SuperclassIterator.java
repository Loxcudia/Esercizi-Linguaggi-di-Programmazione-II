import java.util.*;
public class SuperclassIterator<T> implements Iterator<T>{

    private T object;

    private Object x;
    private Class<?> current;
    public SuperclassIterator(T obj)
    {
        this.object = obj;
        this.current =  object.getClass();
        this.x = new Object();
    }

    @Override
    public boolean hasNext() {
        if(this.current == null) return false;
        return this.current.getSuperclass() != null || this.current == this.x.getClass();
    }

    @Override
    public T next() {
        T data = (T) this.current;
        this.current = this.current.getSuperclass();
        if(data != null)
            return data;
        else
        {
            if(data.getClass() == this.x.getClass())
                return (T) this.x.getClass();
        }
        return null;
    }
}
