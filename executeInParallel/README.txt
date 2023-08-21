Implementare il metodo statico executeInParallel, che accetta come argomenti un array di
oggetti di tipo Runnable e un numero naturale k, ed esegue tutti i Runnable dell'array, k alla volta.
In altre parole, all'inizio il metodo fa partire in parallelo i primi k Runnable dell'array.
Poi, non appena uno dei Runnable in esecuzione termina, il metodo ne fa partire un altro, preso
dall'array, fino ad esaurire tutto l'array.
Risolvere l'esercizio senza utilizzare attesa attiva.