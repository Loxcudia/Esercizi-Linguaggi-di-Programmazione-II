Realizzare la classe PeriodicTask, che consente di eseguire un Runnable periodicamente, ad inter-
valli specificati. Il costruttore accetta un oggetto Runnable r e un numero di millisecondi p, detto
periodo, e fa partire un thread che esegue r.run() ogni p millisecondi (si noti che il costruttore
non è bloccante). Il metodo getTotalTime restituisce il numero complessivo di millisecondi che
tutte le chiamate a r.run() hanno utilizzato fino a quel momento.