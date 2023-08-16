import java.lang.reflect.Field;
import java.util.*;
public class Main {

    //Implementare un metodo, chiamato reset, che prende come argomento un oggetto ed imposta a
    //zero tutti i suoi campi interi pubblici
    public void reset(Object x) throws IllegalAccessException {
        Field[] campi = x.getClass().getFields();
        for(int i = 0; i < campi.length; i++)
        {
            if(campi[i].getType() == Integer.class || campi[i].getType() == int.class)
                campi[i].setInt(x, 0);
        }
    }

    //Implementare un metodo che, dato un oggetto, parte dalla classe che rappresenta il tipo effettivo
    //dell'oggetto e ne restituisce la superclasse più generale, escludendo Object (quindi, la penultima classe,
    //prima di arrivare a Object)
    public <T> Class<? super T> mostGenericSuperClass(T x)
    {
        Object superclass =  x.getClass();
        while(true)
        {
            if(superclass.getClass().getSuperclass() == null)
                return (Class<? super T>) superclass.getClass();
            else
                superclass = superclass.getClass().getSuperclass();
        }
    }


    public static void main(String[] args) {

        }
    }