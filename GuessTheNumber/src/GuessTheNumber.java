/*
Realizzare la classe GuessTheNumber, che consente a diversi thread di indovinare un numero
segreto. Il costruttore accetta il numero da indovinare (int) e la durata del quiz, in millisecondi
(long). Il metodo guessAndWait consente ad un thread di proporre una soluzione (int), poi attende
fino alla fine del quiz, ed infine restituisce true se questo è il thread che si è avvicinato di più alla
soluzione, e false altrimenti.
 */
import java.util.*;
public class GuessTheNumber{

    private Integer number;

    private Long milliseconds;

    private Map<Thread, Integer> solutionsMap;

    private Thread t;

    public GuessTheNumber(Integer number, Long milliseconds) throws InterruptedException {
        this.number = number;
        this.milliseconds = milliseconds;
        this.solutionsMap = new HashMap<>();
        t = new Thread()
        {
            @Override
            public void run()
            {
                try {
                    t.sleep(milliseconds);
                } catch (InterruptedException e) {
                    return;
                }
            }
        };
        t.start();
    }

    public boolean guessAndWait(Thread thread, int solution) throws InterruptedException {
        solutionsMap.put(thread, Math.abs(number - solution));
        try {
            t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Eccezione");
            return false;
        }
        if(solutionsMap.get(thread) == 0)
            return true;
        Integer min = 1;
        for (Thread x : solutionsMap.keySet())
        {
            if(Math.abs(number - solutionsMap.get(x)) <= min)
                min = Math.abs(number - solutionsMap.get(x));
        }
        System.out.println(min);
        if(min == Math.abs(number - solution))
            return true;
        else
            return false;
    }


}
