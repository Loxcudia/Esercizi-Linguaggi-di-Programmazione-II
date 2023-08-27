public class BlockingArray<T> {
    private T[] array;

    public BlockingArray(int dim)
    {
        this.array = (T[])(new Object[dim]);
        for(int i = 0; i < array.length; i++)
            array[i] = null;
    }

    public synchronized void put(int i, T x)
    {
        while(array[i] != null) {}
        array[i] = x;
    }

    public synchronized T take(int i)
    {
        while(array[i] == null) {}
        return array[i];
    }

}
