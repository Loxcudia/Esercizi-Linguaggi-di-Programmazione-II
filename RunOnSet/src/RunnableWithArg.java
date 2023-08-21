/*
Un oggetto RunnableWithArg è simile ad un oggetto Runnable, tranne per il fatto che il suo metodo
run accetta un argomento
 */
public interface RunnableWithArg<T> {
    void run(T x);
}