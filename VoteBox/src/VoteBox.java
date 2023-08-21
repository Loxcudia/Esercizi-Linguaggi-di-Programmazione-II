/*
Si implementi la classe VoteBox, che rappresenta un'urna elettorale, tramite la quale diversi
thread possono votare tra due alternative, rappresentate dai due valori booleani.
Il costruttore accetta il numero totale n di thread aventi diritto al voto.
La votazione termina quando n thread diversi hanno votato. In caso di pareggio, vince il valore
false.
Metodi:
● Il metodo vote, con parametro boolean e nessun valore di ritorno, permette ad un thread di
votare, e solleva un'eccezione se lo stesso thread tenta di votare più di una volta.
● Il metodo waitForResult, senza argomenti e con valore di ritorno booleano, restituisce il
risultato della votazione, mettendo il thread corrente in attesa se la votazione non è ancora
terminata.
● Infine, il metodo isDone restituisce true se la votazione è terminata, e false altrimenti.
E' necessario evitare attesa attiva e race condition.
 */
import java.util.*;
public class VoteBox {
    private Set<Thread> threads;

    private Map<Thread, Boolean> votes;

    private Integer threadsNumber;

    private Integer trueVotes;

    private Integer falseVotes;

    public VoteBox(Integer n)
    {
        this.threadsNumber = n;
        threads = new HashSet<>();
        this.trueVotes = 0;
        this.falseVotes = 0;
        votes = new HashMap<>();
    }

    public synchronized void vote(boolean boo)
    {
        if(threads.contains(Thread.currentThread()))
        {
            throw new IllegalCallerException();
        }
        else
        {
            if(trueVotes + falseVotes <= threadsNumber - 1)
            {
                threads.add(Thread.currentThread());
                if(boo)
                {
                    trueVotes++;
                    votes.put(Thread.currentThread(), true);
                }
                else
                {
                    falseVotes++;
                    votes.put(Thread.currentThread(), false);
                }
            }
            else
            {
                throw new IllegalCallerException();
            }
        }
    }


    public boolean waitForResult() throws InterruptedException {
        if (votes.keySet().contains(Thread.currentThread()))
            return votes.get(Thread.currentThread());
        else
        {
            while(!votes.keySet().contains(Thread.currentThread()))
            {
                try
                {
                    this.wait();
                }
                catch(InterruptedException e)
                {
                    return false;
                }
            }
            this.notify();
            return votes.get(Thread.currentThread());
    }
        }
    public boolean isDone()
    {
        return votes.keySet().contains(Thread.currentThread());
    }
}




