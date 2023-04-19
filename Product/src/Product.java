import java.util.Comparator;
import java.util.*;

public class Product implements Comparable<Product> {
    private String descrizione;
    private Double prezzo;

    static Comparator<Product> comparatorByPrice = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
          return (int)(o1.prezzo - o2.prezzo);
        }
    };

    private static SortedSet<Product> pairs = new TreeSet<Product>(comparatorByPrice);

    public Product(String descrizione, Double prezzo)
    {
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        pairs.add(this);
    }

    public int compareTo(Product o) {
        if (descrizione.compareTo(o.descrizione) > 0)
            return 1;
        if (descrizione.compareTo(o.descrizione) < 0)
            return -1;
        return 0;
    }

    public static Product getMostExpensive()
    {
       return pairs.last();
    }

    @Override
    public String toString()
    {
        return this.descrizione + "," + this.prezzo;
    }
}
