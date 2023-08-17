import java.util.*;
public class Main {
/*
Implementare il metodo statico countByType che, data una lista di oggetti, stampa a video il
numero di oggetti contenuti nella lista, divisi in base al loro tipo effettivo.
Attenzione: il metodo deve funzionare con qualunque tipo di lista e di oggetti contenuti.
*/
    public static <T> void countByType(List<T> list)
    {
        Set<Object> classes = new HashSet<>();
        Map<Object, Integer> classesMap = new HashMap<>();
        for (T x: list)
            classes.add(x.getClass());
        for(Object x : classes)
            classesMap.put(x, 0);
        for(Object x : classes)
        {
            Integer counter = 0;
            for(T y : list)
            {
                if(x == y.getClass())
                    counter++;
            }
            classesMap.put(x, counter);
        }
        for(Object x : classesMap.keySet())
        {
            Integer value = classesMap.get(x);
            System.out.println(x);
            System.out.print(":");
            System.out.print(value);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        List<Number> l = new LinkedList<Number>();
        l .add(new Integer(3));
        l .add(new Double(4.0));
        l .add(new Float(7.0f));
        l .add(new Integer(11));
        countByType(l);

    }
}