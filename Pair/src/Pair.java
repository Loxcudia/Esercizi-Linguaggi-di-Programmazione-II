public class Pair <T,S> {
    private T oggetto1;
    private S oggetto2;

    public Pair(T oggetto1, S oggetto2)
    {
        this.oggetto1 = oggetto1;
        this.oggetto2 = oggetto2;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Pair tmp = (Pair<T,S>) obj;
        return this.oggetto1.equals(((Pair<?, ?>) obj).oggetto1) && this.oggetto2.equals(((Pair<?, ?>) obj).oggetto2);
    }

    @Override
    public String toString()
    {
        return "(" + oggetto1.toString() + "," + oggetto2.toString() + ")";
    }

    @Override
    public int hashCode()
    {
        return this.oggetto1.hashCode() ^ this.oggetto2.hashCode();
    }
}
