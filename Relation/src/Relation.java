import java.util.*;
public class Relation <S ,T>{

    Set<Pair> coppie;

    public Relation()
    {
        this.coppie = new HashSet<Pair>();
    }
    public void put(S x, T y)
    {
        Pair tmp = new Pair(x, y);
        coppie.add(tmp);
    }

    public void remove(S x, T y)
    {
        Pair tmp = new Pair(x,y);
        this.coppie.remove(tmp);
    }

    public Set<T> image(S x)
    {
        Set<T> tmp = new HashSet<T>();
        for (Pair a: this.coppie)
        {
            if(x == a.x)
                tmp.add(a.y);
        }
        return tmp;
    }

    public Set<S> preImage(T y)
    {
        Set<S> tmp = new HashSet<S>();
        for (Pair a: this.coppie)
        {
            if(y == a.y)
                tmp.add(a.x);
        }
        return tmp;
    }
    class Pair
    {
        private S x;
        private T y;

        private Pair(S x, T y)
        {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj)
        {
            if(obj == null)
                return false;
            if(getClass() != obj.getClass())
                return false;
            Pair tmp = (Pair) obj;
            return this.x == ((Pair) obj).x && this.y == ((Pair) obj).y;
        }

        @Override
        public int hashCode()
        {
            return 0;
        }
    }

}
