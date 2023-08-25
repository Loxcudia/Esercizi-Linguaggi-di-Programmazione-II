Realizzare la classe PeriodicExecutor, che consente di eseguire una serie di task periodicamente,
con un limite al numero di task che possono essere eseguiti contemporaneamente. Il costruttore
accetta questo limite. Il metodo addTask accetta un Runnable e un long x, e fa in modo che il Run-
nable venga eseguito ripetutamente, con un ritardo di x millisecondi tra la fine di un’esecuzione
e l’inizio della successiva.
Se però (ri)avviare un Runnable porta a superare il limite, l’avvio viene rimandato finché ci sarà
la possibilità di eseguirlo senza violare il limite.
Il limite si riferisce al numero di task che stanno eseguendo il loro Runnable, non al periodo
durante il quale stanno aspettando il ritardo x.