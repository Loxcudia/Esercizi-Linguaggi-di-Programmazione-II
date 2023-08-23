import java.util.*;
public class Main {
    public static void main(String[] args) {
        Integer n = 1;
        Iterator <Class<?>> i = new SuperclassIterator(n);
        while (i.hasNext())
            System.out.println( i .next()) ;
    }
}