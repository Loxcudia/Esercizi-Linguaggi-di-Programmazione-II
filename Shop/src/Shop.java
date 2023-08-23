/*
Implementare la classe thread-safe Shop<T> che rappresenta un negozio di oggetti di tipo T, e
fornisce i seguenti metodi:
• public void sell(T object, int price)
Mette in vendita un oggetto ad un dato prezzo
• public T buy(int offer)
Mette in attesa il chiamante finché non ci sia un oggetto in vendita il cui prezzo è inferiore
o uguale all’offerta; a quel punto rimuove quell’oggetto dalla vendita e lo restituisce al
chiamante
Nota: se viene invocato due volte sell con lo stesso oggetto, senza che sia stato venduto nel
frattempo, il secondo prezzo deve sostituire il primo.
 */
import java.util.*;
public class Shop <T>{

    private Hashtable<T, Integer> products;

    public Shop()
    {
        this.products = new Hashtable<>();
    }

    public void sell(T object, int price)
    {
        products.put(object, price);
    }

    public T buy(int offer)
    {
       while(true)
       {
           for (T x : products.keySet())
           {
               if(products.get(x) <= offer)
               {
                   products.remove(x);
                   return x;
               }
           }
       }
    }
}
