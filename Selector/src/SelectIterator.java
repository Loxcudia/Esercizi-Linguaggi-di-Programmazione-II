import java.util.*;

public class SelectIterator<T> implements Iterator<T>
{
    private List<T> collection;
    private Selector<T> selector;
    private int cursor = 0;

    public SelectIterator(List<T> collection, Selector<T> selector)
    {
        this.collection = collection;
        this.selector = selector;
    }

    @Override
    public boolean hasNext() {
       int tmp = cursor;
       for(int i = tmp; i < collection.size() - 1; i++)
       {
           if(selector.select(collection.get(i)))
           {
               return true;
           }
       }
       return false;
    }

    @Override
    public T next() {
        for(int i = cursor + 1; i < collection.size(); i++)
        {
            if(selector.select(collection.get(i)))
            {
                this.cursor = i;
                return collection.get(i);
            }
        }
        return null;
    }
}