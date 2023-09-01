Si consideri la seguente interfaccia.
public interface RunnableWithProgress extends Runnable {
int getProgress() ;
}
Un oggetto RunnableWithProgress rappresenta un oggetto Runnable, che in più dispone di un
metodo che restituisce la percentuale di lavoro completata dal metodo run fino a quel momento.
Si implementi una classe ThreadWithProgress che esegua un oggetto RunnableWithProgress mo-
strando ad intervalli regolari la percentuale di lavoro svolto fino a quel momento. Precisamente,
ThreadWithProgress deve stampare a video ogni secondo la percentuale di lavoro aggiornata, a
meno che la percentuale non sia la stessa del secondo precedente, nel qual caso la stampa viene
saltata.