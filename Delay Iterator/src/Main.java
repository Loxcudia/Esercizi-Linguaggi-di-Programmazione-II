/*
Implementare un metodo statico delayIterator che prende come argomenti un iteratore “i” ed un
numero intero “n”, e restituisce un nuovo iteratore dello stesso tipo di “i”, che restituisce gli stessi
elementi di “i”, ma in cui ogni elemento viene restituito (dal metodo next) dopo un ritardo di “n”
secondi.
 */

import java.util.*;
public class Main {

    public static <T> Iterator<T> delayIterator(Iterator<T> iterator, Integer n)
    {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public T next() {
                try {
                    Thread.sleep(n);
                } catch (InterruptedException e) {
                    return null;
                }

                return iterator.next();
            }
        };
    }

    public static void main(String[] args) {
        List<Integer> l = new LinkedList<Integer>();
        l.add(3);
        l.add(4);
        l.add(177);
        Iterator<Integer> i = delayIterator(l.iterator(), 2000);
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}