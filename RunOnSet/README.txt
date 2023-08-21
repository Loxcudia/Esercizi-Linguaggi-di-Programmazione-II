Si consideri la seguente interfaccia.
public interface RunnableWithArg<T> {
void run(T x);
}
Un oggetto RunnableWithArg è simile ad un oggetto Runnable, tranne per il fatto che il suo metodo
run accetta un argomento.
Si implementi una classe RunOnSet che esegue il metodo run di un oggetto RunnableWithArg su
tutti gli oggetti di una data collezione, contemporaneamente.