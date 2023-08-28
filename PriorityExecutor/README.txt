Un PriorityExecutor è un thread che esegue in sequenza una serie di task, in ordine di priorità. Il
metodo addTask accetta un Runnable e una priorità (numero intero) e lo aggiunge ad una coda
di task. Quando il PriorityExecutor è libero (cioè, non sta eseguendo alcun task), preleva dalla
coda uno dei task con priorità massima e lo esegue.