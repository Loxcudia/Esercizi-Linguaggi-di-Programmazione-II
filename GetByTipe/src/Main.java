import java.util.*;
public class Main {


    //Implementare il metodo statico getByType che, data una collezione c (Collection) ed un oggetto
    //x di tipo Class, restituisce un oggetto della collezione il cui tipo effettivo sia esattamente x. Se
    //un tale oggetto non esiste, il metodo restituisce null.
    //Prestare particolare attenzione alla scelta della firma del metodo. Si ricordi che la classe Class è
    //parametrica.
    public static <T,Y> Y getByTipe(Collection<Y> collection, Class<T> x)
    {
        for (Y y: collection)
        {
            if(y.getClass() == x)
                return y;
        }
        return null;
    }


    public static void main(String[] args) {

    }
}