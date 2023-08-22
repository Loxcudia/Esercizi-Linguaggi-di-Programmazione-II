Implementare il metodo statico threadRace, che accetta due oggetti Runnable come
argomenti, li esegue contemporaneamente e restituisce 1 oppure 2, a seconda di quale dei
due Runnable è terminato prima.
Implementare due versioni che differiscono per il criterio di terminazione:
1) il metodo termina quando entrambi i Runnable terminano
2) il metodo termina quando almeno un Runnable è terminato